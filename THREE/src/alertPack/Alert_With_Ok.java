package alertPack;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_With_Ok {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium-webdriver\\chromedriver-win64\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  
		  driver.get("https://demo.automationtesting.in/Alerts.html");
		  
	       driver.findElement(By.cssSelector(".btn-danger")).click();
	       
	      Alert alert = driver.switchTo().alert();
	      
	      String a =driver.switchTo().alert().getText()	;
	      System.out.println(a);
	      
	      //To close the alert box by clicking OK button
	      alert.accept();
	      
	      driver.findElement(By.xpath("//a[normalize-space()='Alert with Textbox']")).click();
	      driver.findElement(By.xpath("//button[@onclick='promptbox()']")).click();
	      
		Alert alert1 = driver.switchTo().alert();
	      alert1.sendKeys("asddfff");
	      alert1.accept();

	      if(driver.getPageSource().contains("Hello asddfff user How are you today"));
	      {
	    	  System.out.println("Hello asddfff user How are you today");
	      }
	      		
	      driver.quit();
	      

	}

}
