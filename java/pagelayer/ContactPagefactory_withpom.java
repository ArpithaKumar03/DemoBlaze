package pagelayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactPagefactory_withpom {
	@FindBy(xpath = "//button[@onclick='send()']")
	private WebElement sendmessagebutton;	
WebDriver driver;
	public ContactPagefactory_withpom(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void sendmessagebutton() {
		sendmessagebutton.click();
		System.out.println("Negative Scenario found");
		System.out.println("Contact form sent without entering details");
		
	}
}
