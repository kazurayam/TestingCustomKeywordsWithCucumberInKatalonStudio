import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

/**
 * open theGoogle Search result page, take entire-page screenshot, save it into file
 * 
 * @author kazurayam
 */

WebUI.openBrowser('')
WebUI.setViewPortSize(1024, 768)
WebUI.navigateToUrl("https://www.google.com/search?q=katalon", FailureHandling.STOP_ON_FAILURE)

// create directory to locate image file
Path projectDir = Paths.get(RunConfiguration.getProjectDir())
Path tmpDir = projectDir.resolve("tmp")
Files.createDirectories(tmpDir)
File pngFile = tmpDir.resolve('google_search').toFile()

// take entire page screen shot of the page using AShot library, and save into a file
CustomKeywords.'com.example.ScreenshotDriver.saveEntirePageImage'(pngFile)

WebUI.closeBrowser()