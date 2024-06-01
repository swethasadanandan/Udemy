package PackNew;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium-webdriver\\chromedriver-win64\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  
		  driver.get("https://www.amazon.in/");
		  driver.manage().window().maximize();
		  
		  driver.findElement(By.id("twotabsearchtextbox")).sendKeys("POCO f1");
		  driver.findElement(By.id("nav-search-submit-button")).click();
		  driver.findElement(By.linkText("₹5,000 - ₹10,000")).click();
		  
		  
		  //To Scroll the Screen
		  JavascriptExecutor js= (JavascriptExecutor) driver;
		  js.executeScript("window.scrollBy(0,300)");

		  
		  		  
		  driver.navigate().to("https://www.edureka.co/");
		  
		 Thread.sleep(4000);
		 
		 driver.navigate().back();
		 
		 driver.close();
		  
		  
	}

}
