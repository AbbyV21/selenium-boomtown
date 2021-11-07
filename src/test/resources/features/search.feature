@wip
Feature: Boomtown Search Functionality
  As a user I shuold be able to insert input in the search bar and
  see the result

#  Scenario: Search page title verification
#
#    Given User clicks on the help link under profile picture
#    Then User should see title is "Boomtown Knowledge Library"

  Scenario: User search  verification
    Given user is on Boomtown help page
    When User types "customer" in the search bar
    Then User should see the result of the search
    And User should see the number of results found including word "customer"

