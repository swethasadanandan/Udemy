package PackNew;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Five_Alerts {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium-webdriver\\chromedriver-win64\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  
		  driver.get("https://demo.automationtesting.in/Alerts.html");
		  
	       driver.findElement(By.cssSelector(".btn-danger")).click();
	       
	      Alert alert = driver.switchTo().alert();
	      
	      String a =driver.switchTo().alert().getText()	;
	      System.out.println(a);
	      
	      //To close the alert box by clicking OK button
	      alert.accept();
	      }
}

