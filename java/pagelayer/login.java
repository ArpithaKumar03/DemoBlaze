package pagelayer;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoblaze.com");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Pagefactory_withpom homepag = new Pagefactory_withpom(driver);
		homepag.loginlink();
		System.out.println("-----login button clicked----");
		Thread.sleep(2000);
		homepag.verifyusername();
		System.out.println("-----Username entered----");
		Thread.sleep(1000);
		homepag.verifypassword();
		System.out.println("-----password entered----");
		homepag.loginbutton();

	}

}
