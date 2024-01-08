package pagelayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pagefactory_withpom { 
	
	//with page factory
	
    // identify web element
	// identify loginlink
	
	@FindBy(xpath="//a[@id='login2']")
	private WebElement loginlink;
	
	
	//udentifyn user name
	
	@FindBy(xpath = "//input[@id='loginusername']")
	private WebElement username;
	
	// indentify password
	@FindBy(xpath = "//input[@id='loginpassword']")
	private WebElement password;
	
	// find login button
	
	@FindBy(xpath="//button[normalize-space()='Log in']")
	private WebElement loginbutton;
	
WebDriver driver;
	
	public Pagefactory_withpom(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void loginlink()
	{
		loginlink.click();
	}
	
	public void verifyusername() 
	{
		username.sendKeys("AK95");
			
	}
	
	public void verifypassword() {
		password.sendKeys("0000");
	}

	
	
	public void loginbutton() {
		
		loginbutton.click();
		
	}
	
		
}
