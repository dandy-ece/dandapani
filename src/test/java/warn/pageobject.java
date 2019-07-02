package warn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pageobject {
	WebDriver driver;
	public pageobject(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText="SignIn")
	public static WebElement signin;
	@FindBy(linkText="userName")
	public static WebElement username;
	@FindBy(linkText="password")
	public static WebElement password;
	@FindBy(linkText="Login")
	public static WebElement Login;


}
