package bella2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {
	WebDriver driver;
	@Before
public void init() {
		
		
		System.setProperty("webdriver.chrome.driver", "pra\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://techfios.com/register/login");
	}
	@Test
	public void testlocater() {
		
//		driver.findElement(By.id("form_username_email")).sendKeys("abelberhe2127@gmail.com");
//		driver.findElement(By.id("form_password")).sendKeys("Lala#201415");
//		driver.findElement(By.name("btn_login")).click();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("lala");
	
	}
//	@After
	public void endtear() {
	
		driver.close();
		
	}

}
