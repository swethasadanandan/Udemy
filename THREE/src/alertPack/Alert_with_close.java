package alertPack;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_with_close {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium-webdriver\\chromedriver-win64\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  
		  driver.get("https://demo.automationtesting.in/Alerts.html");
		  driver.findElement(By.xpath("//a[normalize-space()='Alert with OK & Cancel']")).click();
		  driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		  
		Robot robot = new Robot();
		  
		  //1045 and 13 is the position closing icon
		  robot.mouseMove(1045, 13);
		  //To click the Mouse
		  robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		  Thread.sleep(2000);
		  robot.mouseRelease(InputEvent.BUTTON2_DOWN_MASK);
 
		 
//		  Alert alert =driver.switchTo().alert();
//		  alert.dismiss();
//		  
		  
		  
		  
		  
	}

}
