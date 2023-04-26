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

CucumberKW.comment('Verifikasi Element untuk cek setiap object yang muncul')

'Verifikasi List Data Tracking'
WebUI.verifyElementPresent(findTestObject('Verify2/3.3 Status Pengajuan Terbaru'), 0, FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

'Verifikasi Pengajuan'
WebUI.verifyElementPresent(findTestObject('Verify2/3.1 Tipe Aplikasi Pengajuan'), 0, FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

'Verifikasi Tanggal Pengajuan'
WebUI.verifyElementPresent(findTestObject('Verify2/3.4 Tanggal Pengajuan'), 0, FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

'Verifikasi Kendaraan yang diajukan'
WebUI.verifyElementPresent(findTestObject('Verify2/3.2 Merk - Model Kendaraan'), 0, FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

'Verifikasi Flow Tracking Sampai di ?'
WebUI.verifyElementPresent(findTestObject('Verify2/3.5 Status Pengajuan'), 0, FailureHandling.STOP_ON_FAILURE)

'Melakukan screenshoot full page'
WebUI.takeFullPageScreenshotAsCheckpoint((userDir + GlobalVariable.sswebviewtracking) + 'Screenshoot Web Tracking List Pengajuan.png')

KeywordUtil.markPassed('Screenshoot Web Tracking List Pengajuan')

WebUI.delay(5)

'Halaman Detail Pengajuan '
WebUI.click(findTestObject('Status Pengajuan/List Data 1'))

CucumberKW.comment('Info Detail List Pengajuan')

WebUI.delay(3)

'Verifikasi Status Pengajuan Sampai Mana'
WebUI.verifyElementPresent(findTestObject('Status Pengajuan/1.2 Info Pengajuan'), 0)

WebUI.delay(3)

'verifikasi tanggal pengajuan'
WebUI.verifyElementPresent(findTestObject('Status Pengajuan/1.1 Tanggal Pengajuan'), 0)

WebUI.delay(3)

'Verifikasi Button Info'
WebUI.verifyElementPresent(findTestObject('Status Pengajuan/1.2 Info Pengajuan'), 0)

WebUI.delay(3)

'Verifikasi No Request ID'
WebUI.verifyElementPresent(findTestObject('Status Pengajuan/1.4 Request ID'), 0)

WebUI.delay(3)

'Verifikasi nama yang mengajukan'
WebUI.verifyElementPresent(findTestObject('Status Pengajuan/1.5 Nama Pengaju'), 0)

WebUI.delay(3)

'verifikasi merk kendaraan'
WebUI.verifyElementPresent(findTestObject('Status Pengajuan/1.6 Merk Kendaraan'), 0)

WebUI.delay(3)

'verifikasi kondisi kendaraan'
WebUI.verifyElementPresent(findTestObject('Status Pengajuan/1.7 Kondisi Kendaraan'), 0)

WebUI.delay(3)

'verifikasi tanggal pengajuan dalam list kendaraan'
WebUI.verifyElementPresent(findTestObject('Status Pengajuan/1.8 Info Tanggal Pengajuan'), 0)

WebUI.delay(3)

'verifikasi model kendaraan'
WebUI.verifyElementPresent(findTestObject('Status Pengajuan/1.9 Model Kendaraan'), 0)

WebUI.delay(3)

'verifikasi nomber polisi'
WebUI.verifyElementPresent(findTestObject('Status Pengajuan/1.10 Nomber Police'), 0)

WebUI.delay(3)

'Melakukan screenshoot full page'
WebUI.takeFullPageScreenshotAsCheckpoint((userDir + GlobalVariable.sswebviewtracking) + 'Screenshoot Web Tracking Halaman Detail Pengajuan.png')

KeywordUtil.markPassed('Screenshoot Web Tracking Halaman Detail Pengajuan')

CucumberKW.comment('Halaman Detail sampai mana')

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Status Pengajuan/1.15 Info Realisasi'), 0)

'verifikasi pengajuan awal'
WebUI.verifyElementPresent(findTestObject('Status Pengajuan/1.11 Info Pengajuan Received'), 0)

WebUI.delay(3)

'verifikasi in progress'
WebUI.verifyElementPresent(findTestObject('Status Pengajuan/1.12 Info Progress'), 0)

WebUI.delay(3)

'verifikasi mengunggu di approve'
WebUI.verifyElementPresent(findTestObject('Status Pengajuan/1.13 Info Menunggu Approve'), 0)

WebUI.delay(3)

'verifikasi tagihan masuk'
WebUI.verifyElementPresent(findTestObject('Status Pengajuan/1.14 Info Tagihan Masuk'), 0)

WebUI.delay(3)

'verifikasi bahwa pengajuan sudah sampai realisasi'
WebUI.verifyElementPresent(findTestObject('Status Pengajuan/1.15 Info Realisasi'), 0)

WebUI.delay(5)

'Melakukan screenshoot full page'
WebUI.takeFullPageScreenshotAsCheckpoint((userDir + GlobalVariable.sswebviewtracking) + 'Screenshoot Web Tracking Halaman Detail Pengajuan sampai mana.png')

KeywordUtil.markPassed('Screenshoot Web Tracking Halaman Detail Pengajuan sampai mana')

CucumberKW.comment('Web Tracking Info setiap pengajuan')

WebUI.scrollToElement(findTestObject('Status Pengajuan/1.3 Status Pengajuan'), 0)

WebUI.click(findTestObject('Status Pengajuan/1.2 Info Pengajuan'))

WebUI.delay(3)

'Verifikasi Info status pengajuan'
WebUI.verifyElementPresent(findTestObject('Status Pengajuan/Info Status Pengajuan/2.1 Info Status Pengajuan'), 0)

WebUI.delay(3)

'Info aplikasi diterima'
WebUI.verifyElementPresent(findTestObject('Status Pengajuan/Info Status Pengajuan/2.2 Info Aplikasi Diterima'), 0)

WebUI.delay(3)

'Info progress aplikasi'
WebUI.verifyElementPresent(findTestObject('Status Pengajuan/Info Status Pengajuan/2.3 Info Progress Aplikasi'), 0)

WebUI.delay(3)

'Info menunggu approve'
WebUI.verifyElementPresent(findTestObject('Status Pengajuan/Info Status Pengajuan/2.4 Info Menunggu Approve'), 0)

WebUI.delay(3)

'Info tagihan masuk'
WebUI.verifyElementPresent(findTestObject('Status Pengajuan/Info Status Pengajuan/2.5 Info Tagihan Masuk'), 0)

WebUI.delay(3)

'Info realisasi'
WebUI.verifyElementPresent(findTestObject('Status Pengajuan/Info Status Pengajuan/2.6 Info Realisasi'), 0)

WebUI.delay(3)

'Info pengajuan tidak diterima'
WebUI.verifyElementPresent(findTestObject('Status Pengajuan/Info Status Pengajuan/2.8 Info Pengajuan Tidak Diterima'), 0)

WebUI.delay(3)

'Info pengajuan dicancel'
WebUI.verifyElementPresent(findTestObject('Status Pengajuan/Info Status Pengajuan/2.7 Info Pengajuan Dicancel'), 0)

WebUI.delay(3)

'Melakukan screenshoot full page'
WebUI.takeFullPageScreenshotAsCheckpoint((userDir + GlobalVariable.sswebviewtracking) + 'Screenshoot Web Tracking Info Pengajuan.png')

KeywordUtil.markPassed('Screenshoot Web Tracking Info Pengajuan')

WebUI.delay(5)

