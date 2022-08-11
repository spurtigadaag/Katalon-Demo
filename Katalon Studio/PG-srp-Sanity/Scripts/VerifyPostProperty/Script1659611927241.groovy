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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.magicbricks.com/')

WebUI.click(findTestObject('Object Repository/VrifyPP/Page_Real Estate  Property in India  BuySal_4ce628/a_Login'))

WebUI.click(findTestObject('Object Repository/VrifyPP/Page_Real Estate  Property in India  BuySal_4ce628/a_Login'))

WebUI.switchToWindowTitle('User Login')

WebUI.setText(findTestObject('Object Repository/VrifyPP/Page_User Login/input_Login_emailOrMobile'), 'spurti.gadag@magicbricks.com')

WebUI.click(findTestObject('Object Repository/VrifyPP/Page_User Login/button_Next'))

WebUI.setEncryptedText(findTestObject('Object Repository/VrifyPP/Page_User Login/input_spurti.gadagmagicbricks.com_password'), 
    '7FMIZxlJvKvcwwRVyzEUVg==')

WebUI.click(findTestObject('Object Repository/VrifyPP/Page_User Login/button_Login'))

WebUI.click(findTestObject('Object Repository/VrifyPP/Page_Paying Guest in Bangalore  Real Estate_5264e9/div_Hello, Spurti Gadag My Dashboard'))

WebUI.click(findTestObject('Object Repository/VrifyPP/Page_Paying Guest in Bangalore  Real Estate_5264e9/span_My Dashboard'))

WebUI.click(findTestObject('Object Repository/VrifyPP/Page_Paying Guest in Bangalore  Real Estate_5264e9/span_PG Dasboard'))

WebUI.switchToWindowTitle('Paying Guest in Bangalore | Real Estate in Bangalore | MagicBricks')

WebUI.click(findTestObject('Object Repository/VrifyPP/Page_Paying Guest in Bangalore  Real Estate_5264e9/div_Test_PG                                _eeaa1b'))

WebUI.click(findTestObject('Object Repository/VrifyPP/Page_Paying Guest in Bangalore  Real Estate_5264e9/div_Test_PG                                _eeaa1b'))

