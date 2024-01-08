package pagelayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Homepage {
	
	//declaration
	
	private WebElement loginlink;
	private WebElement username;
	private WebElement password;
	private WebElement loginbutton;
	
	WebDriver driver;

	
	// iniliazation
	
	public Homepage(WebDriver driver)
	{
		
		loginlink =  driver.findElement(By.xpath("//a[@id='login2']"));
		username = driver.findElement(By.xpath("//input[@id='loginusername']"));
		password = driver.findElement(By.xpath("//input[@id='loginpassword']"));
	   loginbutton = driver.findElement(By.xpath("//button[normalize-space()='Log in']"));
		
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
