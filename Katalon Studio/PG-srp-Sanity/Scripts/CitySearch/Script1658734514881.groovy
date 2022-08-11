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

WebUI.click(findTestObject('Object Repository/CitySearch/Page_Real Estate  Property in India  BuySal_4ce628/div_PG'))

WebUI.click(findTestObject('Object Repository/CitySearch/Page_Paying GuestPG  Hostels in Bangalore  _d6da2e/div_Bangalore'))

WebUI.click(findTestObject('Object Repository/CitySearch/Page_Paying GuestPG  Hostels in Bangalore  _d6da2e/div_Bangalore_mb-search__tag-close'))

WebUI.setText(findTestObject('Object Repository/Page_Paying GuestPG  Hostels in Bangalore  _d6da2e/input_Post Free Property Ad_keyword'), 
    Location)

WebUI.click(findTestObject('Object Repository/Page_Paying GuestPG  Hostels in Bangalore  _d6da2e/span_bangalore'))

WebUI.click(findTestObject('Object Repository/Page_Paying GuestPG  Hostels in Bangalore  _d6da2e/div_Search'))

Title = WebUI.getText(findTestObject('prac1/Page_PG in Noida - Boys  Girls Paying Guest_496b0f/h1_1181 Best PG in Noida'))

WebUI.verifyTextPresent('Noida', false, FailureHandling.CONTINUE_ON_FAILURE)

