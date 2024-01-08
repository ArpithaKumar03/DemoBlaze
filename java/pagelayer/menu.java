package pagelayer;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class menu {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoblaze.com");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		MenuPagefactory_withpom menuchek = new MenuPagefactory_withpom(driver);
		menuchek.homebutton();
		Thread.sleep(3000);
		System.out.println("-----home button clicked----");
		menuchek.contact();
		Thread.sleep(2000);

		menuchek.contactclose();
		Thread.sleep(2000);
		menuchek.aboutus();
		Thread.sleep(2000);
		System.out.println("-----about us button clicked----");
		menuchek.aboutusclose();
		Thread.sleep(2000);
		menuchek.signup();
		System.out.println("-----signup button clicked----");
		Thread.sleep(2000);
		menuchek.signupclose();


	}

}
