import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable_16 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\TCED\\Desktop\\Project Directory(Java+Selenium)\\Driver\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://testautomationpractice.blogspot.com/");

		// To find Total Number of rows

		List<WebElement> TRows = driver.findElements(By.xpath("//table[@name='BookTable']//tr"));

		System.out.println(TRows.size());

		// To find Total Number of Cloumn

		List<WebElement> TColumn = driver.findElements(By.xpath("//table[@name='BookTable']//th"));

		System.out.println(TColumn.size());

		// To Find Total Data of Table

		for (int r = 2; r <= TRows.size(); r++) // Row

		{
			for (int c = 1; c <= TColumn.size(); c++) // Column

			{

				String TableData = driver
						.findElement(By.xpath("//table[@name='BookTable']/tbody/tr[" + r + "]/td[" + c + "]"))
						.getText();
				
				System.out.println(TableData);
			}


		}

	}

}
