import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

unchecked = WebUI.verifyElementNotChecked(findTestObject('Object Repository/Page_CURA Healthcare Service/input_programs'),0)
if (unchecked == true) {
WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/input_programs'))
}
unchecked2 = WebUI.verifyElementNotChecked(findTestObject('Object Repository/Page_CURA Healthcare Service/input_programs_1'),0)
if (unchecked2 == true) {
WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/input_programs_1'))
}
//uncheked3 = WebUI.verifyElementNotChecked(findTestObject('Object Repository/Page_CURA Healthcare Service/input_programs_1_2'),0)
//if (unchecked3 == true) {
WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/input_programs_1_2'))
//}
