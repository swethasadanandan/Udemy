package first;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class prac {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Selenium-webdriver\\chromedriver-win64\\chromedriver.exe");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		driver.get("https://www.saucedemo.com/");
//		
//		driver.findElement(By.id("user-name")).sendKeys("standard_user");
//		driver.findElement(By.id("password")).sendKeys("secret_sauce");
//		driver.findElement(By.xpath("//input[@value='Login']")).click();
//		Thread.sleep(3000);
//		
//		System.out.println(driver.findElement(By.xpath("//div[normalize-space()='Sauce Labs Backpack']")).getText());
//		driver.quit();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@onclick='alertbox()']")).click();

		driver.switchTo().alert().accept();
		

	}

	

}
