Feature: ScreenshotDriver
  
  I want to take entire page screenshots in Katalon Studio

  Scenario: Finding some cheese in Google Search and capture the page
    Given I am on the Google Search page
    When I search for "Cheese!"
    Then the page should have input field preset with "Cheese!"
    When I take screenshot of the page using AShot
    Then the result image should be big enough
