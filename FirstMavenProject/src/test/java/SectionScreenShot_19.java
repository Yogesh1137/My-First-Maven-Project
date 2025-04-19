import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SectionScreenShot_19 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\TCED\\Desktop\\Project Directory(Java+Selenium)\\Driver\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://mvnrepository.com/artifact/commons-io/commons-io/2.18.0");

		// Step1: Locate the section element

		WebElement Section = driver.findElement(By.xpath("//div[@id='maven-div']"));

		// Step2: Call getScreenshotAs method to create image file

		File imgfile = Section.getScreenshotAs(OutputType.FILE);

		// Step3: To Save file at destination(\\FullScreen.png: This is manually added
		// by me)

		File Destination = new File("E:\\ScreenShot\\Section.png");

		// Need Apache commons-io Dependency in pom.xml

		// Step3: Copy image file to destination

		try {

			FileUtils.copyFile(imgfile, Destination);

			System.out.println("screenshot taken succesefully");

		} catch (IOException e) {

			e.printStackTrace();

			System.out.println("screenshot Not Taken");
		}

	}
}
