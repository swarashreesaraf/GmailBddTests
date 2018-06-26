$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "This is a login feature",
  "description": "",
  "id": "this-is-a-login-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Test login with valid credentials",
  "description": "",
  "id": "this-is-a-login-feature;test-login-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user is on the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user enters valid username and password",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user navigated to the home page of gmail",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.user_is_on_the_login_page()"
});
formatter.result({
  "duration": 5625869548,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_enters_valid_username_and_password()"
});
formatter.result({
  "duration": 7243334670,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_navigated_to_the_home_page_of_gmail()"
});
formatter.result({
  "duration": 11069431355,
  "status": "passed"
});
});