package Scripts;

import org.testng.annotations.Test;

import Generic.Excel;
import POM.loginPage;

public class verifyloginPage extends baseTest {
	@Test
	public void verifyLogin() {
		String xlpath="C:\\Users\\kreddiha\\Desktop\\Interview_2021\\JenkinMaven_Demo\\DemoFramework\\testData\\TDR.xlsx";
		String sheet="login";
		String userName=Excel.getcellData(xlpath,sheet,1,0);
		String passWord=Excel.getcellData(xlpath,sheet,1,1);
		loginPage l1=new loginPage(driver);
		l1.setuserName(userName);
		l1.setpassWord(passWord);
		l1.loginButton();

}}
