import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class iframe_24 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.rediff.com/");

		// How To Switch To iframe
		// 1. By id or By Name
		// 2. By WebElement
		// 3. By Index

		// Switch to 1st iframe By id

		driver.switchTo().frame("moneyiframe");

		// locate WebElement

		String nseindex = driver.findElement(By.id("nseindex")).getText();

		System.out.println(nseindex);

		// Switch to main page first

		driver.switchTo().defaultContent();

		// Switch to 2nd iframe By id

		driver.switchTo().frame(1);

		// locate element

		driver.findElement(By.className("ns-gs8e2-e-13")).click();

	}

}
