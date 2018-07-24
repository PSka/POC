@get
Feature: Validating JSON

  In order to find some information
  As a searcher
  I want to be able to search and have relevant information returned

  @get_scenario
  Scenario Outline: 01 - This feature will read all the data from Json File and "validate" results
    Given I request all the data from the service
    And I am able to talk to the service
    Then "<id>" "<firstname>" "<lastname>" should match the expected

    Examples:
      | id | firstname | lastname |
      | 1  | harry     | junior   |