import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestCase_00 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Set up WebDriver for Chrome
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\TCED\\Desktop\\Project Directory(Java+Selenium)\\Driver\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		// Navigate to Google
		driver.get("https://www.google.com/");

		// Print page details with clear console output
		System.out.println("******************Capture Title*******************");

		System.out.println("Title: " + driver.getTitle());

		System.out.println("******************Capture URL*******************");

		System.out.println("URL: " + driver.getCurrentUrl());

		System.out.println("******************Capture PageSource*******************");

		// System.out.println(driver.getPageSource());

		System.out.println("******************PageSource Needs Seperate Execution*******************");

		// Close the browser
		driver.quit();

	}

}
