Feature: All Countries

  Scenario: 1.1 Get All Countries
    When User call Get All Countries service
    Then response status call is 200

  Scenario: 1.2  Get Countries Of Region
    When User call Get Countries Of Region service
    Then response status call is 200
    And response body contains capital, region and population of each country