package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {
    private final WebDriver driver;

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getProductName() {
        return driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/h2")).getText();
    }

    public String getProductPrice() {
        return driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/h3")).getText();
    }

    public void addToCart() {
        driver.findElement(By.xpath("//a[@class='btn btn-success btn-lg']")).click();
    }
}


