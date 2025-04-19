import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TrialAndError {

	public static void main(String[] args) {

		//System.setProperty("webdriver.chrome.driver",
		//"C:\\Users\\TCED\\Desktop\\Project Directory(Java+Selenium)\\Driver\\chromedriver-win64\\chromedriver.exe");
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://beta-pkhg.parsonskellogg.shop/accessories.html?sort=relevance");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		try {
			// Click Nike checkbox
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='checkbox' and @value='Nike']")))
					.click();
			Thread.sleep(3000); // Wait for products to load

			// Scroll & click Nike Hat link
			WebElement nikeHat = wait.until(ExpectedConditions.presenceOfElementLocated(
					By.xpath("//a[@title='Nike Sport Red Dri-FIT Mesh Swoosh Flex Sandwich Hat']")));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", nikeHat);
			nikeHat.click();

		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());

		}
	}

}
