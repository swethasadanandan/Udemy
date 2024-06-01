package first;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling_MultipleWindows {
	
	public static void main(String[] args) {
	
	
	WebDriver driver = new ChromeDriver();
	System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Selenium-webdriver\\chromedriver-win64\\chromedriver.exe");

	driver.get("https://rahulshettyacademy.com/loginpagePractise/");
	driver.findElement(By.cssSelector(".blinkingText")).click();
	
	//Parent to chils window switching
	Set<String> z= driver.getWindowHandles();
	//to iterate to next window
	Iterator<String>it = z.iterator();
	String parentId =it.next();
	String childId =it.next();
	driver.switchTo().window(childId);
	
	System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
	String email = driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];

	driver.switchTo().window(parentId);

	driver.findElement(By.id("username")).sendKeys(email);

	
	
	}
}
