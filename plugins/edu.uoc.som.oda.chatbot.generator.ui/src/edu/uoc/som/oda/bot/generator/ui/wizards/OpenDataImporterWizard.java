package edu.uoc.som.oda.bot.generator.ui.wizards;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.core.runtime.*;
import org.eclipse.jface.operation.*;
import org.eclipse.jface.resource.ImageDescriptor;

import java.lang.reflect.InvocationTargetException;
import java.net.URL;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.core.resources.*;

import java.io.*;
import org.eclipse.ui.*;
import org.eclipse.ui.ide.IDE;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

import edu.uoc.som.oda.bot.generator.ui.infra.OpenDataAPIType;
import edu.uoc.som.oda.bot.importer.OpenDataImporter;
import edu.uoc.som.oda.bot.importer.socrata.SocrataImporterBuilder;

public class OpenDataImporterWizard extends Wizard implements INewWizard {

	private OpenDataImporterWizardPage page;
	private ISelection selection;

	public OpenDataImporterWizard() {
		super();
		setNeedsProgressMonitor(true);
		Bundle bundle = FrameworkUtil.getBundle(this.getClass());
		URL url = FileLocator.find(bundle,
		    new Path("images/oda-icon-square.png"), null);
		ImageDescriptor imageDescriptor = ImageDescriptor.createFromURL(url);
		setDefaultPageImageDescriptor(imageDescriptor);
	}

	@Override
	public void addPages() {
		page = new OpenDataImporterWizardPage(selection);
		addPage(page);
	}

	@Override
	public boolean performFinish() {
		final String containerName = page.getContainerName();
		final String fileName = page.getModelName();
		final String metadataURL = page.getMetadataUrl();
		final OpenDataAPIType openDataAPIType = page.getOpenAOpenDataAPIType();
		IRunnableWithProgress op = monitor -> {
			try {
				doFinish(containerName, openDataAPIType, fileName, metadataURL, monitor);
			} catch (CoreException e) {
				throw new InvocationTargetException(e);
			} finally {
				monitor.done();
			}
		};
		try {
			getContainer().run(true, false, op);
		} catch (InterruptedException e) {
			return false;
		} catch (InvocationTargetException e) {
			Throwable realException = e.getTargetException();
			MessageDialog.openError(getShell(), "Error", realException.getMessage());
			return false;
		}
		return true;
	}

	private void doFinish(String containerName, OpenDataAPIType openDataAPIType, String fileName, String metadataURL,
			IProgressMonitor monitor) throws CoreException {

		monitor.beginTask("Importing Open Data model",2);
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		IResource resource = root.findMember(new Path(containerName));
		if (!resource.exists() || !(resource instanceof IContainer)) {
			throwCoreException("Container \"" + containerName + "\" does not exist.");
		}
		IContainer container = (IContainer) resource;
		final IFile file = container.getFile(new Path(fileName));
		try {

			OpenDataImporter openDataImporter = null;
			switch (openDataAPIType) {
			case SOCRATA:
				openDataImporter = new SocrataImporterBuilder().fromMetadataURI(metadataURL)
						.output(file.getLocation().toFile()).build();
				break;

			default:
				break;
			}
			openDataImporter.importModel();
			openDataImporter.saveResource();
			file.refreshLocal(IResource.DEPTH_ZERO, monitor);
		} catch (IOException e) {
		}
		monitor.worked(1);
		monitor.setTaskName("Opening the model for editing...");
		getShell().getDisplay().asyncExec(() -> {
			IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
			try {
				IDE.openEditor(page, file, true);
			} catch (PartInitException e) {
			}
		});
		monitor.worked(3);
	}



	private void throwCoreException(String message) throws CoreException {
		IStatus status = new Status(IStatus.ERROR, "edu.uoc.som.oda.bot.generator.ui", IStatus.OK, message, null);
		throw new CoreException(status);
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.selection = selection;
	}
}