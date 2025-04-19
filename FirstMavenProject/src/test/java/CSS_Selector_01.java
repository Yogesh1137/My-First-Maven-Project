import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CSS_Selector_01 {

	public static void main(String[] args) {

		// CSS Cascading Style Sheet Tag and id, Tag and Class, Tag attribute, Tag Class
		// and attribute, Sub-string
		// Syntax (tag#id), (tag.value of class), (tag[attribute=value]), (tag.value of
		// class[attribute=value]), (start with= ^, ends with= $, contains= *),
		// tag[attribute^=substring]

		// System.setProperty("webdriver.chrome.driver",
		// "C:\\Users\\TCED\\Desktop\\Project
		// Directory(Java+Selenium)\\Driver\\chromedriver-win64\\chromedriver.exe");

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.saucedemo.com/");

		// Locate User Name by tag#id

		driver.findElement(By.cssSelector("input#user-name")).sendKeys("standard_user");

		// Locate Password by tag[attribute=value]

		driver.findElement(By.cssSelector("input[name=password]")).sendKeys("secret_sauce");

		// Locate Login Button by tag.value of class name

		driver.findElement(By.cssSelector("input.btn_action")).click();

		// Switch to product page

		String CurrentWindowHandel = driver.getWindowHandle();

		driver.switchTo().window(CurrentWindowHandel);

		// Locate Add to cart by (tag.value of class[attribute=value])

		driver.findElement(By.cssSelector("button#add-to-cart-sauce-labs-fleece-jacket")).click();

		// Locate Add to cart by Sub-string

		driver.findElement(By.cssSelector("button[data-test*= labs-bike-light]")).click();

	}

}
