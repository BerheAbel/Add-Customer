package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddCustomerLogin {

	WebDriver driver;
public AddCustomerLogin(WebDriver driver){
		this.driver= driver;
	}
	@FindBy(how = How.XPATH,using = "//*[@id=\"username\"]") WebElement USERNAME;
	@FindBy(how = How.XPATH,using = "//*[@id=\"password\"]") WebElement PASSWORD;
	@FindBy(how = How.XPATH,using = "/html/body/div/div/div/form/div[3]/button") WebElement LOGIN;
	@FindBy(how = How.XPATH,using = "//*[@id=\"side-menu\"]/li[3]/a/span[1]") WebElement ADDCUSTOMER1 ;
	@FindBy(how = How.XPATH,using = "//*[@id=\"side-menu\"]/li[3]/ul/li[1]/a") WebElement ADDCUSTOMER2;
	
	public void putusername(String username) {
		
		USERNAME.sendKeys(username);
			}
	public void Identity(String password) {
		PASSWORD.sendKeys(password);
	}
	public void ClikLogin() {
		LOGIN.click();
			}
	public void ADD1() {
		ADDCUSTOMER1.click();
	}
	public void ADD2() {
		ADDCUSTOMER2.click();
	}	
	

}
