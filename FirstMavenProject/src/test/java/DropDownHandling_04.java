
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHandling_04 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.worldwideregistrationservice.com/contact-us");

		WebElement element = driver.findElement(By.id("select-yui_3_17_2_1_1415809204094_127585-field"));

		Select dropdown = new Select(element);

		// dropdown.selectByVisibleText("Retailer");

		// dropdown.selectByValue("Combination");

		dropdown.selectByIndex(2);

		if (dropdown.isMultiple()) {

			System.out.println("Drop Down is of Multiple Selectable");
		}

		else {

			System.out.println("Drop Down is not of Multiple Selectable");

		}

		// To Print All Options(All Drop Down Options are Web Elements)

		List<WebElement> AllDropDownOptions = dropdown.getOptions();

		System.out.println("Total No Of Options :" + AllDropDownOptions.size()); // To Print Size

		for (WebElement el : AllDropDownOptions)

		{
			System.out.println(el.getText());
		}

	}

}
