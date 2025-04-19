import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitWait_21 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.flipkart.com/");

		// wait For 10 sec to load element (It will apply on all web element)

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // Only This line is very important in whole
																			// code

		// Stopwatch Watch = null;

		try {

			// Watch = Stopwatch.createStarted(); // To Calculate Implicit wait time

			driver.findElement(By.linkText("LoginElement")).click(); // incorrect Xpath

		}

		catch (Exception e) {

//			Watch.stop();
//			System.out.println(Watch.elapsed(TimeUnit.SECONDS));

			System.out.println(e);
		}

	}

}
