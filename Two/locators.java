package PackNew;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium-webdriver\\chromedriver-win64\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  
		  driver.get("https://www.edureka.co/");
		  driver.findElement(By.xpath("//span[@class='signup_click signup-vd giTrackElementHeader ']")).click();
		  Thread.sleep(2000);
		  
		  driver.findElement(By.cssSelector("#sg_popup_email")).sendKeys("edureka.com");
		  Thread.sleep(2000);
		  driver.findElement(By.id("sg_popup_phone_no")).sendKeys("123456789");
		  Thread.sleep(2000);
		  
		  driver.navigate().to("https://login.yahoo.com/?");
		  Thread.sleep(2000);

		  driver.findElement(By.partialLinkText("Forgot")).click();
		  Thread.sleep(2000);

		  driver.findElement(By.name("verifyYid")).click();
		  Thread.sleep(2000);
		  

		  
		  driver.quit();
		  
		  
	}

}
