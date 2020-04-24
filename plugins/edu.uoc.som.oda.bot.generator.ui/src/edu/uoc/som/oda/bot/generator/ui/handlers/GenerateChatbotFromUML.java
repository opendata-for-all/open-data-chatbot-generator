package edu.uoc.som.oda.bot.generator.ui.handlers;

import java.io.File;
import java.util.Iterator;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;

import edu.uoc.som.oda.bot.generator.ODABotGenerator;
import edu.uoc.som.oda.bot.generator.builder.ODABotGeneratorBuilder;
import edu.uoc.som.oda.bot.generator.ui.ODABotGeneratorUIPlugin;

public class GenerateChatbotFromUML extends AbstractHandler {

	public static final String ID = "edu.uoc.som.oda.bot.generator.ui.handlers.GenerateChatbotFromUML";

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		ISelection selection = HandlerUtil.getActiveWorkbenchWindow(event).getActivePage().getSelection();
		if (selection != null & selection instanceof IStructuredSelection) {
			final IStructuredSelection structuredSelection = (IStructuredSelection) selection;
			Job job = new Job(ID) {
				@Override
				protected IStatus run(IProgressMonitor monitor) {
					
					if (monitor == null)
						monitor = new NullProgressMonitor();
					try {

						monitor.beginTask("Generationg the chatbot", IProgressMonitor.UNKNOWN);

						for (Iterator<?> iterator = structuredSelection.iterator(); iterator.hasNext();) {

							Object obj = iterator.next();
							if (obj instanceof IFile) {
								IFile iFile = (IFile) obj;

								IContainer target = iFile.getProject().getFolder("src-gen");
								if (!target.getLocation().toFile().exists()) {
									target.getLocation().toFile().mkdirs();
									iFile.getProject().refreshLocal(IResource.DEPTH_INFINITE, monitor);
								}

								File inputFile = new File(iFile.getLocation().toString());
								ODABotGeneratorBuilder builder = ODABotGeneratorBuilder.newBuilder()
										.fromUML(inputFile)
										.outputFolder(target.getLocation().toFile())
										.projectName((iFile.getName().substring(0, iFile.getName().lastIndexOf('.'))));
								ODABotGenerator odaBotBuilder = builder.build();
								odaBotBuilder.generate();
								
								
								iFile.getProject().refreshLocal(IResource.DEPTH_INFINITE, monitor);
							}
						}
					} catch (Exception e) {
						e.printStackTrace();
						return new Status(IStatus.ERROR, ODABotGeneratorUIPlugin.PLUGIN_ID, e.getLocalizedMessage(),
								e.getCause());

					} finally {
						monitor.done();
					}

					return Status.OK_STATUS;
				}
			};
			job.schedule();

		}
		return null;
	}
}