package first;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Link_Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Selenium-webdriver\\chromedriver-win64\\chromedriver.exe");

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
	System.out.println(driver.findElements(By.tagName("a")).size());
	
	WebElement footer = driver.findElement(By.id("gf-BIG"));
	System.out.println(footer.findElements(By.tagName("a")).size());
	
	WebElement footorsize = footer.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
	System.out.println(footorsize.findElements(By.tagName("a")).size());
	
	
	
	
	for(int i=1;i<footorsize.findElements(By.tagName("a")).size();i++)
	{
		String click =Keys.chord(Keys.CONTROL, Keys.ENTER);
		
		footorsize.findElements(By.tagName("a")).get(i).sendKeys(click);
	}

	Set<String> abc = driver.getWindowHandles();
	Iterator<String> it=abc.iterator();
	while(it.hasNext())
	{
		driver.switchTo().window(it.next());
		System.out.println(driver.getTitle());
	}
	

	}
}
