package Objects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    private final WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToHomePage(String url) {
        driver.get(url);
    }
    
    public String checkProduct() {
        return driver.findElement(By.xpath("/html[1]/body[1]/div[5]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/h4[1]/a[1]")).getText();
    }
    

    public void clickProduct(String productName) {
        driver.findElement(By.xpath("/html[1]/body[1]/div[5]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/h4[1]/a[1]")).click();
    }
}
