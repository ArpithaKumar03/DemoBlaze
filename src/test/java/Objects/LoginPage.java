package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private final WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterUsername(String username) {
        driver.findElement(By.id("loginusername")).sendKeys(username);
    }

    public void enterPassword(String password) {
        driver.findElement(By.id("loginpassword")).sendKeys(password);
    }

    public void clickLogin() {
        driver.findElement(By.xpath("//button[text()='Log in']")).click();
    }

    public String getLoggedInUserName() {
        return driver.findElement(By.id("nameofuser")).getText();
    }
}
