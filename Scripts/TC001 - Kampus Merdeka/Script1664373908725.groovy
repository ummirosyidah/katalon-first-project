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

WebUI.navigateToUrl('https://kampusmerdeka.kemdikbud.go.id/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Page_Home  Merdeka Belajar - Kampus Merdeka/p_Masuk'))

WebUI.setText(findTestObject('Page_Home  Merdeka Belajar - Kampus Merdeka/input_email'), 'rosyidah045@gmail.com')

WebUI.setText(findTestObject('Page_Home  Merdeka Belajar - Kampus Merdeka/input_password'), '@Ummi@123')

WebUI.click(findTestObject('Object Repository/Page_Home  Merdeka Belajar - Kampus Merdeka/div_Masuk'))

WebUI.click(findTestObject('Object Repository/Page_Profile - Edit  Merdeka Belajar - Kamp_f1b43b/div_ProfilPerlu Dilengkapi'))

WebUI.click(findTestObject('Object Repository/Page_Profile - Edit  Merdeka Belajar - Kamp_f1b43b/div_Data Pribadi'))

WebUI.click(findTestObject('Object Repository/Page_Profile - Info  Merdeka Belajar - Kamp_60bce4/div_Lacak Status PendanaanBaru'))

WebUI.click(findTestObject('Object Repository/Page_Pencairan Dana  Merdeka Belajar - Kamp_7c7cb5/p_Pertukaran Mahasiswa Merdeka'))

WebUI.doubleClick(findTestObject('Object Repository/Page_Pencairan Dana  Merdeka Belajar - Kamp_7c7cb5/div_Lacak Bantuan Biaya'))

WebUI.click(findTestObject('Object Repository/Page_Pencairan Dana  Merdeka Belajar - Kamp_7c7cb5/div_AkunKegiatankuSurvei KebhinekaanKeluar'))

WebUI.click(findTestObject('Object Repository/Page_Pencairan Dana  Merdeka Belajar - Kamp_7c7cb5/div_Kegiatanku'))

WebUI.click(findTestObject('Object Repository/Page_Pencairan Dana  Merdeka Belajar - Kamp_7c7cb5/p_Kegiatan Aktif'))

WebUI.click(findTestObject('Object Repository/Page_Activity  Merdeka Belajar - Kampus Merdeka/p_Sample Position'))

WebUI.click(findTestObject('Object Repository/Page_Activity Detail  Merdeka Belajar - Kam_902b2f/div_Lihat HistoriHistori KegiatanHistori La_a69429'))

WebUI.click(findTestObject('Object Repository/Page_Activity Detail  Merdeka Belajar - Kam_902b2f/div_AkunKegiatankuSurvei KebhinekaanKeluar'))

WebUI.click(findTestObject('Object Repository/Page_Activity Detail  Merdeka Belajar - Kam_902b2f/div_Keluar'))

