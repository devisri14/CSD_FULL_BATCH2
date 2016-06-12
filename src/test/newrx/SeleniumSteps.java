package test.newrx;

import java.util.concurrent.TimeUnit;

import junit.framework.TestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SeleniumSteps extends TestCase {
	
	WebDriver driver;

	@Given("^the patient opened \"([^\"]*)\" browser$")
	public void the_patient_opened_browser(String arg1) throws Throwable {
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		

	}

	@Given("^enter \"([^\"]*)\"$")
	public void enter(String arg1) throws Throwable {
		driver.get("localhost:8888");
	}

	@Given("^enter \"([^\"]*)\" as patient name$")
	public void enter_as_patient_name(String arg1) throws Throwable {
		driver.findElement(By.id("pname")).sendKeys(arg1);
	}

	@Given("^enter  \"([^\"]*)\" as doctor name$")
	public void enter_as_doctor_name(String arg1) throws Throwable {
		driver.findElement(By.id("dname")).sendKeys(arg1);

	}

	@Given("^enter  \"([^\"]*)\"  as visit data$")
	public void enter_as_visit_data(String arg1) throws Throwable {
		driver.findElement(By.id("vdate")).sendKeys(arg1);
	}

	@Given("^enter \"([^\"]*)\"  as visit time$")
	public void enter_as_visit_time(String arg1) throws Throwable {
		driver.findElement(By.id("vtime")).sendKeys(arg1);
	}

	@Given("^enter \"([^\"]*)\" as reason$")
	public void enter_as_reason(String arg1) throws Throwable {
		driver.findElement(By.id("reason")).sendKeys(arg1);
	}

	@Given("^enter \"([^\"]*)\" as uploaded Rx.$")
	public void enter_as_uploaded_Rx(String arg1) throws Throwable {
		driver.findElement(By.id("filename")).sendKeys(arg1);
	}

	@When("^they click \"([^\"]*)\"$")
	public void they_click(String arg1) throws Throwable {
		driver.findElement(By.id("upload")).click();
		Thread.sleep(2000);
		System.out.println("Working");   
	}

	@Then("^it show \"([^\"]*)\" message$")
	public void it_show_message(String arg1) throws Throwable {
		String result = driver.findElement(By.id("result")).findElement(By.tagName("p")).getText();
	   assertEquals(arg1, result);
	   driver.quit();
	}

}
