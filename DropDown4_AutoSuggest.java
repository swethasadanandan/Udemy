package first;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDown4_AutoSuggest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium\\Selenium-webdriver\\chromedriver-win64\\chromedriver.exe");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		driver.findElement(By.xpath("(//a[normalize-space()='India'])[1]")).click();
		
		//Checkbox Selection
		driver.findElement(By.name("ctl00$mainContent$chk_SeniorCitizenDiscount")).click();
		System.out.println(driver.findElement(By.name("ctl00$mainContent$chk_SeniorCitizenDiscount")).isSelected());
		
		
		 // Get the count of checkboxes
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());

		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(3000);
		driver.quit();
		
		
		//Assignment
//		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
//		driver.findElement(By.id("checkBoxOption1")).click();
//		System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());
//		driver.findElement(By.id("checkBoxOption1")).click();
//		System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());
//		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		
		
	}

}
