import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class As {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium\\Selenium-webdriver\\chromedriver-win64\\chromedriver.exe");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		driver.findElement(By.name("name")).sendKeys("Swetha");
		
		driver.findElement(By.name("email")).sendKeys("tepeuna803@fatamail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("12345");
		
		driver.findElement(By.id("exampleCheck1")).click();
		driver.findElement(By.id("exampleFormControlSelect1")).click();
		driver.findElement(By.xpath("//option[normalize-space()='Female']")).click();
		driver.findElement(By.id("inlineRadio1")).click();
		driver.findElement(By.xpath("//input[@name='bday']")).sendKeys("12041998");
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
		
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		  js.executeScript("window.scrollBy(0,-300)");
		  
		System.out.println(driver.findElement(By.cssSelector(".alert.alert-success.alert-dismissible")).getText());
		//Assert.assertEquals(driver.findElement(By.xpath("//strong[normalize-space()='Success!']")).getText(), "Success!");

		
	}

}
