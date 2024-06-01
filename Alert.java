package first;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium\\Selenium-webdriver\\chromedriver-win64\\chromedriver.exe");


		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("name")).sendKeys("Swetha");
		driver.findElement(By.cssSelector("[id='alertbtn']")).click();
		Thread.sleep(3000);
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		
		Thread.sleep(4000);
//		driver.findElement(By.id("confirmbtn")).click();
//		Thread.sleep(3000);

		driver.switchTo().alert().dismiss();
		Thread.sleep(3000);

		driver.quit();
	}

}
