import java.awt.image.BufferedImage

import org.openqa.selenium.WebDriver

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import cucumber.api.PendingException
import cucumber.api.java.After
import cucumber.api.java.Before
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When

class ScreenshotDriverStepdefs {

	private static final String GOOGLE_SEARCH = 'https://www.google.com'

	@Before()
	public void openBrowser() {
		WebUI.openBrowser()
	}

	@Given("I am on the Google Search page")
	public void i_am_on_the_Google_Search_page() {
		WebUI.navigateToUrl(URL)
	}

	@When("I search for (.+)")
	public void i_search_for(String query) {
		TestObject input_q = new TestObject()
		input_q.addProperty("xpath", ConditionType.EQUALS, "//input[@name='q']")
		WebUI.setText(input_q, query)
		TestObject input_btnk = new TestObject()
		input_btnk.addProperty("xpath", ConditionType.EQUALS, "//input[@name='btnk']")
		WebUI.click(input_btnk)
	}

	@Then("the page should have input field preset with (.+)")
	public void the_page_title_should_start_with(String query) {
		TestObject input_q = new TestObject()
		input_q.addProperty("xpath", ConditionType.EQUALS, "//input[@name='q' and @value='${query}']")
		WebUI.verifyElementPresent(input_q, 10, FailureHandling.STOP_ON_FAILURE)
	}

	@When("I take screenshot of the page using AShot")
	public void i_take_screenshot_of_the_page() {
		WebDriver driver = DriverFactory.getWebDriver()
		BufferedImage bi = CustomKeywords.'com.example.ScreenshotDriver.takeEntirePageImage'(driver)
		
	}

	@Then("the result image should be big enough")
	public void the_result_image_should_be_big_enough() {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@After
	public void closeBrowser() {
		WebUI.closeBrowser()
	}
}