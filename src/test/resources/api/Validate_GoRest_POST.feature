@smoke
Feature: As a QE, I validate GoRest Post
  Scenario: Validating the POST Request
    Given I sent a POST request with body
    Then Status code is 201
