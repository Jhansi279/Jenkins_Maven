package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {
	 WebDriver driver;
	 
	@Before
	public void setUp()
	{
	    String chrome = "C://SE-United//WP//drivers//chromedriver.exe";
	    System.setProperty("webdriver.chrome.driver", chrome);
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	}
	
	@Given("I am able to navigate onto the login page")
	public void i_am_able_to_navigate_onto_the_login_page() {
		driver.get("https://opensource-demo.orangehrmlive.com");
	}

	@When("I enter the username as {string}")
	public void i_enter_the_username_as(String string) {
		 driver.findElement(By.id("txtUsername")).sendKeys(string);
    
	}
	@When("I enter the password as {string}")
	public void i_enter_the_password_as(String string) {
		driver.findElement(By.id("txtPassword")).sendKeys(string);
	}
	@When("I click on the login button")
	public void i_click_on_the_login_button() throws InterruptedException {
		driver.findElement(By.id("btnLogin")).click();
        Thread.sleep(600);
	}
	@Then("I should see the user name as {string}")
	public void i_should_see_the_user_name_as(String string) {
		 String expected = driver.findElement(By.id("welcome")).getText();
	        Assert.assertEquals("Invalid Login",expected, string);
	}
	
	@Then("I should see an error message as {string}")
    public void i_should_see_a_error_message_as(String string) {
        String getErrortext=driver.findElement(By.xpath("//span[@id='spanMessage']")).getText();
        Assert.assertEquals("Valid Login",getErrortext,"Invalid credentials");
    }

	@After
	   public void tearDown()
	  {
	    driver.close();
	  }

	
}
