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

WebUI.navigateToUrl('https://m2q.be/')

WebUI.click(findTestObject('Object Repository/M2Q_TryOut/Page_M2Q - Software testing en QA  Antwerpen - Kortrijk/Page_M2Q - Software testing en QA  Antwerpe_2ead4b/a_Contact'))

WebUI.setText(findTestObject('Object Repository/M2Q_TryOut/Page_M2Q - Software testing en QA  Antwerpen - Kortrijk/Page_Contact - M2Q  Software Testing en QA _0cf91f/input_Naam_form_fieldsfield_436f233'), 
    naam)

WebUI.setText(findTestObject('Object Repository/M2Q_TryOut/Page_M2Q - Software testing en QA  Antwerpen - Kortrijk/Page_Contact - M2Q  Software Testing en QA _0cf91f/input_Telefoonnummer_form_fieldsfield_13f8176'), 
    tel)

WebUI.setText(findTestObject('Object Repository/M2Q_TryOut/Page_M2Q - Software testing en QA  Antwerpen - Kortrijk/Page_Contact - M2Q  Software Testing en QA _0cf91f/input_E-mailadres_form_fieldsemail'), 
    'mail')

WebUI.setText(findTestObject('Object Repository/M2Q_TryOut/Page_M2Q - Software testing en QA  Antwerpen - Kortrijk/Page_Contact - M2Q  Software Testing en QA _0cf91f/input_Onderwerp_form_fieldsfield_e09e076'), 
    'vraag')

WebUI.setText(findTestObject('Object Repository/M2Q_TryOut/Page_M2Q - Software testing en QA  Antwerpen - Kortrijk/Page_Contact - M2Q  Software Testing en QA _0cf91f/textarea_Uw vraag_form_fieldsfield_8fc8fef'), 
    'vraag tekst')

WebUI.closeBrowser()

