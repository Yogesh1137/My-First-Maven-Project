import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButton_07 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://udyamregistration.gov.in/Udyam_Login.aspx");

		// Locate Radio Button

		List<WebElement> RadioButton = driver.findElements(By.xpath("//input[@type='radio']"));

		System.out.println("Number of Radio Button :" + RadioButton.size());

		driver.close();

	}

}
