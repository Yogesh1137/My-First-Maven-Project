import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable_15 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\TCED\\Desktop\\Project Directory(Java+Selenium)\\Driver\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");

		// Find Table Heading in Table 2

		String TableData1 = driver.findElement(By.xpath("// table/thead/tr/th[2]")).getText();

		System.out.println(TableData1);

		// Find Second cell in third row in Table 2

		String TableData2 = driver.findElement(By.xpath("(//table/tbody/tr[2]/td[1])[2]")).getText();

		System.out.println(TableData2);

		// To find Total Number of rows

		List<WebElement> TRows = driver.findElements(By.xpath("//table[@class='tsc_table_s13']//tr"));

		System.out.println(TRows.size());

		// To find Total Number of Cloumn

		List<WebElement> TColumn = driver.findElements(By.xpath("//table[@class='tsc_table_s13']//thead//th"));

		System.out.println(TColumn.size());

		// To Print all data of table

		// Locate the table using class name
		WebElement table = driver.findElement(By.xpath("//table[@class='tsc_table_s13']"));

		// Locate all rows in the table (excluding headers)
		List<WebElement> rows = table.findElements(By.tagName("tr"));

		// Loop through each row
		for (WebElement row : rows) {
			// Locate all columns (cells) in the current row (both <th> and <td>)
			List<WebElement> columns = row.findElements(By.xpath("./th|./td"));

			// Print each cell value
			for (WebElement column : columns) {
				System.out.print(column.getText() + "  |  ");
			}
			System.out.println(); // Move to the next line after each row
		}

	}

}
