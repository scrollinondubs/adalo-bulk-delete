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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('https://app.adalo.com/login')

WebUI.navigateToUrl('https://app.adalo.com/apps/fc4da42d-9168-4832-a83f-ec4a77454935/data/4d3dgsqgtes9zuzrv86mgujbh/t_cxr1omclbjkvshz03bto7du96 ')

WebUI.setText(findTestObject('Object Repository/Page_Adalo/input_Email Address_email'), 'admin@charitymakeover.org')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Adalo/input_Password_password'), 'aI9thhPQxj6jXiAcGc9qKV7KMwGutqxV')

WebUI.sendKeys(findTestObject('Object Repository/Page_Adalo/input_Password_password'), Keys.chord(Keys.ENTER))

for (int i = 1; i < 24; i++) {
    WebUI.click(findTestObject('Page_Wine App/div_dummy'))

    WebUI.click(findTestObject('Object Repository/Page_Wine App/span_TEST_icon icon-trash-small'))

    WebUI.acceptAlert()
}

WebUI.closeBrowser()

