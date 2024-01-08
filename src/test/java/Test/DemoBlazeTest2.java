package Test;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Objects.CartPage;
import Objects.CheckoutPage;
import Objects.HomePage;
import Objects.LoginPage;
import Objects.ProductPage;
import Objects.SignUpPage;
import Objects.TestData;



public class DemoBlazeTest2 {
	    private WebDriver driver;
	    private SignUpPage signUpPage;
	    private HomePage homePage;
	    private LoginPage loginPage;
	    private ProductPage productPage;
	    private CartPage cartPage;
	    private CheckoutPage checkoutPage;

    
    @BeforeClass
    public void setUp() {
    	driver = new ChromeDriver();
        driver.navigate().to("https://demoblaze.com/");
        homePage = new HomePage(driver);
        signUpPage = new SignUpPage(driver);
        productPage = new ProductPage(driver);
        cartPage = new CartPage(driver);
        loginPage = new LoginPage(driver);
        checkoutPage = new CheckoutPage(driver);
    }
    
        
        @Test(priority = 0, dataProvider = "signupData", dataProviderClass = TestData.class)
        public void testSignUp(String username, String password) throws InterruptedException {
            //homePage.navigateToHomePage("https://www.demoblaze.com/");
            driver.findElement(By.id("signin2")).click();

         // Sign Up Page
            signUpPage.enterUsername(username);
            signUpPage.enterPassword(password);
            signUpPage.clickSignUpButton();
            //signUpPage.getAlertText();


        // Verify sign-up confirmation message
            WebDriverWait alertWait = new WebDriverWait(driver, Duration.ofSeconds(10));
            alertWait.until(ExpectedConditions.alertIsPresent());
            Alert alert = driver.switchTo().alert();
        	String alertText= alert.getText();
        	alert.accept();
            Assert.assertTrue(alertText.contains("Sign up successful."), "Sign up not successful");
            System.out.println("Signed up successfully");

         
    }

  
     @Test(priority = 1)
    	public void testLogin() throws InterruptedException {
    		 // Navigate to Login Page
    	 //homePage.navigateToHomePage("https://www.demoblaze.com/");
         //Thread.sleep(3000);
    	    driver.findElement(By.id("login2")).click();
    	    Thread.sleep(3000);

            // Login
            loginPage.enterUsername("AK95");
            loginPage.enterPassword("0000");
            loginPage.clickLogin();
            Thread.sleep(5000);

            // Verify logged-in user
            String loggedInUser = loginPage.getLoggedInUserName();
            Assert.assertEquals(loggedInUser, "Welcome AK95", "Login not successful");
            System.out.println("Logged in successfully");

            
    }
     
     
     
     
     
     @Test(priority = 2)
     public void testHomePage() {
    	 String expectedProduct = "Samsung galaxy s6";
    	 Assert.assertEquals(homePage.checkProduct(), expectedProduct);
         System.out.println("Home Page verified");

     }
     
     
     
     
     @Test(priority = 3)
     public void testAddProductToCart() throws InterruptedException {
         Thread.sleep(3000);
         homePage.clickProduct("Samsung galaxy s6");
         Thread.sleep(5000);
         productPage.addToCart();

         // Navigate to Cart Page and verify the product is added
         driver.findElement(By.id("cartur")).click();
         Thread.sleep(5000);
         String productInCart = cartPage.getProductInCart();
         String expectedInCart = "Samsung galaxy s6";
         Assert.assertEquals(productInCart, expectedInCart, "Product not added to cart successfully");
         System.out.println("Product added to the cart");

     }
     
     @Test(priority = 4)
     public void testCheckout() throws InterruptedException {
       
         // Navigate to Checkout Page
         driver.findElement(By.xpath("//button[normalize-space()='Place Order']")).click();
         Thread.sleep(3000);

         // Checkout
	        checkoutPage.enterName("Arpitha");
	        checkoutPage.enterCreditCardDetails("1234567890");
	        checkoutPage.clickPurchase();

         // Verify order confirmation
         String confirmationMessage = checkoutPage.getOrderConfirmationMessage();
         Assert.assertTrue(confirmationMessage.contains("Thank you for your purchase!"), "Order placement not successful");
         System.out.println("Order placed successfully");

     }
   
    
    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
