$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/registerUesr.feature");
formatter.feature({
  "name": "create new user registration using restAssured and use the same user to login from UI",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "create new user registration",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sanity"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "As a user I navigate to new user register webpage",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDef.registerUserStepDef.as_a_user_I_navigate_to_new_user_register_webpage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "As a user I will register using following details",
  "rows": [
    {},
    {},
    {},
    {},
    {},
    {}
  ],
  "keyword": "When "
});
formatter.match({
  "location": "stepDef.registerUserStepDef.as_a_user_I_will_register_using_following_details(io.cucumber.datatable.DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "login with registered credentials from UI",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sanity"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "As a user I navigate to flyaway login page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDef.registerUserStepDef.as_a_user_I_navigate_to_flyaway_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "As a user I will login username as \"user05@user05.com\" and password as \"user05\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepDef.registerUserStepDef.as_a_user_I_will_login_username_as_and_password_as(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Validate logged in successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDef.registerUserStepDef.validate_logged_in_successfully()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});