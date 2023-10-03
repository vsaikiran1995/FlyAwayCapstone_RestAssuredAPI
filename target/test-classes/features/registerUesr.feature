Feature: create new user registration using restAssured and use the same user to login from UI
@sanity
  Scenario: create new user registration
    Given As a user I navigate to new user register webpage
    When As a user I will register using following details
      | user05@user05.com |
      | user05            |
      | user05            |
      | user05            |
      | user05            |
      | user05            |
@sanity
  Scenario: login with registered credentials from UI
    Given As a user I navigate to flyaway login page
    When As a user I will login username as "user05@user05.com" and password as "user05"
    Then Validate logged in successfully
