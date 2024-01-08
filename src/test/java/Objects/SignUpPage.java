package Objects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignUpPage {
    private final WebDriver driver;

    public SignUpPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterUsername(String username) {
        driver.findElement(By.id("sign-username")).sendKeys(username);
    }

    public void enterPassword(String password) {
        driver.findElement(By.id("sign-password")).sendKeys(password);
    }

    public void clickSignUpButton() {
        driver.findElement(By.xpath("//button[text()='Sign up']")).click();
    }

    //public String getAlertText() {
    	//WebDriverWait alertWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        //alertWait.until(ExpectedConditions.alertIsPresent());
        //Alert alert = driver.switchTo().alert();
    	//return alert.getText();
       
    //}
}

