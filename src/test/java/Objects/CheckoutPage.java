package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {
    private final WebDriver driver;

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
    }
    
    public void enterName(String name) {
        driver.findElement(By.id("name")).sendKeys(name);
    }

    public void enterShippingAddress(String address) {
        driver.findElement(By.id("order_address")).sendKeys(address);
    }

    public void enterCreditCardDetails(String creditcard) {
        driver.findElement(By.xpath("//input[@id='card']")).sendKeys(creditcard);
    }
    
    
    public void clickPurchase() {
        driver.findElement(By.xpath("//button[normalize-space()='Purchase']")).click();
    }

    public String getOrderConfirmationMessage() {
        return driver.findElement(By.xpath("//h2[normalize-space()='Thank you for your purchase!']")).getText();
    }
}

