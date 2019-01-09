import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

/**
 * <p>
 * This test case demonstrates how to use the <pre>com.example.Calculator</pre>
 * class as a Custom Keyword in Katalon Studio
 * </p>
 */

'calculate add'
double arg0 = 2.0
double arg1 = 3.0
double result = CustomKeywords.'com.example.Calculator.add'(arg0, arg1)
WebUI.comment("${arg0} + ${arg1} = ${result}")

'calculate subtract'
result = CustomKeywords.'com.example.Calculator.subtract'(arg0, arg1)
WebUI.comment("${arg0} - ${arg1} = ${result}")

'calculate multiply'
result = CustomKeywords.'com.example.Calculator.multiply'(arg0, arg1)
WebUI.comment("${arg0} * ${arg1} = ${result}")

'calculate divide'
result = CustomKeywords.'com.example.Calculator.divide'(arg0, arg1)
WebUI.comment("${arg0} / ${arg1} = ${result}")

'calculate power'
result = CustomKeywords.'com.example.Calculator.power'(arg0, arg1)
WebUI.comment("${arg0} ^ ${arg1} = ${result}")

