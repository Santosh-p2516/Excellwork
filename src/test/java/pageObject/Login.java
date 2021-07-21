package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	
	WebDriver ldriver;
	public void LoginPage(WebDriver rdriver)
	{
	ldriver = rdriver;
	PageFactory.initElements(rdriver,this);
	
	}
	@FindBy(id="Email")
	WebElement txtUserName;
	
	@FindBy(id="Password")
	WebElement txtPassword;
	
	@FindBy(xpath="//button[normalize-space()='Log in']")
	WebElement btnLogin;
	
	public void setUserName(String uname)
	{
		txtUserName.sendKeys(uname);
		
	}
	
	public void setPassword(String pwd)
	{
		txtPassword.sendKeys(pwd);
		
	}
	
	public void clickSubmit()
	{
		btnLogin.click();
		
	}
	
	
	
	
	

}
