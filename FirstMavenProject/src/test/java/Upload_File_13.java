import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Upload_File_13 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.west-wind.com/wconnect/wcscripts/fileupload.wwd");

		// We will only use Send Keys Method When type="file" is in HTML Code

		driver.findElement(By.xpath("//input[@id='ajaxUpload']")).sendKeys("C:\\Users\\TCED\\Downloads\\My Sign.jpg");

	}

}
