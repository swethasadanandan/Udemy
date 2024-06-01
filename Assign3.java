import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Selenium-webdriver\\chromedriver-win64\\chromedriver.exe");

		driver.get("https://the-internet.herokuapp.com/windows");
		driver.findElement(By.linkText("Click Here")).click();
		
		Set<String> w =driver.getWindowHandles();
		Iterator<String>it =w.iterator();
		String parent=it.next();
		String childId =it.next();
		driver.switchTo().window(childId);
		
		System.out.println(driver.findElement(By.xpath("//h3[normalize-space()='New Window']")).getText());
		
		driver.switchTo().window(parent);
		
		System.out.println(driver.findElement(By.xpath("//h3[normalize-space()='Opening a new window']")).getText());
	}

}
