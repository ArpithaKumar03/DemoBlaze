//package testlayer;
//
//import java.time.Duration;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import pagelayer.Pagefactory_withpom;
//import pagelayer.ProductsPagefactory_withpom;
//import pagelayer.CartPagefactory_withpom;
//import pagelayer.CategoriesPagefactory_withpom;
//import pagelayer.MenuPagefactory_withpom;
//import pagelayer.CategoriesPagefactory_withpom;
//
//public class Pagefactory_excution {
//	
//	//with page factory
//	public static void main(String[]args) throws InterruptedException
//	{
//		WebDriver driver = new ChromeDriver();
//		//driver.get("https://demoblaze.com/index.html");
//		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		
//		Pagefactory_withpom homepag = new Pagefactory_withpom(driver);
//		
//		MenuPagefactory_withpom menuchek = new MenuPagefactory_withpom(driver);
//		
//		CategoriesPagefactory_withpom categories = new CategoriesPagefactory_withpom(driver);
//		
//		ProductsPagefactory_withpom productsadd = new ProductsPagefactory_withpom(driver);
//		
//		CartPagefactory_withpom cartsection = new CartPagefactory_withpom(driver);
//		
//		driver.get("https://demoblaze.com");
//		Thread.sleep(3000);
////		menu and login Functionality
////		menuchek.homebutton();
////		Thread.sleep(3000);
////		menuchek.contact();
////		Thread.sleep(2000);
////		menuchek.contactclose();
////		Thread.sleep(2000);
////		menuchek.aboutus();
////		Thread.sleep(2000);
////		menuchek.aboutusclose();
////		Thread.sleep(2000);
////		menuchek.signup();
////		Thread.sleep(2000);
////		menuchek.signupclose();
////		homepag.loginlink();
////		Thread.sleep(2000);
////		homepag.verifyusername();
////		Thread.sleep(1000);
////		homepag.verifypassword();
////		homepag.loginbutton();
////		
////		//Categories Functionailty
////		Thread.sleep(3000);
////		categories.notebook();
////		Thread.sleep(2000);
////		categories.monitor();
////		Thread.sleep(2000);
////		categories.phone();
////		Thread.sleep(1000);
//		
//		//Products add 
//		
//		driver.get("https://www.demoblaze.com/prod.html?idp_=1");
//		Thread.sleep(2000);
//		productsadd.addtocartbutton();
//		Thread.sleep(2000);
//        String alertMsg1 = driver.switchTo().alert().getText();
//        System.out.println("-----item status for product 1 is : " + alertMsg1 + "-----");
//        driver.switchTo().alert().accept();
//		Thread.sleep(2000);
//		driver.get("https://www.demoblaze.com/prod.html?idp_=2");
//		Thread.sleep(2000);
//		productsadd.addtocartbutton();
//		Thread.sleep(2000);
//        String alertMsg2 = driver.switchTo().alert().getText();
//        System.out.println("-----item status for product 2 is : " + alertMsg2 + "-----");
//        driver.switchTo().alert().accept();
//		Thread.sleep(2000);
//		driver.get("https://www.demoblaze.com/prod.html?idp_=3");
//		Thread.sleep(2000);
//		productsadd.addtocartbutton();
//		Thread.sleep(2000);
//        String alertMsg3 = driver.switchTo().alert().getText();
//        System.out.println("-----item status for product 3 is : " + alertMsg3 + "-----");
//        driver.switchTo().alert().accept();
//        
//        // Cart Page
//        
//        cartsection.clickcartpage();
//        Thread.sleep(1000);
//        cartsection.placeorderbutton();
//        Thread.sleep(1000);
//        cartsection.nameTxtElement();
//        Thread.sleep(1000);
//        cartsection.countryTxtElement();
//        Thread.sleep(1000);
//        cartsection.cityTxtElement();
//        Thread.sleep(1000);
//        cartsection.cardTxtElement();
//        Thread.sleep(1000);
//        cartsection.monthElement();
//        Thread.sleep(1000);
//        cartsection.yearTxtElement();
//        Thread.sleep(1000);
//        cartsection.purchaseBtnElement();
//        Thread.sleep(1000);
//        cartsection.thanksMsgElement();
//        Thread.sleep(1000);
//        cartsection.okBtnElement();
//}
//}
