package first;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;






public class Locator2 {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		String name ="Swe";
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium\\Selenium-webdriver\\chromedriver-win64\\chromedriver.exe");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice");
		Thread.sleep(3000);

		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("#chkboxOne")).click();
		
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.xpath("//p[normalize-space()='You are successfully logged in.']")).getText());

		//To Verify the Text 
		Assert.assertEquals(driver.findElement(By.xpath("//p[normalize-space()='You are successfully logged in.']")).getText(),  "You are successfully logged in.");
		
		Assert.assertEquals(driver.findElement(By.tagName("h2")).getText(), "Hello " +name+",");
		
		driver.navigate().to("https://www.google.com/");
		
		driver.navigate().back();
		driver.quit();
	}
		
}