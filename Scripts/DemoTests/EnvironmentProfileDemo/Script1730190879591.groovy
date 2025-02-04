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

WebUI.navigateToUrl(GlobalVariable.URL)

WebUI.click(findTestObject('Object Repository/ObjectsEnvironmentProfileDemo/Page_Your store. Login/p_Admin email adminyourstore.com Admin pass_11085b'))

WebUI.click(findTestObject('Object Repository/ObjectsEnvironmentProfileDemo/Page_Your store. Login/label_Email'))

WebUI.setText(findTestObject('Object Repository/ObjectsEnvironmentProfileDemo/Page_Your store. Login/input_Email_Email'), 
    GlobalVariable.USERNAME)

WebUI.setEncryptedText(findTestObject('Object Repository/ObjectsEnvironmentProfileDemo/Page_Your store. Login/input_Password_Password'), 
    GlobalVariable.PASSWORD)

WebUI.click(findTestObject('Object Repository/ObjectsEnvironmentProfileDemo/Page_Your store. Login/button_Log in'))

WebUI.rightClick(findTestObject('Object Repository/ObjectsEnvironmentProfileDemo/Page_Just a moment/h1_admin-demo.nopcommerce.com'))

WebUI.click(findTestObject('Object Repository/ObjectsEnvironmentProfileDemo/Page_Just a moment/h2_Verify you are human by completing the a_37fe7a'))

WebUI.verifyElementText(findTestObject('Object Repository/ObjectsEnvironmentProfileDemo/Page_Just a moment/h2_Verify you are human by completing the a_37fe7a'), 
    'Verify you are human by completing the action below.')

WebUI.closeBrowser()

