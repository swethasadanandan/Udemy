package alertPack;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;



public class Screen {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium-webdriver\\chromedriver-win64\\chromedriver.exe");

        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();
        //driver.manage().window().maximize();
        
        driver.get("https://www.edureka.co/");

        // Click on the "Courses" link
       // WebElement coursesLink = driver.findElement(By.linkText("Courses"));
       // coursesLink.click();
       
        
        File f =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        Files.copy(f, new File("C:\\Users\\Swetha\\Videos\\wedding\\scre.png"));
        driver.quit();
        
	}

}
