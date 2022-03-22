package stepDef;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefOpenOrange {
	WebDriver driver;
	@Given("I want to the verify the openOrangeUrl")
	public void i_want_to_the_verify_the_openOrangeUrl() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}

	@When("I want to enter the valid credentials below credentials")
	public void i_want_to_enter_the_valid_credentials_below_credentials(io.cucumber.datatable.DataTable dataTable) {
		List<String> credential = dataTable.asList();
		String userName = credential.get(0);
		String password = credential.get(1);
		driver.findElement(By.id("txtUsername")).sendKeys(userName);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
	}
	@When("click the submit the button")
	public void click_the_submit_the_button() {
		driver.findElement(By.id("btnLogin")).click();
	}

	@Then("verify the webpage")
	public void verify_the_webpage() {
		System.out.println("All the best");
	}
}
