Feature: Boomtown Search Functionality
  As a user, When I am on the Boomtown help page I should be able to provide input
  in the search box and get a result and see relevant information
  Case: Search for "customer"

  Scenario: Search page title verification
    Given user is on Boomtown help page
    Then User should see title is "Welcome to Boomtown Platform. How Can We Help?"

    Scenario: User search  verification
     When User types "customer" in the search bar
      And user clicks the search button
      Then User should see the result of the search
      And User see the word "customer" in the result list
