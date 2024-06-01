import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

import java.io.File;
import java.io.IOException;

public class Amazon {

    public static void main(String[] args) throws IOException, InterruptedException, TesseractException {
        // Set ChromeDriver path
    	//WebDriverManager.chromeDriver().setup();
    	
        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium-webdriver\\chromedriver-win64\\chromedriver.exe");

        // Initialize WebDriver

 
       
            try {
            	driver.get("https://www.amazon.com");

                WebElement a =driver.findElement(By.xpath("(//*[@class='a-row a-text-center']//following::img)[1]"));
                File src =a.getScreenshotAs(OutputType.FILE);
                String path ="D:\\Automation - Project\\eclipse-workspace\\first\\imagescap\\captc.png";
                FileHandler.copy(src, new File(path));
               // Thread.sleep(3000);

                
                ITesseract image = new Tesseract();
                image.setDatapath("D:\\Automation - Project\\eclipse-workspace\\first\\tessdata"); // Set path to tessdata directory
               
                
                String str = image.doOCR(new File(path));
               System.out.print(str);
               
               driver.findElement(By.id("captchacharacters")).sendKeys(str);

               //Thread.sleep(3000);
               
              // driver.findElement(By.id("captchacharacters")).sendKeys(Keys.ENTER);

            }
            catch (Exception e)
            {
                System.out.print("egfhgh " +e.getMessage());
	
            }
           // driver.quit();
    }
}
