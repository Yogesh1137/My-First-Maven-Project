import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor_24 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\TCED\\Desktop\\Project Directory(Java+Selenium)\\Driver\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://testautomationpractice.blogspot.com/");

		JavascriptExecutor js = (JavascriptExecutor) driver; // Type cast

		// Enter Text in Search Box

		js.executeScript("document.getElementById('Wikipedia1_wikipedia-search-input').value = 'India';");

		// Click on Search Button

		WebElement element = driver.findElement(By.xpath("//input[@placeholder='Enter Name']"));

		js.executeScript("arguments[0].click();", element);

		// Refresh Browser

		// js.executeScript("history.go(0)");

		// To Get Domain Name

		String DomainName = js.executeScript("return document.domain;").toString();

		System.out.println("Domain Name Is: " + DomainName);

		// To Get Title of web page

		String Title = js.executeScript("return document.title;").toString();

		System.out.println("Title Name Is: " + Title);

		// To Get URL

		String URL = js.executeScript("return document.URL;").toString();

		System.out.println("URL Is: " + URL);

		// To Draw Border Element

		js.executeScript("arguments[0].style.border = '3px solid red';", element);

		// zoom web page 150%

		js.executeScript("document.body.style.zoom='100%'");

		// to get Height and width of web page

		System.out.println(js.executeScript("return window.innerHeight;").toString());

		System.out.println(js.executeScript("return window.innerWidth;").toString());

		// To Scroll vertically Down and up

		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");

		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");

		// To generate Alert Massage

		// js.executeScript("alert('This is my alert');");

		// Navigate to different page

		js.executeScript("window.location = 'https://www.facebook.com/'");

	}

}
