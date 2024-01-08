package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
    private final WebDriver driver;

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getProductInCart() {
        return driver.findElement(By.xpath("//td[normalize-space()='Samsung galaxy s6']")).getText();
    }
}

