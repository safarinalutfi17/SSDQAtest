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

WebUI.navigateToUrl('https://qa-interview-test-1.vercel.app/')

WebUI.click(findTestObject('Object Repository/Page_Login Page/a_Register'))

WebUI.setText(findTestObject('Object Repository/Page_Register/input_block px-2 py-3 mt-2 h-52px rounded-l_5154ab'), 'safarina lutfiyya')

WebUI.setText(findTestObject('Object Repository/Page_Register/input_block px-2 py-3 mt-2 h-52px rounded-l_5154ab_1'), 'safarina01')

WebUI.setText(findTestObject('Object Repository/Page_Register/input_block px-2 py-3 mt-2 h-52px rounded-l_5154ab_1_2'), 
    'safarinalutfi01')

WebUI.setText(findTestObject('Object Repository/Page_Register/input_block px-2 py-3 mt-2 h-52px rounded-l_5154ab_1_2_3'), 
    'safarinalutfi01')

WebUI.click(findTestObject('Object Repository/Page_Register/button_Register'))

WebUI.click(findTestObject('Object Repository/Page_Register/a_Login'))

WebUI.setText(findTestObject('Object Repository/Page_Login Page/input_block px-2 py-3 mt-2 h-52px rounded-l_5154ab'), 'safarina01')

WebUI.setText(findTestObject('Object Repository/Page_Login Page/input_block px-2 py-3 mt-2 h-52px rounded-l_5154ab_1'), 
    'safarinalutfi01')

WebUI.click(findTestObject('Object Repository/Page_Login Page/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/button_Lihat katalog'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/button_Log Out'))

