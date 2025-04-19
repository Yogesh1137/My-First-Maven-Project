import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseOperation_09 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new EdgeDriver(); // for Edge Browser

		driver.manage().window().maximize();

		// Open the URL

		driver.get("https://demoqa.com/buttons");

		System.out.println(
				"*****************************************Right click Action*******************************************");

		// WebElement button =
		// driver.findElement(By.xpath("//button[@id='rightClickBtn']"));

		// Actions act = new Actions(driver);

		// act.contextClick(button).perform(); // Right click and perform

		System.out.println(
				"*****************************************Double click Action*******************************************");

		WebElement button = driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));

		Actions Act = new Actions(driver);

		Act.doubleClick(button).perform();

	}

}
