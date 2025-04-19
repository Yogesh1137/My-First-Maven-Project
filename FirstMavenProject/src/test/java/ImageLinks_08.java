import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImageLinks_08 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.opencart.com/index.php?route=cms/demo");

		// driver.findElement(By.xpath("//a[@class='navbar-brand']")).click();//

		// OR

		driver.findElement(By.xpath("//img[@title = 'OpenCart - Demo']")).click();

		System.out.println("Home URL IS :" + driver.getCurrentUrl());

		if (driver.getTitle().equals("OpenCart - Open Source Shopping Cart Solution")) {

			System.out.println("Successfully Redirect on Home Page");
		}

		else {

			System.out.println("Not Redirect on Home Page");

		}

		driver.close();
	}

}
