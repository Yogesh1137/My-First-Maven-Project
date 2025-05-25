import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IncognitoLogin {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		// Set ChromeOptions to open in incognito
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");

		// Launch browser with options
		WebDriver driver = new ChromeDriver(options);

		// Maximize the window
		driver.manage().window().maximize();

		// Navigate to login page (example page here)
		driver.get("https://www.linkedin.com/login");

		// Locate email and password fields and login button

		driver.findElement(By.id("username")).sendKeys("patilyogesh86983@gmail.com");

		driver.findElement(By.id("password")).sendKeys("@Y87983898y");

		// Click login

		driver.findElement(By.xpath("//button[@type='submit']")).click();

		System.out.println("Login attempted in Incognito Mode.");

	}

}
