package pagelayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dev.failsafe.internal.util.Assert;

public class CartPagefactory_withpom {
	// click cart page
	@FindBy(xpath = "//a[@href='cart.html']")
	private WebElement cartpagebutton;	
	
	//click placeOrder button
	
	@FindBy(xpath = "//*[text() = 'Place Order']")
	private WebElement placeorderbutton;
	//click nameTxt
	
	@FindBy(id = "name")
	private WebElement nameTxt;
	//click cityTxt
	
	@FindBy(id = "city")
	private WebElement cityTxt;
	//click countryTxt
	
	@FindBy(id = "country")
	private WebElement countryTxt;
	//click cardTxt
	
	@FindBy(id = "card")
	private WebElement cardTxt;
	//click monthTxt
	
	@FindBy(id = "month")
	private WebElement monthTxt;
	//click yearTxt
	
	@FindBy(id = "year")
	private WebElement yearTxt;
	//click purchaseBtn
	
	@FindBy(xpath = "//*[@onclick = 'purchaseOrder()']")
	private WebElement purchaseBtn;
	
	//click thanksMsg
	
	@FindBy(xpath = "//div[10]/h2")
	private WebElement thanksMsg;
	
	//click okBtn
	
	@FindBy(xpath = "//*[text() = 'OK']")
	private WebElement okBtn;
WebDriver driver;
	
	public CartPagefactory_withpom(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void clickcartpage() {
		cartpagebutton.click();
		System.out.println("-----Navigated to Cart page-----");
	}

	public void placeorderbutton()
	{
		placeorderbutton.click();
		System.out.println("-----Place order button clicked-----");
	}
	public void nameTxtElement()
	{
		nameTxt.sendKeys("Ravi");
        System.out.println("-----Name added-----");
	}
	public void countryTxtElement()
	{
		countryTxt.sendKeys("India");
        System.out.println("-----Country added-----");
	}
	public void cityTxtElement()
	{
		cityTxt.sendKeys("Hyderabad");
        System.out.println("-----City added-----");
	}
	public void cardTxtElement()
	{
		cardTxt.sendKeys("1234567890123456");
        System.out.println("-----Card details added-----");
	}
	public void monthElement()
	{
		monthTxt.sendKeys("1");
        System.out.println("-----Month added-----");
	}
	public void yearTxtElement()
	{
		yearTxt.sendKeys("2025");
		System.out.println("-----Year added-----");
	}

	public void purchaseBtnElement()
	{
		purchaseBtn.click();
	}
	public void thanksMsgElement()
	{
		thanksMsg.click();
      String thanks = thanksMsg.getText();
      System.out.println("-----order Status is : " + thanks + "-----");
	}
	public void okBtnElement()
	{
		okBtn.click();
	}
}

//
//import java.io.IOException;
//import java.util.List;
//
//public class CartPagefactory_withpom{
//    public CartPagefactory_withpom() throws IOException {
//    }
//
////    By categoriesList = By.className("list-group-item");
////    By itemLink = By.linkText("Samsung galaxy s6");
////    By addToCartBtn = By.xpath("//*[@onclick = 'addToCart(1)']");
////    By headerCartBtn = By.linkText("Cart");
////    By deleteBtn = By.linkText("Delete");
//    By placeOrderBtn = By.xpath("//*[text() = 'Place Order']");
//    By nameTxt = By.id("name");
//    By countryTxt = By.id("country");
//    By cityTxt = By.id("city");
//    By cardTxt = By.id("card");
//    By monthTxt = By.id("month");
//    By yearTxt = By.id("year");
//    By purchaseBtn = By.xpath("//*[@onclick = 'purchaseOrder()']");
//    By thanksMsg = By.xpath("/html/body/div[10]/h2");
//    By okBtn = By.xpath("//*[text() = 'OK']");
//
//
//    public void chooseCategoryAndCheckItsItems() {
//        List<WebElement> categoriesListElements = driver.findElements(categoriesList);
//        if (!categoriesListElements.isEmpty()) {
//            categoriesListElements.get(1).click();
//            String selectedCategory = categoriesListElements.get(1).getText();
//            System.out.println("-----selected category is " + selectedCategory + "-----");
//        } else {
//            System.out.println("-----there is no categories-----");
//        }
//        WebElement itemLinkElement = driver.findElement(itemLink);
//        boolean phoneItem = itemLinkElement.isDisplayed();
//        Assert.assertTrue(phoneItem, "-----phone category has no items-----");
//        System.out.println("-----phones category has item called " + itemLinkElement.getText() + "-----");
//    }
//
//    public void addRandomItemToCart() {
//        WebElement itemLinkElement = driver.findElement(itemLink);
//        itemLinkElement.click();
//        WebElement addToCartBtnElement = driver.findElement(addToCartBtn);
//        addToCartBtnElement.click();
//    }
//
//    public void acceptAddedAlertDialog() throws InterruptedException {
//        Thread.sleep(2000);
//        String alertMsg = driver.switchTo().alert().getText();
//        System.out.println("-----item status is : " + alertMsg + "-----");
//        driver.switchTo().alert().accept();
//    }
//
//    public void openCartPage() {
//        WebElement headerCartBtnElement = driver.findElement(headerCartBtn);
//        headerCartBtnElement.click();
//    }
//
//    public void deleteCartItem() {
//        WebElement deleteBtnElement = driver.findElement(deleteBtn);
//        deleteBtnElement.click();
//    }
//
//    public void clickPlaceOrder() {
//        WebElement placeOrderBtnElement = driver.findElement(placeOrderBtn);
//        placeOrderBtnElement.click();
//    }
//
//    public void fillAndSaveOrderInfo() {
//        WebElement nameTxtElement = driver.findElement(nameTxt);
//        nameTxtElement.sendKeys("mohamed saber");
//        WebElement countryTxtElement = driver.findElement(countryTxt);
//        countryTxtElement.sendKeys("egypt");
//        WebElement cityTxtElement = driver.findElement(cityTxt);
//        cityTxtElement.sendKeys("mansoura");
//        WebElement cardTxtElement = driver.findElement(cardTxt);
//        cardTxtElement.sendKeys("1234567890123456");
//        WebElement monthElement = driver.findElement(monthTxt);
//        monthElement.sendKeys("4");
//        WebElement yearTxtElement = driver.findElement(yearTxt);
//        yearTxtElement.sendKeys("1997");
//        WebElement purchaseBtnElement = driver.findElement(purchaseBtn);
//        purchaseBtnElement.click();
//    }
//
//    public void verifyInvoiceDialogAndAccept() throws InterruptedException {
//        Thread.sleep(2000);
//        SoftAssert softAssert = new SoftAssert();
//        WebElement thanksMsgElement = driver.findElement(thanksMsg);
//        boolean thanks = thanksMsgElement.isDisplayed();
//        softAssert.assertTrue(thanks, "-----order not completed-----");
//        System.out.println("-----order status is " + thanksMsgElement.getText() + "-----");
//        WebElement okBtnElement = driver.findElement(okBtn);
//        okBtnElement.click();
//    }
//}

