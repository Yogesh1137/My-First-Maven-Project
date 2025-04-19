import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NestedIframe_27 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://chercher.tech/practice/trames-example-selenium-webariver");

		driver.switchTo().frame("frame1");// parent frame/outer frame

		driver.switchTo().frame("frame3");// child frame/inner frame

		// find webelemnt checkbox

		driver.findElement(By.id("a")).click();

		// switch to parent frame

		driver.switchTo().parentFrame();

		// find webelement input box

		driver.findElement(By.tagName("input")).sendKeys("this is text msg");

		// switch to default content/main page

		driver.switchTo().defaultContent();

		driver.switchTo().frame("frame2");

		// find webelement animal dropdown

		WebElement DropDownElement = driver.findElement(By.id("animals"));

		Select DropDown = new Select(DropDownElement);

		DropDown.selectByVisibleText("Avatar");

	}

}
