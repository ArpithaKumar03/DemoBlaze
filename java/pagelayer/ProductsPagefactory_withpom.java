package pagelayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsPagefactory_withpom {

	//click addtocart button
	
	@FindBy(xpath = "//a[contains(text(),'Add to cart')]")
	private WebElement addtocartbutton;
WebDriver driver;
	
	public ProductsPagefactory_withpom(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

//	public void item1() {
//		driver.get("https://www.demoblaze.com/prod.html?idp_=1");
//	}
//	public void item2() {
//		driver.get("https://www.demoblaze.com/prod.html?idp_=2");
//	}
//	public void item3() {
//		driver.get("https://www.demoblaze.com/prod.html?idp_=3");
//	}
	public void addtocartbutton()
	{
		addtocartbutton.click();
	}

}
