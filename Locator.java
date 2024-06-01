package first;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Locator {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium\\Selenium-webdriver\\chromedriver-win64\\chromedriver.exe");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice");
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

		driver.findElement(By.id("inputUsername")).sendKeys("swetha");
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("#chkboxOne")).click();

		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.xpath("//p[normalize-space()='You are successfully logged in.']")).getText());
		
		driver.findElement(By.xpath("//button")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[normalize-space()='Forgot your password?']")).click();
		
		//Child parent locator
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("2000000");
		
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".go-to-login-btn")).click();
		Thread.sleep(3000);
		driver.quit();
	}

}



