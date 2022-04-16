Feature: Simple Calculator v3
  Scenario: Calculate numbers
    Given input and result
    | input  | result |
    | 2+2    | 4      |
    | 3-2    | 1      |
    When the calculator is running
    Then the calculator will output correct data

#Feature: Add Calculator
#  Scenario: Add two numbers
#    Given two input number
#      | input1 | input2 |
#      | 2      | 2      |
#      | 3      | 4      |
#    When the calculator is running
#    Then the calculator will output correct data
#      | result |
#      | 4      |
#      | 7      |