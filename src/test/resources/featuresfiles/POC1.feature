Feature: POC1

  Scenario: Verify the no. of records
    Given I have a running service
    When I request count of records from the service
    Then the correct no of records are returned

