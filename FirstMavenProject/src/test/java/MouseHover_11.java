import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHover_11 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		// Open the URL

		driver.get("https://www.ebay.com/sellercenter/growth/going-global");

		WebElement element = driver
				.findElement(By.xpath("//a[@href='/sellercenter/shipping']//span[@data-text='Shipping']"));

		Actions Act = new Actions(driver);

		Act.moveToElement(element).perform();// Perform Mouse Hover Action

	}

}
