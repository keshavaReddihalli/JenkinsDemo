package Scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class baseTest {
	WebDriver driver;
	@BeforeMethod
	public void preCondition() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\kreddiha\\Desktop\\Interview_2021\\JenkinMaven_Demo\\DemoFramework\\ExeFiles\\geckodriver-v0.29.0-win64\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
	}
	@AfterMethod
	public void postCondition() {
		driver.close();

	}


}
