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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import java.awt.Robot as Robot

Robot robot = new Robot()

String userDir = RunConfiguration.getProjectDir()

WebUI.openBrowser('')

WebUI.navigateToUrl('https://tracking.idofocus.co.id:25443/status-pengajuan?request_id=' + GlobalVariable.request_id)

WebUI.delay(5)

CucumberKW.comment('Setting untuk data pengajuan yang ditampilkan')

WebUI.click(findTestObject('Filter By/Page_BcafTracking/5.1 Dropdown Filter By'), FailureHandling.OPTIONAL)

WebUI.delay(3)

'Melakukan screenshoot full page'
WebUI.takeFullPageScreenshotAsCheckpoint((userDir + GlobalVariable.sswebviewtracking) + 'Screenshoot Web Setting.png')

KeywordUtil.markPassed('Screenshoot Web Setting')

WebUI.click(findTestObject('Filter By/Page_BcafTracking/5.4 button_Terlama'), FailureHandling.OPTIONAL)

'Melakukan screenshoot full page'
WebUI.takeFullPageScreenshotAsCheckpoint((userDir + GlobalVariable.sswebviewtracking) + 'Screenshoot Short Terlama.png')

KeywordUtil.markPassed('Screenshoot Short Terlama')

WebUI.click(findTestObject('Filter By/Page_BcafTracking/5.3 button_Terbaru'), FailureHandling.OPTIONAL)

WebUI.delay(2)

not_run: WebUI.click(findTestObject('Filter By/Page_BcafTracking/5.15 Input Semua Transaksi'), FailureHandling.OPTIONAL)

WebUI.delay(2)

WebUI.click(findTestObject('Filter By/Page_BcafTracking/5.8 Checkbox aplikasi pembiayaan'), FailureHandling.OPTIONAL)

WebUI.delay(2)

WebUI.click(findTestObject('Filter By/Page_BcafTracking/5.9 Upgrade Asuransi'), FailureHandling.OPTIONAL)

WebUI.delay(2)

WebUI.click(findTestObject('Filter By/Page_BcafTracking/5.10 Renewal Asuransi'), FailureHandling.OPTIONAL)

WebUI.delay(2)

WebUI.click(findTestObject('Filter By/Page_BcafTracking/5.10 Pengurusan BPKB'), FailureHandling.OPTIONAL)

WebUI.delay(2)

'Melakukan screenshoot full page'
WebUI.takeFullPageScreenshotAsCheckpoint((userDir + GlobalVariable.sswebviewtracking) + 'Screenshoot Semua transaksi.png')

KeywordUtil.markPassed('Screenshoot Semua transaksi')

WebUI.scrollToElement(findTestObject('Filter By/Page_BcafTracking/5.2 button Terapkan'), 0)

WebUI.delay(2)

'Melakukan screenshoot full page'
WebUI.takeFullPageScreenshotAsCheckpoint((userDir + GlobalVariable.sswebviewtracking) + 'Screenshoot Status.png')

KeywordUtil.markPassed('Screenshoot Status')

not_run: WebUI.click(findTestObject('Filter By/Page_BcafTracking/5.16 Input Semua Status'), FailureHandling.OPTIONAL)

WebUI.delay(2)

WebUI.click(findTestObject('Filter By/Page_BcafTracking/5.11 Checkbox Received'), FailureHandling.OPTIONAL)

WebUI.delay(2)

WebUI.click(findTestObject('Filter By/Page_BcafTracking/5.12 checkbox inprogress'), FailureHandling.OPTIONAL)

WebUI.delay(2)

WebUI.click(findTestObject('Filter By/Page_BcafTracking/5.13 checkbox wait approval'), FailureHandling.OPTIONAL)

WebUI.delay(2)

WebUI.click(findTestObject('Filter By/Page_BcafTracking/5.17 checkbox berhasil'), FailureHandling.OPTIONAL)

WebUI.delay(2)

WebUI.click(findTestObject('Filter By/Page_BcafTracking/5.14 checkbox Gagal-dibatalkan-expired'), FailureHandling.OPTIONAL)

WebUI.delay(2)

'Melakukan screenshoot full page'
WebUI.takeFullPageScreenshotAsCheckpoint((userDir + GlobalVariable.sswebviewtracking) + 'Screenshoot Checkbox Final.png')

KeywordUtil.markPassed('Screenshoot Checkbox Final')

WebUI.click(findTestObject('Filter By/Page_BcafTracking/5.2 button Terapkan'), FailureHandling.OPTIONAL)

WebUI.delay(3)

'Melakukan screenshoot full page'
WebUI.takeFullPageScreenshotAsCheckpoint((userDir + GlobalVariable.sswebviewtracking) + 'Screenshoot Tampilan List Pengajuan.png')

KeywordUtil.markPassed('Screenshoot Tampilan List Pengajuan')

WebUI.delay(5)

