import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FullScreenShot_18 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://mvnrepository.com/artifact/commons-io/commons-io/2.18.0");

		// Step1: Convert WebDriver Object to TakesScreenshot interface

		TakesScreenshot ScreenShot = ((TakesScreenshot) driver);

		// Step1: Call getScreenshotAs method to create image file

		File imgfile = ScreenShot.getScreenshotAs(OutputType.FILE);

		// To Save file at destination(\\FullScreen.png: This is manually added by me)

		File Destination = new File("E:\\ScreenShot\\FullScreen.png");

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
