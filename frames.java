package first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Selenium-webdriver\\chromedriver-win64\\chromedriver.exe");

		driver.get("https://demo.seleniumeasy.com/drag-and-drop-demo.html");
		
		
//	If it is inside the frame use-
		//driver.switchTo().frame(locator of frame)
		//switch from the frame window use-
		//driver.switchTo().defaultContent();
		
		
		
		Actions a = new Actions(driver);
		WebElement s = driver.findElement(By.xpath("//span[normalize-space()='Draggable 1']"));
		WebElement t = driver.findElement(By.id("mydropzone"));
		a.dragAndDrop(s, t).build().perform();

	
	}

}
