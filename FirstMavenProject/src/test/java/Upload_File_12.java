import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Upload_File_12 {

	public static void main(String[] args) throws AWTException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		// Open the URL

		driver.get("https://demoqa.com/upload-download");

		// We will only use Send Keys Method When type="file" is in HTML Code

		// driver.findElement(By.xpath("//input[@id='uploadFile']")).sendKeys("C:\\Users\\TCED\\Downloads\\Yogesh
		// Patil QA Analyst(2yrs).pdf");

		// OR

		// driver.findElement(By.xpath("//input[@id='uploadFile']")).click(); // Click
		// Action is Not Working So We are Creating Action Class

		WebElement Button = driver.findElement(By.xpath("//input[@id='uploadFile']"));

		Actions Act = new Actions(driver);

		Act.moveToElement(Button).click().perform();

		Robot rbt = new Robot();

		rbt.delay(2000);

		// Copy File to Clip Board

		StringSelection ss = new StringSelection("C:\\Users\\TCED\\Downloads\\Yogesh QA(2.5yrs).pdf");

		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

		// Press Control + V key to past file

		rbt.keyPress(KeyEvent.VK_CONTROL);

		rbt.keyPress(KeyEvent.VK_V);

		// To Release Control + V key

		rbt.keyRelease(KeyEvent.VK_CONTROL);

		rbt.keyRelease(KeyEvent.VK_V);

		// To Press Enter Button

		rbt.keyPress(KeyEvent.VK_ENTER);

		// To Release Enter

		rbt.keyRelease(KeyEvent.VK_ENTER);

	}

}
