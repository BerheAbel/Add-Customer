package util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class BrowserFactory {

	static WebDriver driver;

	@Test
	public static WebDriver LaunchBrowser() {

		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.techfios.com/billing/?ng=admin/");
		return driver;
	}
	@AfterTest
	public static WebDriver teardown() {
		driver.close();
		driver.quit();
		return driver;
	}
}
