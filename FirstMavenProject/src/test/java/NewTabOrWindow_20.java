import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTabOrWindow_20 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.google.co.in/");

		System.out.println("First Page:  " + driver.getTitle());

		// Open New Tab/Widow

		driver.switchTo().newWindow(WindowType.WINDOW);

		driver.get("https://www.facebook.com/");

		System.out.println("Second Tab:  " + driver.getTitle());

		// Get Window Handles of open window

		Set<String> WindowHandles = driver.getWindowHandles();

		List<String> Handles = new ArrayList<String>();

		Handles.addAll(WindowHandles);

		driver.close();

		// Switch Back to Google.com

		driver.switchTo().window(Handles.get(0));

		System.out.println("First Page:  " + driver.getTitle());

	}

}
