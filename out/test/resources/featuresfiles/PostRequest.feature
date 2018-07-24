#@post
Feature: POST results
#
#  In order to find some information
#  As a searcher
#  I want to be able to search and have relevant information returned
#
  Scenario: Write NEW data to json file and read it again
  Given I add new data to the list for the tpp project
#      | id | ebaId   | name  | comments      | email           | phonenumber | city | address             | status | monitored | accreditations | nationalId | nationalaccr | physicalContacts |
#      |    | newuser | Ebay2 | hello testing | ebay2@email.com | 03213412414 | LA   | address 1 address 2 | ACTIVE | True      | AIS            | ebay2      |              |                  |
#    Then validate the get request
#
#
#
#
