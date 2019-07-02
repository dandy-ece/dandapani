package warn;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

//import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import okhttp3.Credentials;

public class suriya {
	 WebDriver driver;
	    public class Credentials
	    {	
        public String username;
        public String password;
	    }
	@Given("^user is on the login homepage$")
	public void user_is_on_the_login_homepage() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\NexGenTesting\\dhandhu\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demoaut.com/");
		
        driver.manage().window().maximize();
        //driver.get("http://demoaut.com/");
   	}


	@When("user enters below credentails and clicks sign in")
	public void user_enters_below_credentails_and_clicks_sign_in(List<Credentials> userdata) {
		for(Credentials credentials:userdata){

	          driver.findElement(By.name("userName")).sendKeys(credentials.username);
	          driver.findElement(By.name("password")).sendKeys(credentials.password);
	          driver.findElement(By.name("login")).click();
	          driver.navigate().back();
	         	}
	    
	}

	
	@Then("the expected behavior could be like this")
	public void the_expected_behavior_could_be_like_this() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("end");
	}

	    }

