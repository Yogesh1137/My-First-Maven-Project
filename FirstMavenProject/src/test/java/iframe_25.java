import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class iframe_25 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.rediff.com/");

		// How To Switch To iframe
		// 1. By id or By Name
		// 2. By WebElement
		// 3. By Index

		// Switch to 1st iframe(by index)

		driver.switchTo().frame(0);

		// locate WebElement

		String nseindex = driver.findElement(By.id("nseindex")).getText();

		System.out.println(nseindex);

	}

}
