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

WebUI.click(findTestObject('Object Repository/PostProperty/Page_Real Estate  Property in India  BuySal_4ce628/div_PG'))

WebUI.click(findTestObject('Object Repository/Login/Page_Paying GuestPG  Hostels in Bangalore  _d6da2e/a_Login'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Login/Page_Paying GuestPG  Hostels in Bangalore  _d6da2e/div_LoginNew to Magicbricks Sign Up'))

WebUI.click(findTestObject('Object Repository/Login/Page_Paying GuestPG  Hostels in Bangalore  _d6da2e/a_Login'))

WebUI.switchToWindowTitle('User Login')

WebUI.setText(findTestObject('Object Repository/PostProperty/Page_User Login/input_Login_emailOrMobile'), 'spurti.gadag@magicbricks.com')

WebUI.click(findTestObject('Object Repository/PostProperty/Page_User Login/button_Next'))

WebUI.click(findTestObject('Object Repository/PostProperty/Page_User Login/label_Password'))

WebUI.setEncryptedText(findTestObject('Object Repository/PostProperty/Page_User Login/input_spurti.gadagmagicbricks.com_password'), 
    '7FMIZxlJvKvcwwRVyzEUVg==')

WebUI.click(findTestObject('Object Repository/PostProperty/Page_User Login/button_Login'))

WebUI.click(findTestObject('Object Repository/PostProperty/Page_Sell or Rent Home Online at Magicbricks/a_Post Property Free'))

WebUI.switchToWindowTitle('Sell and Rent Your Property For Free on Magicbricks')

WebUI.click(findTestObject('Object Repository/PostProperty/Page_Sell and Rent Your Property For Free o_9f3c25/input_Rent Lease_propertyFor'))

WebUI.click(findTestObject('Object Repository/PostProperty/Page_Paying Guest in Bangalore  Real Estate_5264e9/div_Our Field Agent will be visiting you so_c9017e'))

WebUI.setText(findTestObject('Object Repository/PostProperty/Page_Paying Guest in Bangalore  Real Estate_5264e9/input_Make sure you enter the correct addre_b9e526'), 
    'Andaman')

WebUI.click(findTestObject('Object Repository/PostProperty/Page_Paying Guest in Bangalore  Real Estate_5264e9/mark_Andaman'))

WebUI.setText(findTestObject('Object Repository/PostProperty/Page_Paying Guest in Bangalore  Real Estate_5264e9/input_-_houseNo'), 
    'Andaman West')

WebUI.setText(findTestObject('Object Repository/PostProperty/Page_Paying Guest in Bangalore  Real Estate_5264e9/input__pgzipcode'), 
    '744103')

WebUI.setText(findTestObject('Object Repository/PostProperty/Page_Paying Guest in Bangalore  Real Estate_5264e9/input_Landmark_operatingSince'), 
    '2022')

WebUI.selectOptionByValue(findTestObject('Object Repository/PostProperty/Page_Paying Guest in Bangalore  Real Estate_5264e9/select_Select                 An independen_bdd7e6'), 
    '4311299', true)

WebUI.click(findTestObject('Object Repository/PostProperty/Page_Paying Guest in Bangalore  Real Estate_5264e9/a_Continue'))

WebUI.setText(findTestObject('Object Repository/PostProperty/Page_Paying Guest in Bangalore  Real Estate_5264e9/input_The name will be visible to the guest_f40f3a'), 
    'Test_PG')

WebUI.click(findTestObject('Object Repository/PostProperty/Page_Paying Guest in Bangalore  Real Estate_5264e9/a_Continue'))

WebUI.click(findTestObject('Object Repository/PostProperty/Page_Paying Guest in Bangalore  Real Estate_5264e9/span_Owner_radiobox-style'))

WebUI.click(findTestObject('Object Repository/PostProperty/Page_Paying Guest in Bangalore  Real Estate_5264e9/a_Continue'))

WebUI.click(findTestObject('Object Repository/PostProperty/Page_Paying Guest in Bangalore  Real Estate_5264e9/div_You cannot change the User Type once yo_c1da67'))

WebUI.click(findTestObject('Object Repository/PostProperty/Page_Paying Guest in Bangalore  Real Estate_5264e9/a_OK'))

WebUI.click(findTestObject('Object Repository/PostProperty/Page_Paying Guest in Bangalore  Real Estate_5264e9/div_Single'))

WebUI.click(findTestObject('Object Repository/PostProperty/Page_Paying Guest in Bangalore  Real Estate_5264e9/div_Single'))

WebUI.click(findTestObject('Object Repository/PostProperty/Page_Paying Guest in Bangalore  Real Estate_5264e9/div_Select all the available room categorie_d4c7ca'))

WebUI.click(findTestObject('Object Repository/PostProperty/Page_Paying Guest in Bangalore  Real Estate_5264e9/a_Continue'))

WebUI.setText(findTestObject('Object Repository/PostProperty/Page_Paying Guest in Bangalore  Real Estate_5264e9/input_Single Room_noOfRoom_16011'), 
    '1')

WebUI.setText(findTestObject('Object Repository/PostProperty/Page_Paying Guest in Bangalore  Real Estate_5264e9/input__rentPerBed_16011'), 
    '4000')

WebUI.setText(findTestObject('Object Repository/PostProperty/Page_Paying Guest in Bangalore  Real Estate_5264e9/input__depositPerBed_16011'), 
    '1000')

WebUI.click(findTestObject('Object Repository/PostProperty/Page_Paying Guest in Bangalore  Real Estate_5264e9/a_Continue'))

WebUI.click(findTestObject('PostProperty/Page_Paying Guest in Bangalore  Real Estate_5264e9/span_Female_radiobox-style'))

WebUI.scrollToElement(findTestObject('PostProperty/Page_Paying Guest in Bangalore  Real Estate_5264e9/span_Student_radiobox-style'), 
    2)

WebUI.click(findTestObject('PostProperty/Page_Paying Guest in Bangalore  Real Estate_5264e9/span_Student_radiobox-style'))

WebUI.click(findTestObject('Object Repository/uplodfile_buildview/Page_Paying Guest in Bangalore  Real Estate_5264e9/a_Continue'))

WebUI.click(findTestObject('Object Repository/uplodfile_buildview/Page_Paying Guest in Bangalore  Real Estate_5264e9/a_Continue'))

WebUI.click(findTestObject('Object Repository/uplodfile_buildview/Page_Paying Guest in Bangalore  Real Estate_5264e9/a_Continue'))

WebUI.click(findTestObject('Object Repository/uplodfile_buildview/Page_Paying Guest in Bangalore  Real Estate_5264e9/a_Continue'))

WebUI.click(findTestObject('Object Repository/uplodfile_buildview/Page_Paying Guest in Bangalore  Real Estate_5264e9/a_Continue'))

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/uplodfile_buildview/Page_Paying Guest in Bangalore  Real Estate_5264e9/textarea_Tell us more about your PG_pgdescription'), 
    'Move into Test, a professionally managed PG home in the Western St, Eluru. Located in a safe neighborhood, this male PG offers various modern amenities for your comfort. This PG has single occupancy types. This PG is nearby major commercial and educational hubs. Please contact the seller to book this fast selling high in demand PG stay.')

WebUI.click(findTestObject('Object Repository/uplodfile_buildview/Page_Paying Guest in Bangalore  Real Estate_5264e9/a_Continue'))

WebUI.delay(5)

WebUI.maximizeWindow()

WebUI.uploadFile(findTestObject('uploadfile/Page_Paying Guest in Bangalore  Real Estate_5264e9/li_Add PhotoSingle RoomRequired Cover photo_3c03f3'), 
    'C:\\Users\\spurti.gadag\\Pictures\\Saved Pictures\\400px-Argentina-02240_-_Libertador_Building_(49024269646).jpg')

WebUI.delay(5)

WebUI.click(findTestObject('uploadfile/Page_Paying Guest in Bangalore  Real Estate_5264e9/a_Continue'))

WebUI.delay(5)

WebUI.uploadFile(findTestObject('uplodfile_buildview/Page_Paying Guest in Bangalore  Real Estate_5264e9/li_Add PhotoBuilding ViewRequired Cover pho_8053b1'), 
    'C:\\Users\\spurti.gadag\\Pictures\\Saved Pictures\\400px-Argentina-02240_-_Libertador_Building_(49024269646).jpg')

WebUI.delay(5)

WebUI.click(findTestObject('PostProperty/Page_MB PG/Page_Paying Guest in Bangalore  Real Estate_5264e9/a_Continue'))

WebUI.delay(5)

WebUI.click(findTestObject('PostProperty/Page_MB PG/Page_Paying Guest in Bangalore  Real Estate_5264e9/a_Continue'))

WebUI.delay(5)

