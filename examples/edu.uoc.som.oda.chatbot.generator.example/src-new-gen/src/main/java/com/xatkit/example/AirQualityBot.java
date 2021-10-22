package com.xatkit.example;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.xatkit.core.XatkitBot;
import com.xatkit.dsl.DSL;
import com.xatkit.dsl.entity.EntityDefinitionReferenceProvider;
import com.xatkit.plugins.rest.platform.RestPlatform;
import com.xatkit.plugins.react.platform.ReactPlatform;
import com.xatkit.plugins.react.platform.io.ReactEventProvider;
import com.xatkit.plugins.react.platform.io.ReactIntentProvider;
import com.xatkit.plugins.rest.platform.utils.ApiResponse;
import lombok.val;
import org.apache.commons.configuration2.BaseConfiguration;
import org.apache.commons.configuration2.Configuration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

import static com.xatkit.dsl.DSL.composite;
import static com.xatkit.dsl.DSL.eventIs;
import static com.xatkit.dsl.DSL.fallbackState;
import static com.xatkit.dsl.DSL.intent;
import static com.xatkit.dsl.DSL.intentIs;
import static com.xatkit.dsl.DSL.mapping;
import static com.xatkit.dsl.DSL.model;
import static com.xatkit.dsl.DSL.state;

import org.apache.commons.configuration2.builder.fluent.Configurations;
import org.apache.commons.configuration2.ex.ConfigurationException;
import org.apache.commons.lang3.tuple.ImmutableTriple;

public class AirQualityBot {

    public static void main(String[] args) {

        /*
         Entities
         */

        val airQualityDataEntity = mapping("AirQualityDataEntity")
                .entry().value("Air quality data in Catalonia")
                    .synonym("air quality")
                    .synonym("air quality data")
                    .synonym("pollution data")
                ;

        val textualFilterEntity = mapping("TextualFilterEntity")
                .entry().value("Municipality")
                    .synonym("town")
                    .synonym("city")
                .entry().value("Pollutant")
                ;

        val numericFilterEntity = mapping("NumericFilterEntity")
                .entry().value("Magnitude")
                ;

        val dateFilterEntity = mapping("DateFilterEntity")
                .entry().value("Date")
                ;

        val filterEntity = composite("FilterEntity")
                .entry().entity(textualFilterEntity)
                .entry().entity(numericFilterEntity)
                .entry().entity(dateFilterEntity)
                ;

        val textualSelectFieldEntity = mapping("TextualSelectFieldEntity")
                .entry().value("Station name")
                .entry().value("Municipality")
                    .synonym("town")
                    .synonym("city")
                .entry().value("Pollutant")
                ;

        val numericSelectFieldEntity = mapping("NumericSelectFieldEntity")
                .entry().value("Magnitude")
                ;

        val dateSelectFieldEntity = mapping("DateSelectFieldEntity")
                .entry().value("Date")
                ;

        val selectFieldEntity = composite("SelectFieldEntity")
                .entry().entity(textualSelectFieldEntity)
                .entry().entity(numericSelectFieldEntity)
                .entry().entity(dateSelectFieldEntity)
                ;

        val textualOperator = mapping("TextualOperator")
                .entry().value("=")
                    .synonym("equals")
                .entry().value("contains")
                    .synonym("similar to")
                .entry().value("starts with")
                .entry().value("ends with")
                ;

        val numericOperator = mapping("NumericOperator")
                .entry().value("=")
                    .synonym("equals")
                .entry().value("<")
                    .synonym("less than")
                    .synonym("lower than")
                .entry().value("<=")
                    .synonym("less than or equals")
                    .synonym("lower than or equals")
                .entry().value(">")
                    .synonym("greater than")
                    .synonym("higher than")
                .entry().value(">=")
                    .synonym("greater than or equals")
                    .synonym("higher than or equals")
                .entry().value("!=")
                    .synonym("not equals")
                    .synonym("different")
                ;

        val dateOperator = mapping("DateOperator")
                .entry().value("equals")
                    .synonym("=")
                .entry().value("before")
                    .synonym("<")
                .entry().value("after")
                    .synonym(">")
                ;

        val operator = composite("Operator")
                .entry().entity(textualOperator)
                .entry().entity(numericOperator)
                .entry().entity(dateOperator)
                ;

        val condition = composite("Condition")
                .entry().entity(numericFilterEntity).entity(numericOperator).entity(DSL.number())
                .entry().entity(textualFilterEntity).entity(textualOperator)
                .entry().entity(dateFilterEntity).entity(dateOperator).entity(DSL.date())
                ;

        val orderEntity = mapping("OrderEntity")
                .entry().value("asc")
                    .synonym("ascendant")
                    .synonym("ascendent")
                .entry().value("desc")
                    .synonym("descendant")
                ;

        val functionEntity = mapping("FunctionEntity")
                .entry().value("avg")
                    .synonym("average")
                .entry().value("max")
                    .synonym("maximum")
                .synonym("min")
                    .synonym("minimum")
                ;

        val function = composite("Function")
                .entry().entity(functionEntity).entity(numericSelectFieldEntity)
                ;

        /*
         Intents
         */

        val searchAirQualityDataIntent = intent("SearchAirQualityDataIntent")
                .trainingSentence("Show me the list of RECORDS")
                .parameter("AirQualityDataEntity").fromFragment("RECORDS").entity(airQualityDataEntity)
                ;

        val addPostOperationFilterAirQualityDataIntent = intent("AddPostOperationFilterAirQualityDataIntent")
                .trainingSentence("add filter number higher than 0")
                .trainingSentence("add filter name equals \"test\"")
                .parameter("condition").fromFragment("number higher than 0", "name equals").entity((EntityDefinitionReferenceProvider) condition)
                .parameter("stringValue").fromFragment("test").entity(DSL.any())
                ;

        val provideOperatorAirQualityDataIntent = intent("ProvideOperatorAirQualityDataIntent")
                .trainingSentence("OPERATOR")
                .parameter("filterAirQualityDataOperator").fromFragment("OPERATOR").entity((EntityDefinitionReferenceProvider) operator)
                ;

        val startOverIntent = intent("StartOverIntent")
                .trainingSentence("Start over")
                ;

        val searchAllAirQualityDataIntent = intent("SearchAllAirQualityDataIntent")
                .trainingSentence("Show me all RECORDS")
                .trainingSentence("Show me all RECORDS with name starts with \"value\"")
                .trainingSentence("Show me all RECORDS with number greater than 0")
                .parameter("AirQualityDataEntity").fromFragment("RECORDS").entity(airQualityDataEntity)
                .parameter("condition").fromFragment("number greater than 0", "name starts with").entity((EntityDefinitionReferenceProvider) condition)
                .parameter("stringValue").fromFragment("value").entity(DSL.any())
                ;

        val selectFieldAirQualityDataIntent = intent("SelectFieldAirQualityDataIntent")
                .trainingSentence("add fields")
                ;

        val noMoreFiltersAirQualityDataIntent = intent("NoMoreFiltersAirQualityDataIntent")
                .trainingSentence("I don't want to add filters")
                ;

        val showNextPageAirQualityDataIntent = intent("ShowNextPageAirQualityDataIntent")
                .trainingSentence("next")
                .trainingSentence("show me next page")
                ;

        val chooseOptionAirQualityDataIntent = intent("ChooseOptionAirQualityDataIntent")
                .trainingSentence("FILTER")
                .parameter("filterAirQualityDataEntity").fromFragment("FILTER").entity((EntityDefinitionReferenceProvider) filterEntity)
                ;

        val chooseAirQualityDataSelectOptionsIntent = intent("ChooseAirQualityDataSelectOptionsIntent")
                .trainingSentence("VALUE")
                .parameter("fieldAirQualityDataValue").fromFragment("VALUE").entity((EntityDefinitionReferenceProvider) selectFieldEntity)
                ;

        val filterAirQualityDataIntent = intent("FilterAirQualityDataIntent")
                .trainingSentence("add filters")
                ;

        val provideValueAirQualityDataIntent = intent("ProvideValueAirQualityDataIntent")
                .trainingSentence("date")
                .trainingSentence("VALUE")
                .parameter("filterAirQualityDataValue").fromFragment("VALUE").entity(DSL.any())
                .parameter("filterAirQualityDataDateValue").fromFragment("date").entity(DSL.date())
                ;

        val callFunctionAirQualityDataIntent = intent("CallFunctionAirQualityDataIntent")
                .trainingSentence("calculate average number")
                .parameter("Function").fromFragment("average number").entity((EntityDefinitionReferenceProvider) function)
                ;

        val noMoreSelectFieldAirQualityDataIntent = intent("NoMoreSelectFieldAirQualityDataIntent")
                .trainingSentence("Just show me the list")
                ;

        val orderByAirQualityDataIntent = intent("OrderByAirQualityDataIntent")
                .trainingSentence("sort by FIELD")
                .trainingSentence("order by FIELD")
                .trainingSentence("sort by FIELD ORDER")
                .trainingSentence("order by FIELD ORDER")
                .parameter("orderField").fromFragment("FIELD").entity((EntityDefinitionReferenceProvider) selectFieldEntity)
                .parameter("orderValue").fromFragment("ORDER").entity(orderEntity)
                ;

        ReactPlatform reactPlatform = new ReactPlatform();
        ReactEventProvider reactEventProvider = reactPlatform.getReactEventProvider();
        ReactIntentProvider reactIntentProvider = reactPlatform.getReactIntentProvider();
        RestPlatform restPlatform = new RestPlatform();

        /*
         States
         */

        val init = state("Init");
        val greetings = state("Greetings");
        val awaitingInput = state("AwaitingInput");
        val searchAirQualityData = state("SearchAirQualityData");

        val askIfFilter = state("AskIfFilter");
        val addFilter = state("AddFilter");
        val addFilterOperator = state("AddFilterOperator");
        val addFilterValue = state("AddFilterValue");
        val showLastFilter = state("ShowLastFilter");

        val askIfField = state("AskIfField");
        val addField = state("AddField");
        val showLastField = state("ShowLastField");

        val showResult = state("ShowResult");

        init
                .next()
                .when(eventIs(ReactEventProvider.ClientReady)).moveTo(greetings)
        ;

        greetings
                .body(context -> {
                    reactPlatform.reply(context, "Hi there");
                    reactPlatform.reply(context, "I can show you information about *air quality data in catalonia*");
                })
                .next()
                .moveTo(awaitingInput)
        ;

        awaitingInput
                .next()
                .when(intentIs(searchAirQualityDataIntent)).moveTo(searchAirQualityData)
        ;

        searchAirQualityData
                .body(context -> {
                    Map<String, String> airQualityDataParameterMapping = new HashMap<>();
                    airQualityDataParameterMapping.put("Pollutant", "contaminant");
                    airQualityDataParameterMapping.put("Municipality", "municipi");
                    airQualityDataParameterMapping.put("Magnitude", "magnitud");
                    airQualityDataParameterMapping.put("Station name", "nom_estacio");
                    airQualityDataParameterMapping.put("Date", "data");
                    context.getSession().put("airQualityDataParameterMapping", airQualityDataParameterMapping);

                    context.getSession().put("airQualityDataFilters", new ArrayList<ImmutableTriple<String, String, String>>());
                    context.getSession().put("airQualityDataFieldValues", new ArrayList<String>());

                    List<String> airQualityDataFilterOptions = new ArrayList<>(Arrays.asList(
                            "Municipality", "Magnitude", "Pollutant", "Date"));
                    context.getSession().put("airQualityDataFilterOptions", airQualityDataFilterOptions);

                    List<String> airQualityDataFieldOptions = new ArrayList<>(Arrays.asList(
                            "Station name", "Municipality", "Magnitude", "Pollutant", "Date"));
                    context.getSession().put("airQualityDataFieldOptions", airQualityDataFieldOptions);

                })
                .next()
                .moveTo(askIfFilter)
        ;

        /*
         Filter selection states
         */

        askIfFilter
                .body(context -> {
                    List<String> buttons = new ArrayList<>(Arrays.asList("I don't want to add filters"));
                    List<String> airQualityDataFilterOptions =
                            (List<String>) context.getSession().get("airQualityDataFilterOptions");
                    if (!airQualityDataFilterOptions.isEmpty()) {
                        buttons.add("add filters");
                    }
                    reactPlatform.reply(context, "Do you want to filter the list of Air quality data in Catalonia?",
                            buttons);
                })
                .next()
                .when(intentIs(filterAirQualityDataIntent)).moveTo(addFilter)
                .when(intentIs(noMoreFiltersAirQualityDataIntent)).moveTo(askIfField)
        ;

        addFilter
                .body(context -> {
                    reactPlatform.reply(context, "Choose a filter", (List<String>) context.getSession().get(
                            "airQualityDataFilterOptions"));
                })
                .next()
                .when(intentIs(chooseOptionAirQualityDataIntent)).moveTo(addFilterOperator)
        ;
        addFilterOperator
                .body(context -> {
                    Map<String, String> filterOption = (Map<String, String>) context.getIntent().getValue(
                            "filterAirQualityDataEntity");
                    if (filterOption.containsKey("TextualFilterEntity")) {
                        context.getSession().put("filterAirQualityDataEntity", filterOption.get("TextualFilterEntity"));
                        reactPlatform.reply(context, "Choose an operator",
                                Arrays.asList("equals","starts with", "contains","ends with"));
                    }
                    if (filterOption.containsKey("NumericFilterEntity")) {
                        context.getSession().put("filterAirQualityDataEntity", filterOption.get("NumericFilterEntity"));
                        reactPlatform.reply(context, "Choose an operator",
                                Arrays.asList("equals","greater than", "greater than or equal","less than","less than or equal"));
                    }
                    if (filterOption.containsKey("DateFilterEntity")) {
                        context.getSession().put("filterAirQualityDataEntity", filterOption.get("DateFilterEntity"));
                        reactPlatform.reply(context, "Choose an operator",
                                Arrays.asList("equals","before", "after"));
                    }
                })
                .next()
                .when(intentIs(provideOperatorAirQualityDataIntent)).moveTo(addFilterValue)
        ;

        addFilterValue
                .body(context -> {
                    Map<String, String> filterOperator = (Map<String, String>) context.getIntent().getValue(
                            "filterAirQualityDataOperator");
                    if (filterOperator.containsKey("TextualOperator")) {
                        context.getSession().put("filterAirQualityDataOperator", filterOperator.get("TextualOperator"));
                    }
                    if (filterOperator.containsKey("NumericOperator")) {
                        context.getSession().put("filterAirQualityDataOperator", filterOperator.get("NumericOperator"));
                    }
                    if (filterOperator.containsKey("DateOperator")) {
                        context.getSession().put("filterAirQualityDataOperator", filterOperator.get("DateOperator"));
                    }
                    reactPlatform.reply(context, "Which value do you want?");
                })
                .next()
                .when(intentIs(provideValueAirQualityDataIntent)).moveTo(showLastFilter)
        ;

        showLastFilter
                // if filterEntity == date, throw error when value is not a date
                .body(context -> {
                    String newFilterEntity = (String) context.getSession().get("filterAirQualityDataEntity");
                    String newFilterOperator = (String) context.getSession().get("filterAirQualityDataOperator");
                    String newFilterValue = (String) context.getIntent().getValue("filterAirQualityDataValue");
                    String newFilterDateValue = (String) context.getIntent().getValue("filterAirQualityDataDateValue");
                    ArrayList<ImmutableTriple<String, String, String>> airQualityDataFilters =
                            (ArrayList<ImmutableTriple<String, String, String>>)
                                    context.getSession().get("airQualityDataFilters");
                    if (!newFilterDateValue.isEmpty()) {
                        newFilterValue = newFilterDateValue.substring(0, 10);
                    }
                    airQualityDataFilters.add(new ImmutableTriple<>(newFilterEntity, newFilterOperator, newFilterValue));
                    reactPlatform.reply(context,
                            "All right, " + newFilterEntity + " " + newFilterOperator + " " + newFilterValue);
                    List<String> airQualityDataFilterOptions =
                            (List<String>) context.getSession().get("airQualityDataFilterOptions");
                    airQualityDataFilterOptions.remove(newFilterEntity);
                })
                .next()
                .moveTo(askIfFilter)
        ;

        /*
         Field selection states
         */

        askIfField
                .body(context -> {
                    List<String> buttons = new ArrayList<>(Arrays.asList("Just show me the list"));
                    List<String> airQualityDataFilterOptions =
                            (List<String>) context.getSession().get("airQualityDataFieldOptions");
                    if (!airQualityDataFilterOptions.isEmpty()) {
                        buttons.add("add fields");
                    }
                    reactPlatform.reply(context, "Do you want to select a field to show?", buttons);
                })
                .next()
                .when(intentIs(selectFieldAirQualityDataIntent)).moveTo(addField)
                .when(intentIs(noMoreSelectFieldAirQualityDataIntent)).moveTo(showResult)
        ;

        addField
                .body(context -> {
                    reactPlatform.reply(context, "Choose a field", (List<String>) context.getSession().get(
                            "airQualityDataFieldOptions"));
                })
                .next()
                .when(intentIs(chooseAirQualityDataSelectOptionsIntent)).moveTo(showLastField)
        ;

        showLastField
                .body(context -> {
                    Map<String, String> selectedField = (Map<String, String>) context.getIntent().getValue("fieldAirQualityDataValue");
                    List<String> airQualityDataFieldValues = (List<String>) context.getSession().get(
                            "airQualityDataFieldValues");
                    String fieldValue = null;
                    if (selectedField.containsKey("TextualSelectFieldEntity")) {
                        fieldValue = selectedField.get("TextualSelectFieldEntity");
                    }
                    else if (selectedField.containsKey("NumericSelectFieldEntity")) {
                        fieldValue = selectedField.get("NumericSelectFieldEntity");
                    }
                    else if (selectedField.containsKey("DateSelectFieldEntity")) {
                        fieldValue = selectedField.get("DateSelectFieldEntity");
                    }
                    airQualityDataFieldValues.add(fieldValue);
                    reactPlatform.reply(context, "All right, " + fieldValue);
                    List<String> airQualityDataFieldOptions =
                            (List<String>) context.getSession().get("airQualityDataFieldOptions");
                    airQualityDataFieldOptions.remove(fieldValue);
                })
                .next()
                .moveTo(askIfField)
        ;

        /*
         Show result state
         */

        showResult
                .body(context -> {
                    // We retrieve the parameter map which will help us to get fields real name to create the request
                    Map<String, String> parameterMapping = (Map<String, String>) context.getSession().get("airQualityDataParameterMapping");

                    // We retrieve the filters and select fields from the session
                    List<ImmutableTriple<String, String, String>> airQualityDataFilters = (List<ImmutableTriple<String, String, String>>) context.getSession().get("airQualityDataFilters");
                    List<String> airQualityDataFieldValues = (List<String>) context.getSession().get("airQualityDataFieldValues");
                    if (airQualityDataFieldValues.isEmpty()) {
                        // add all fields if none was selected
                        airQualityDataFieldValues = (List<String>) context.getSession().get("airQualityDataFieldOptions");
                    }

                    // We create a list for each data type kind. This will help us to format the request
                    List<String> textParameters = Arrays.asList("Municipality","Pollutant");
                    List<String> numericParameters = Arrays.asList("Magnitude");
                    List<String> dateParameters = Arrays.asList("Date");

                    // We init the query parameters
                    Map<String, Object> queryParameters = new HashMap<>();
                    Map<String, Object> countParameters = new HashMap<>();

                    // We init the paging information
                    int limit = 10;
                    long page = 1L;
                    long offset = 0L;

                    // We store the paging information in the session
                    context.getSession().put("page", page);

                    countParameters.put("$select","count(*)");
                    queryParameters.put("$limit",limit);
                    queryParameters.put("$offset",offset);

                    if (!airQualityDataFilters.isEmpty()) {
                        String query = airQualityDataFilters.stream().map(e -> {
                            String result = "";
                            if (textParameters.contains(e.left)) {
                                if(Objects.equals(e.middle, "=")) {
                                    result += parameterMapping.get(e.left)+" = "+"'"+e.right+"'";
                                } else if (Objects.equals(e.middle, "starts with")) {
                                    result += parameterMapping.get(e.left)+" like '"+e.right+"%'";
                                } else if (Objects.equals(e.middle, "ends with")) {
                                    result += parameterMapping.get(e.left)+" like '%"+e.right+"'";
                                } else {
                                    result += parameterMapping.get(e.left)+" like '%"+e.right+"%'";
                                }
                            } else if (numericParameters.contains(e.left)) {
                                result += parameterMapping.get(e.left)+" "+e.middle+" "+e.right;
                            } else if (dateParameters.contains(e.left)) {
                                result += parameterMapping.get(e.left)+" "+e.middle+" "+e.right.substring(0, 10)+"'";
                            }
                            return result;
                        }).collect(Collectors.joining("AND"));

                        queryParameters.put("$where",query);
                        countParameters.put("$where",query);
                    }

                    ApiResponse<JsonElement> countResponse = restPlatform.getJsonRequest(context,
                            "https://analisi.transparenciacatalunya.cat/resource/tasf-thgu.json",
                            countParameters, null, null);
                    if (countResponse.getStatus() == 200) {
                        JsonArray countArray = countResponse.getBody().getAsJsonArray();
                        long total = Long.parseLong(countArray.iterator().next().getAsJsonObject().get("count").getAsString());
                        context.getSession().put("total", total);
                        long pageCount = total / limit + 1;
                        context.getSession().put("pageCount", pageCount);
                        if (total > 0) {
                            ApiResponse<JsonElement> response = restPlatform.getJsonRequest(context,
                                    "https://analisi.transparenciacatalunya.cat/resource/tasf-thgu.json",
                                    queryParameters, null, null);
                            if (response.getStatus() == 200) {
                                reactPlatform.reply(context, "Showing "+limit+" records of a total of "+total);
                                // reactPlatform.reply(context, "Page "+page+"/"+pageCount+". Write _next_ to see the next page");
                                JsonArray list = response.getBody().getAsJsonArray();
                                String header =
                                        "|" + String.join("|", airQualityDataFieldValues) + "|" + "\n" +
                                        "|" + String.join("|", airQualityDataFieldValues.stream().map(e ->"---").collect(Collectors.joining("|"))) + "|" + "\n";

                                String data = "";
                                for (JsonElement e : list) {
                                    data += airQualityDataFieldValues.stream().map(r -> {
                                        if (dateParameters.contains(r)) {
                                            return e.getAsJsonObject().get(parameterMapping.get(r)).getAsString().substring(0, 10);
                                        } else {
                                            return e.getAsJsonObject().get(parameterMapping.get(r)).getAsString();
                                        }
                                    }).collect(Collectors.joining("|")) + "|" + "\n";

                                }

                                reactPlatform.reply(context, header + data);
                            }
                        } else {
                            reactPlatform.reply(context, "Nothing found.");
                        }

                    } else {
                        reactPlatform.reply(context, "Oops, something went wrong. The API responded with status "+ countResponse.getStatus());
                    }
                })
                .next()
                .moveTo(awaitingInput);

        /*
         Default fallback state
         */

        val defaultFallback = fallbackState()
                .body(context -> {
                    reactPlatform.reply(context, "This is awkward. I could not treat your request");
                    reactPlatform.reply(context, "Would you please try again");
                });

        val botModel = model()
                .usePlatform(reactPlatform)
                .usePlatform(restPlatform)
                .listenTo(reactEventProvider)
                .listenTo(reactIntentProvider)
                .initState(init)
                .defaultFallbackState(defaultFallback);

        Configuration botConfiguration = new BaseConfiguration();

        Configurations configurations = new Configurations();
        try {
            botConfiguration = configurations.properties(AirQualityBot.class.getClassLoader().getResource("bot.properties"));
        } catch (ConfigurationException e) {
            e.printStackTrace();
            System.out.println("File 'bot.properties' not found");
        }

        XatkitBot xatkitBot = new XatkitBot(botModel, botConfiguration);
        xatkitBot.run();
    }
}
