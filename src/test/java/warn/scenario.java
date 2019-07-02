package warn;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class scenario {
	WebDriver driver;
	@Given("Navigate to homepage")
	public void navigate_to_homepage() {
		System.setProperty("webdriver.chrome.driver", "C:\\NexGenTesting\\dhandhu\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
	 pageobject.signin.click();
	 pageobject.username.sendKeys("mercury");
	 pageobject.password.sendKeys("mercury");
	 pageobject.Login.click();
	}
	@Then("user logged in successfully")
	public void user_logged_in_successfully() {
	    System.out.println("user login successfully");
	}




}
