#（2）采用点击成交方式的，申报数量应当为10万元面额或者其整数倍；
Feature: Trade System
  Scenario Outline: Click Trade
    Given user has <amount> amount of trade
    When user choose <tradeType>
    Then the result should be <result>

  Examples:
    | amount  | tradeType  | result |
    | 100000  | CLICK      | true   |
    | 3000000 | CLICK      | true   |
    | 90000   | CLICK      | false  |
    | 100001  | CLICK      | false  |
    | 100000  | NOT_CLICK  | false  |


