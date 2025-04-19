import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath_locator_Second_03 {

	public static void main(String[] args) {

		// Absolute X-path(Not Used More) and Relative X-path(Mostly Used)

		// Relative X-path

		// <HTML Tag>[@attribute-name = attribute value] For Single Attribute

		// OR

		// *[@attribute-name = attribute value]

		// <HTML Tag>[@attribute-name1 = attribute value1][@attribute-name2 = attribute
		// value2] For Multiple Attribute

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		// Open the URL

		driver.get("https://www.saucedemo.com/");

		// Locate User Name

		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("visual_user");

		// Locate Password

		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("secret_sauce");

		// Locate Login Button

		driver.findElement(By.xpath("//input[@type='submit'][@class='submit-button btn_action']")).click();

		// Switch to Window

		String CurrentWindowHandel = driver.getWindowHandle();

		driver.switchTo().window(CurrentWindowHandel);

		// Locate Add to Cart By And & OR Expression

		driver.findElement(By.xpath(
				"//button[@data-test='add-to-cart-sauce-labs-bolt-t-shirt' and @name='add-to-cart-sauce-labs-bolt-t-shirt']"))
				.click();

		driver.findElement(By
				.xpath("//button[@data-test='add-to-cart-sauce-labs-onesie' or @name='add-to-cart-sauce-labs-onesie']"))
				.click();

		// Locate Cart icon using contains method which is useful in dynamic condition

		driver.findElement(By.xpath("//a[contains(@class,'shopping_cart')]")).click();

		// Locate Element using Position Method when Tag name and attribute are same for
		// all element e.g
		// (//input[@name='User-name'])[position()=1]

		// driver.findElement(By.xpath("//input[@name='User-name'])[position()=7]")).click();

	}

}
