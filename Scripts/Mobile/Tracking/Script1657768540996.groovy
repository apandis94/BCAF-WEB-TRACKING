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

Mobile.startExistingApplication('com.android.chrome')

Mobile.tap(findTestObject('TO 2/android.widget.EditText - tracking.idofocus.co.id25443status-pengajuanrequest_id'), 0)

Mobile.setText(findTestObject('Object Repository/TO_Browser/android.widget.EditText - Telusuri atau ketik alamat web'), 
    'https://tracking.idofocus.co.id:25443/status-pengajuan?request_id=' + '\\n', 0)

Mobile.tap(findTestObject('Object Repository/TO_Browser/android.widget.Button -  Filter By'), 0)

Mobile.tap(findTestObject('Object Repository/TO_Browser/android.view.View'), 0)

Mobile.swipe(0, 1000, 0, 400)

Mobile.tap(findTestObject('Object Repository/TO_Browser/android.widget.Button - TERLAMA'), 0)

Mobile.tap(findTestObject('Object Repository/TO_Browser/android.widget.Button - TERBARU'), 0)

Mobile.tapAndHold(findTestObject('TO_Browser/android.widget.Button - TERAPKAN (1)'), 5, 5)

Mobile.closeApplication()

