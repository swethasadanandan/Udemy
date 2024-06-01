package first;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class z2_ScreenShot {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Selenium-webdriver\\chromedriver-win64\\chromedriver.exe");
		driver.get("https://badssl.com/");
		
		File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//FileUtlis.copyFile(src, new File("C://img.png"));
		Files.copy(src, new File("C:\\Users\\Swetha\\Videos\\wedding\\scre.png"));
        driver.quit();
        
	}

}
