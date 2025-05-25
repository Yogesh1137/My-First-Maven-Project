import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FillingForm_30 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.manage().window().maximize();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

//		driver.findElement(By.xpath("//input[@name= 'username']")).sendKeys("Admin");
//
//		driver.findElement(By.xpath("//input[@name= 'password']")).sendKeys("admin123");
//
//		driver.findElement(
//				By.xpath("//button[@class= 'oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']"))
//				.click();

		// Above same by Action in Single statement

		Actions actions = new Actions(driver);

		Action seriesOFAction = actions.moveToElement(driver.findElement(By.xpath("//input[@name= 'username']")))
				.click().sendKeys("Admin", Keys.TAB).sendKeys("admin123", Keys.ENTER).build();
		seriesOFAction.perform();

	}

}
