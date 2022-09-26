$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/main/java/features/FillForm.feature");
formatter.feature({
  "name": "TCG and GTP path",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Saved Card Success",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@pruebaDeJesus"
    }
  ]
});
formatter.step({
  "name": "The user has navigated to Flight search page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.the_user_has_navigated_to_Flight_search_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "selected an adult in economy class",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.selected_an_adult_in_economy_class()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "fill From textfield",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.and_fill_From_textfield()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "fill To textfield",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.and_fill_To_textfield()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "fill Departure",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.fill_Departure()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "fill Return",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.fill_Return()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Search",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.click_on_Search()"
});
formatter.result({
  "status": "passed"
});
});