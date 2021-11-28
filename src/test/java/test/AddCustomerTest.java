package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import page.AddCustomerLogin;
import page.Validation;
import util.BrowserFactory;

public class AddCustomerTest {
	
	WebDriver driver;
	@Test
	public void TestPage() {
		
		driver = BrowserFactory.LaunchBrowser();
		
		AddCustomerLogin homeW = PageFactory.initElements(driver, AddCustomerLogin.class);
		homeW.putusername("demo@techfios.com");
		homeW.Identity("abc123");
		homeW.ClikLogin();
		homeW.ADD1();
		homeW.ADD2();
		Validation validate = PageFactory.initElements(driver, Validation.class);
		validate.AddAssertion();
		driver = BrowserFactory.teardown();
		
	}

}
