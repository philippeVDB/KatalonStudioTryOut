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

WebUI.click(findTestObject('M2Q_TryOut/Page_M2Q - Software testing en QA  Antwerpen - Kortrijk/a_Alles aanvaarden'))

WebUI.click(findTestObject('M2Q_TryOut/Page_M2Q - Software testing en QA  Antwerpen - Kortrijk/a_Over ons'))

WebUI.click(findTestObject('M2Q_TryOut/Page_M2Q - Software testing en QA  Antwerpen - Kortrijk/a_Nieuws'))

WebUI.click(findTestObject('M2Q_TryOut/Page_M2Q - Software testing en QA  Antwerpen - Kortrijk/a_In beeld'))

WebUI.click(findTestObject('M2Q_TryOut/Page_M2Q - Software testing en QA  Antwerpen - Kortrijk/a_Home'))

WebUI.click(findTestObject('M2Q_TryOut/Page_M2Q - Software testing en QA  Antwerpen - Kortrijk/a_Contact'))

WebUI.setText(findTestObject('M2Q_TryOut/Page_Contact - M2Q  Software Testing en QA  Antwerpen - Kortrijk/input_Naam_form_fieldsfield_436f233'),
	'MijnNaam')

WebUI.setText(findTestObject('M2Q_TryOut/Page_Contact - M2Q  Software Testing en QA  Antwerpen - Kortrijk/input_Telefoonnummer_form_fieldsfield_13f8176'),
	'0485866374')

WebUI.setText(findTestObject('M2Q_TryOut/Page_Contact - M2Q  Software Testing en QA  Antwerpen - Kortrijk/input_E-mailadres_form_fieldsemail'),
	'foutiefMailadres@be')

WebUI.setText(findTestObject('M2Q_TryOut/Page_Contact - M2Q  Software Testing en QA  Antwerpen - Kortrijk/input_Onderwerp_form_fieldsfield_e09e076'),
	'Onderwerp')

WebUI.setText(findTestObject('M2Q_TryOut/Page_Contact - M2Q  Software Testing en QA  Antwerpen - Kortrijk/textarea_Uw vraag_form_fieldsfield_8fc8fef'),
	'Dit is een test met een foutief mailadres')

WebUI.setText(findTestObject('Object Repository/M2Q_TryOut/Page_Contact - M2Q  Software Testing en QA  Antwerpen - Kortrijk/input_Naam_form_fieldsfield_436f233'),
	'gewijzigde naam')

WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)
