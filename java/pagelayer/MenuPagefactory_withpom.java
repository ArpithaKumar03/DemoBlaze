package pagelayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MenuPagefactory_withpom { 
	

	
	@FindBy(xpath="//a[@id='login2']")
	private WebElement loginlink;
	
	
	//click homebutton
	
	@FindBy(xpath = "//div[@id='navbarExample']/ul//a[@href='index.html']")
	private WebElement homebutton;
	
	// click contact
	@FindBy(xpath = "//div[@id='navbarExample']/ul/li[2]/a[@href='#']")
	private WebElement contact;

	// click contactclose button
	@FindBy(xpath="//div[@id=\"exampleModal\"]/div/div/div[1]/button[@class='close']")
	private WebElement contactclose;
	
	// click aboutus button
	@FindBy(xpath="//div[@id='navbarExample']/ul/li[3]/a[@href='#']")
	private WebElement aboutus;
	
	// click aboutusclose button
	@FindBy(xpath="//div[@id='videoModal']//div[@class='modal-header']/button[@type='button']/span[.='×']")
	private WebElement aboutusclose;
	
	
	// click login button
	
	@FindBy(xpath="//button[normalize-space()='Log in']")
	private WebElement loginbutton;
	
	@FindBy(xpath="//a[@id='signin2']")
	private WebElement signupbutton;

	@FindBy(xpath="//div[@id=\"signInModal\"]/div/div/div[3]/button[1]")
	private WebElement signupbuttonclose;
	
WebDriver driver;
	
	public MenuPagefactory_withpom(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void loginlink()
	{
		loginlink.click();
	}
	public void homebutton()
	{
		homebutton.click();
	}	
	
	public void contact() 
	{
		contact.click();
			
	}
	
	public void contactclose(){
		contactclose.click();
	
	}
	
	public void aboutus() throws InterruptedException {
		aboutus.click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("/html")).click();
//		
	}

	
	public void aboutusclose(){
		aboutusclose.click();
	
	}	

	public void signup(){
		signupbutton.click();
	
	}	
	public void signupclose(){
		signupbuttonclose.click();
	
	}		
}
