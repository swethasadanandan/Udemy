import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Amazon_Without_Captcha {

    public static void main(String[] args) throws InterruptedException {
        // Set ChromeDriver path
        WebDriver driver = new ChromeDriver();

        System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium-webdriver\\chromedriver-win64\\chromedriver.exe");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.amazon.com");
        driver.findElement(By.id("captchacharacters")).click();
        Thread.sleep(20000);
        driver.findElement(By.className("a-button-text")).click();
        
        
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.click();
        String searchTerm = "amazon basics";
        searchBox.sendKeys(searchTerm);
        searchBox.sendKeys(Keys.ENTER);

        
        WebElement searchResultElement = driver.findElement(By.xpath("//span[@class='a-color-state a-text-bold']"));
        String searchResultText = searchResultElement.getText().trim(); 

        searchResultText = searchResultText.replace("\"", ""); // Remove double quotes

        
       
        JavascriptExecutor js =(JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,700)");
      
        Thread.sleep(3000);
        Assert.assertEquals(searchResultText, searchTerm);
        driver.findElement(By.xpath("//span[contains(text(),'Amazon Brands')]")).click();

        
        Assert.assertEquals(driver.findElement(By.xpath("//span[normalize-space()='Freezer Gallon Bags, 90 Count (Previously Solimo)']")).getText(),"Freezer Gallon Bags, 90 Count (Previously Solimo)");

        driver.findElement(By.xpath("//span[normalize-space()='Freezer Gallon Bags, 90 Count (Previously Solimo)']")).click();
        WebElement product = driver.findElement(By.xpath("//p[normalize-space()='Gallon (90 Count)']"));
        product.click();
        
       String productName = "Gallon (90 Count)";
       
        Assert.assertEquals(driver.findElement(By.xpath("//span[@class='selection']")).getText(),productName);

        driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
        
       
       Assert.assertEquals(driver.findElement(By.xpath("//span[normalize-space()='Gallon (90 Count)']")).getText(), productName);
       
       driver.findElement(By.xpath("(//span[@class='nav-line-2'])[3]")).click();
       Assert.assertEquals(driver.findElement(By.id("sc-subtotal-label-buybox")).getText().split(":")[0], "Subtotal (1 item)");
       driver.quit();
    }
}
