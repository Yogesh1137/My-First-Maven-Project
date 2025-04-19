import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class iframe_26 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.rediff.com/");

		// How To Switch To iframe
		// 1. By id or By Name
		// 2. By WebElement
		// 3. By Index

		// Switch to 1st iframe (by WebElement)

		WebElement iframe = driver.findElement(By.id("moneyiframe"));

		driver.switchTo().frame(iframe);

		String NseChange = driver.findElement(By.id("NseChange")).getText();

		System.out.println(NseChange);

		driver.switchTo().defaultContent();

		// To find and print total iframe of web page

		int NoofiFrame = driver.findElements(By.tagName("iframe")).size();

		System.out.println(NoofiFrame);

	}

}
