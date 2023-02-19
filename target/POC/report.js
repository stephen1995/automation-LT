$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/main/java/features/Login.feature");
formatter.feature({
  "name": "Login",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Login with standar user",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "user visits saucedemo page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.user_visits_saucedemo_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enters valid credentials",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.enters_valid_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user add the first item to the cart",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.user_add_the_first_item_to_the_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user completes checkout",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.user_completes_checkout()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is able to see Thank you for your order message",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.user_is_able_to_see_Thank_you_for_your_order_message()"
});
formatter.result({
  "status": "passed"
});
});