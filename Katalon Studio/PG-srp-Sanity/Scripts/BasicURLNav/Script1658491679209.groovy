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

WebUI.click(findTestObject('Object Repository/Page_Real Estate  Property in India  BuySal_4ce628/div_PG'))

WebUI.getWindowTitle() == 'Find a home away from home1'

WebUI.verifyElementText(findTestObject('prac1/Page_Paying GuestPG  Hostels in Bangalore  _d6da2e/div_Find a home away from home'), 
    'Find a home away from home')

WebUI.click(findTestObject('Object Repository/Page_Real Estate  Property in India  BuySal_4ce628/div_Buy'))

WebUI.getWindowTitle() == 'Find a home you\'ll love'

WebUI.verifyElementText(findTestObject('prac1/Page_Real Estate  Property in India  BuySal_4ce628/div_Find a home youll love'), 
    'Find a home you\'ll love')

WebUI.click(findTestObject('Object Repository/Page_Real Estate  Property in India  BuySal_4ce628/div_Rent'))

WebUI.getWindowTitle() == 'Find your perfect Rental home1'

WebUI.verifyElementText(findTestObject('Page_Property in Mumbai  Real Estate in Mum_22fb90/div_Find your perfect Rental home'), 
    'Find your perfect Rental home')

WebUI.click(findTestObject('Object Repository/Page_Property in Mumbai  Real Estate in Mum_22fb90/div_Plot'))

WebUI.getWindowTitle() == 'Pick your perfect piece of plot'

WebUI.verifyElementText(findTestObject('prac1/Page_Residential  BDA Approved Plots  Land _92fa89/div_Pick your perfect piece of plot'), 
    'Pick your perfect piece of plot')

WebUI.click(findTestObject('Object Repository/Page_Residential  MCGM Approved Plots  Land_b3511c/div_Commercial'))

WebUI.getWindowTitle() == 'Find your perfect workspace'

WebUI.verifyElementText(findTestObject('prac1/Page_Top Commercial Properties in Bangalore_8d5cc4/div_Find your perfect workspace'), 
    'Find your perfect workspace')

