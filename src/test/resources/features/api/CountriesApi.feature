Feature: Countries Api

  Scenario: 1.1 Get All Countries
    When Client call Get All Countries service
    Then response status call is 200

  Scenario: 1.2  Get Countries Of Region
    When Client call Get Countries Of Eu Region service
    Then response status call is 200
    And response body contains capital, region and population of each country

   Scenario: 1.3 Get Country USA and check currency
     When Client call Get Country USA
     Then response status call is 200
     And currency in response body is USD

   Scenario: 1.4 Get Country USA and check that response body is correct using json schema validator
     When Client call Get Country USA
     Then response status call is 200
     And response body is correct with json validation