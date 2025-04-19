import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDropMouseAction_10 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		// Open the URL

		driver.get("http://www.dhtmlgoodies.com/packages/dhtml-suite-for-applications/demos/demo-drag-drop-3.html");

		// Find Source and Target Web element

		WebElement Source = driver.findElement(By.xpath("//div[@id='box6']"));// Rome

		WebElement Target = driver.findElement(By.xpath("//div[@id='box106']"));// Italy

		// Object Of Action Class

		Actions Act = new Actions(driver);

		// To call drag and drop method

		Act.dragAndDrop(Source, Target).perform();

	}

}
