package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Product {
    private final WebDriver driver;

    public Product(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement verifyproduct() {
        return driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/h2"));
    }

    public String getProductPrice() {
        return driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/h3")).getText();
    }

    public void addToCart() {
        driver.findElement(By.xpath("//a[@class='btn btn-success btn-lg']")).click();
    }
}


