
Feature: User Authentication
  As a user, I should be able to login with the valid credentials: email and password
  @wip
  Scenario: Login as TestQA
    Given User is on the login page

    When User enters valid "TestQA" email
    And User enters valid "TestQA" password
    Then User should see the dashboard