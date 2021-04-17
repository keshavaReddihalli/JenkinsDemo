package POM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class loginPage {
	@FindBy(xpath="//input[@id='email']")
	private WebElement userName;
	@FindBy(xpath="//input[@id='pass']")
	private WebElement passWord;
	@FindBy(xpath="//button[@name='login']")
	private WebElement btn;

	public loginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}
	public void setuserName(String usrName) {

		userName.sendKeys(usrName);
	}
	public void setpassWord(String pass) {

		passWord.sendKeys(pass);
	}
	public void loginButton() {
		btn.click();
	}
}
