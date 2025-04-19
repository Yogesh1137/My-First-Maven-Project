import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PopUpAlerts_14 {

	public static void main(String[] args) {

		// Types of alerts: 1) Simple Alert:Display information or Warning Like Ok
		// 2) Confirmation Alert: Ask permission to do some type of operation Like Ok
		// and Cancel 3) Prompt Alert: Prompt Alert asks some input from the user

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demoqa.com/alerts");

		// Simple Alert

		// driver.findElement(By.xpath("//button[@id='alertButton']")).click();

		// Then Switch to Alert Window and accept the alert

		// driver.switchTo().alert().accept(); // Ok Button is clicked

		// Confirm Alert

		// driver.findElement(By.xpath("//button[@id='confirmButton']")).click();

		// driver.switchTo().alert().accept(); // Ok Button is clicked

		// driver.switchTo().alert().dismiss(); // Cancel Button is clicked

		// Prompt Alert

		driver.findElement(By.xpath("//button[@id='promtButton']")).click();

		driver.switchTo().alert().sendKeys("Yogesh");

		// driver.switchTo().alert().accept(); // Ok Button is clicked

		driver.switchTo().alert().dismiss(); // Cancel Button is clicked

	}

}
