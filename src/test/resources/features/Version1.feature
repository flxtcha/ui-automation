
Feature: version 1 website
  As a user
  I want to look around version 1's website
  So i can see if they have any jobs going

  Scenario: Finding information on version1
    Given I have navigated to the version1 home page
    When I navigate to the about us page
    Then I should be able to view the history of version1
