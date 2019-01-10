# language: en

Feature: Calculator
  
  I can perform various calculations of 2 numbers
   --- add/subtract/multiply/divide/power

  Scenario Outline: Add
    When I add <arg0> and <arg1>
    Then I get <result>

    Examples: 
      | arg0 | arg1 | result |
      |  0.0 |  0.0 |    0.0 |
      |  2.0 |  3.0 |    5.0 |
      | -1.0 | -2.0 |   -3.0 |

  
  Scenario Outline: Subtract
  	When I subtract <arg1> from <arg0>
  	Then I get <result>
  	
  	Examples:
  		| arg0 | arg1 | result |
      |  0.0 |  0.0 |    0.0 |
      |  2.0 |  3.0 |   -1.0 |
      | -1.0 | -2.0 |    1.0 |


  Scenario Outline: Multiply
  	When I multiply <arg0> with <arg1>
  	Then I get <result>
  	
  	Examples:
  		| arg0 | arg1 | result |
      |  0.0 |  1.0 |    0.0 |
      |  2.0 |  3.0 |    6.0 |
      | -1.0 | -2.0 |    2.0 |


	Scenario Outline: Divide
		When I divide <arg0> by <arg1>
		Then I get <result>
	
	Examples:
  		| arg0 | arg1 | result |
      |  0.0 |  1.0 |    0.0 |
      |  2.0 |  3.0 |    0.666 |
      | -1.0 | -2.0 |    0.5 |


  Scenario Outline: Power
		When I raise <arg0> to the power of <arg1>
		Then I get <result>
	
	Examples:
  		| arg0 | arg1 | result |
      |  0.0 |  1.0 |    0.0 |
      |  2.0 |  3.0 |    8.0 |
      | -2.0 |  3.0 |   -8.0 |
