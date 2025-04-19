import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Explicitwait_22 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.flipkart.com/");

		// Explicit wait for 10 sec

		WebDriverWait Wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		// Stopwatch Watch = null;

		try {

			// Watch = Stopwatch.createStarted(); // To Calculate Implicit wait time

			WebElement element = Wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("LoginElement"))); // incorrect
																															// Xpath

			element.click();

		}

		catch (Exception e) {

			// Watch.stop();
			// System.out.println(Watch.elapsed(TimeUnit.SECONDS));

			System.out.println(e);
		}

	}

}
