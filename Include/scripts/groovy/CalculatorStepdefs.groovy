import static org.junit.Assert.*;

import com.example.Calculator

import cucumber.api.java.en.Then
import cucumber.api.java.en.When
import java.util.regex.Pattern

class CalculatorStepdefs {

	private double actualResult
	
	@When("I add (.+) and (.+)")
	def I_add_arg0_and_arg1(String arg0, String arg1) {
		actualResult = Calculator.add(
			Double.parseDouble(arg0), Double.parseDouble(arg1))
	}

	@When("I subtract (.+) from (.+)")
	def I_subtract_arg1_from_arg0(String arg1, String arg0) {
		actualResult = Calculator.subtract(
			Double.parseDouble(arg0), Double.parseDouble(arg1))
	}
	
	@When("I multiply (.+) with (.+)")
	def I_multiply_arg0_with_arg1(String arg0, String arg1) {
		actualResult = Calculator.multiply(
			Double.parseDouble(arg0), Double.parseDouble(arg1))
	}
	
	@When("I divide (.+) by (.+)")
	def I_divide_arg0_by_arg1(String arg0, String arg1) {
		actualResult = Calculator.divide(
			Double.parseDouble(arg0), Double.parseDouble(arg1))
	}
	
	@When("I raise (.+) to the power of (.+)")
	def I_raise_arg0_to_the_power_of_arg1(String arg0, String arg1) {
		actualResult = Calculator.power(
			Double.parseDouble(arg0), Double.parseDouble(arg1))
	}

	@Then("I get (.+)")
	def I_get_result(String expectedResult) {
		assertEquals(Double.parseDouble(expectedResult), actualResult, 0.01)
	}
}