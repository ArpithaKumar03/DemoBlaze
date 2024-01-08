package pagelayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CategoriesPagefactory_withpom {
	
	//click phones
	
	@FindBy(xpath = "//a[@onclick=\"byCat('phone')\"]")
	private WebElement phone;
	
	//click notebook
	
	@FindBy(xpath = "//a[@onclick=\"byCat('notebook')\"]")
	private WebElement notebook;
	
	
	//click monitor
	
	@FindBy(xpath = "//a[@onclick=\"byCat('monitor')\"]")
	private WebElement monitor;
WebDriver driver;
	
	public CategoriesPagefactory_withpom(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void phone()
	{
		phone.click();
	}
	public void notebook()
	{
		notebook.click();
	}
	public void monitor()
	{
		monitor.click();
	}
}
