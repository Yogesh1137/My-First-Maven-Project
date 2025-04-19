import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tool_Tip_17 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\TCED\\Desktop\\Project Directory(Java+Selenium)\\Driver\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://en-gb.facebook.com/login/web/");

		// Tool Tip

		String ActualToolTip = driver.findElement(By.xpath("//a[@title='Sign up for Facebook']")).getAttribute("title");

		String ExpectedToolTip = "Sign up for Facebook";

		// To Print Tool Tip

		System.out.println("Actual Tool Tip String is: " + ActualToolTip);

		System.out.println("Expected Tool Tip String is: " + ExpectedToolTip);

		// Verify Tool Tip

		if (ActualToolTip.equals(ExpectedToolTip)) {

			System.out.println("Test Pass");
		}

		else {

			System.out.println("Test Fail");

		}

	}

}
