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

WebUI.callTestCase(findTestCase('Logging/Login Passed'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Cbs/div_Customer'))

WebUI.click(findTestObject('Object Repository/Page_Cbs/span_Customer Information'))

WebUI.click(findTestObject('Object Repository/Page_Cbs/span_Customer Profile'))

WebUI.click(findTestObject('Object Repository/Page_Cbs/mat-icon_Customer_fa fa-plus fa-lg tooltip _137549'))

WebUI.click(findTestObject('Object Repository/Page_Cbs/span_Category Type'))

WebUI.click(findTestObject('Object Repository/Page_Cbs/span_INDIVIDUALIndividual'))

WebUI.click(findTestObject('Object Repository/Page_Cbs/div_Client IndicatorBasis for offering diff_06cc81'))

WebUI.click(findTestObject('Object Repository/Page_Cbs/span_NNormal'))

WebUI.setText(findTestObject('Object Repository/Page_Cbs/input_Client Indicator_mat-input-2'), '050078601')

WebUI.click(findTestObject('Object Repository/Page_Cbs/mat-icon_Client Account Type_fa fa-search m_3874ed'))

WebUI.click(findTestObject('Object Repository/Page_Cbs/mat-card-content_Customer Type  Description_781eeb'))

WebUI.click(findTestObject('Object Repository/Page_Cbs/div_IND'))

WebUI.click(findTestObject('Object Repository/Page_Cbs/div_Client Account Type_mat-checkbox-inner-_829e04'))

WebUI.click(findTestObject('Object Repository/Page_Cbs/mat-icon_Country of Residence_fa fa-search _bed379'))

WebUI.click(findTestObject('Object Repository/Page_Cbs/mat-icon_navigate_next'))

WebUI.click(findTestObject('Object Repository/Page_Cbs/div_PK'))

WebUI.click(findTestObject('Object Repository/Page_Cbs/mat-icon_State of Residence_fa fa-search ma_67d744'))

WebUI.click(findTestObject('Object Repository/Page_Cbs/div_KH'))

