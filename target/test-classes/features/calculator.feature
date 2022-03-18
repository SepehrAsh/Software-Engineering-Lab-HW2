@tag
Feature: Add

  Scenario Outline: add two numbers
    Given Two input values, <first> and <second>
    When I add the two values
    Then I expect the result <result>
    Examples:
      | first | second | result |
      | 10     | 12     | 22     |
      | -5    | 6      | 1      |
      | 22     | 21      | 43      |