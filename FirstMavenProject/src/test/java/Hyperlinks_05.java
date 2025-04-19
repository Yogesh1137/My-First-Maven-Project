import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Hyperlinks_05 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.calculator.net/");

		// To Find List Hyperlinks_

		List<WebElement> Hyperlinks_Elements = driver.findElements(By.tagName("a"));

		System.out.println("Total no of links :" + Hyperlinks_Elements.size());

		for (WebElement el : Hyperlinks_Elements) {

			System.out.println(el.getText());
		}

		driver.close();

	}

}
