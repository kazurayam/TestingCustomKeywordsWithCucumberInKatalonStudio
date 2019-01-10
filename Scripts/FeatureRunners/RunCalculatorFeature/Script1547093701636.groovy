import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.keyword.internal.KeywordMain
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.util.internal.ExceptionsUtil

KeywordMain.metaClass.static.runKeyword = { Closure closure, FailureHandling flowControl, String errorMessage ->
	try {
		return closure.call();
	} catch (Throwable e) {
		e.printStackTrace()
		stepFailed(errorMessage, flowControl, ExceptionsUtil.getMessageForThrowable(e));
	}
}

CucumberKW.runFeatureFile('Include/features/Calculator.Feature')