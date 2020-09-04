# Karate test file for the basic tests for every microservice. It should run before any other feature file.
@dev @int @qas
Feature: Tests the availability of the Microservice

  Background:
    * url urls['client_information']

  Scenario: checks if the microservice is live
    Given path 'actuator/health'
    And retry until responseStatus == 200
    When method get

  Scenario: checks if swagger documentation is up
    Given path 'v2/pom/api-docs'
    And retry until responseStatus == 200
    When method get

  Scenario: checks if the info endpoint is up
    Given path 'actuator/info'
    And retry until responseStatus == 200
    When method get

  Scenario: checks if the metrics endpoint is up
    Given path 'actuator/metrics'
    And retry until responseStatus == 200
    When method get