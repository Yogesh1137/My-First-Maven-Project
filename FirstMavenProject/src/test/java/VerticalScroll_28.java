import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerticalScroll_28 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.calculator.net/age-calculator.html");

		JavascriptExecutor js = (JavascriptExecutor) driver;

		try { // This Time wail will stop next code execution till the 3000 milli second
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// 1. Scroll Vertically Down By 500 pixel

		js.executeScript("window.scrollBy(0,500)");

		// 2. Vertically Scroll Till Visibility of Element

		// WebElement element = driver.findElement(By.linkText("about us"));

		// js.executeScript("arguments[0].scrollIntoView;", element);

		// 3. Horizontally Scroll Till Visibility of Element

		// WebElement element = driver.findElement(By.linkText("about us"));

		// js.executeScript("arguments[0].scrollIntoView;", element);

		// 4. To Scroll vertically Down and up

		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");

	}

}
