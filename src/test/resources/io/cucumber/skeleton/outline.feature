Feature: Simple Calculator v2
  Scenario Outline: Calculate numbers
    Given the input <input>
    When the calculator is run
    Then the result should be <result>

    Examples:
      | input  | result |
      | 2+2    | 4      |
      | 3-2    | 1      |
