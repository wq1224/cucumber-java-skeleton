Feature: Simple Calculator v1
  Background:
    Given I have a calculator
  Scenario: Add two numbers
    Given the input 2+2
    When the calculator is run
    Then the output should be 4

  Scenario: Minus two numbers
    Given the string input "3-2"
    When the calculator is run
    Then the result should be 1
