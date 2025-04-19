import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath_locator_First_02 {

	public static void main(String[] args) {

		// System.setProperty("webdriver.chrome.driver",
		// "C:\\Users\\TCED\\Desktop\\Project
		// Directory(Java+Selenium)\\Driver\\chromedriver-win64\\chromedriver.exe");

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");

		// Locate User Name , FindElement Method Throws NoSuch Element Exception and
		// FindElements Method Returns Empty List

		driver.findElement(By.id("user-name")).sendKeys("standard_user");

		// Locate Password Name

		driver.findElement(By.name("password")).sendKeys("secret_sauce");

		// Locate Login Button

		driver.findElement(By.className("btn_action")).click();

		// Switch to Product Page

		String Current_Window_Handle = driver.getWindowHandle();

		driver.switchTo().window(Current_Window_Handle);

		// Locate Sauce Labs Bolt T-Shirt By Link Text

		// driver.findElement(By.linkText("Sauce Labs Bolt T-Shirt")).click();

		// driver.findElements is used to locate list of web element

		List<WebElement> Element_List = driver.findElements(By.partialLinkText("Sauce"));

		System.out.println("Element Size: " + Element_List.size());

	}

}
