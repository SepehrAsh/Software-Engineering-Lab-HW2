@tag
Feature: Divide and Sqrt

  Scenario: divide and sqrt two numbers
    Given Two input values are, 25 and 1
    When Ali and Sepehr divide a to b and sqrt
    Then Ali and Sepehr expect the result 5

  Scenario Outline: divide and sqrt two numbers
    Given Two input values are, <a> and <b>
    When Ali and Sepehr divide a to b and sqrt
    Then Ali and Sepehr expect the result <result>
    Examples:
      | a  | b | result |
      | 9  | 1 | 3      |
      | 81 | 9 | 3      |
      | 6  | 1 | 2.449  |
      | 100 | 4 | 5     |
      | 7    | 3      | 1.53 |

