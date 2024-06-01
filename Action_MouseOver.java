package first;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Action_MouseOver {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Selenium-webdriver\\chromedriver-win64\\chromedriver.exe");

		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Actions a = new Actions(driver);
		
		Thread.sleep(20000);
		//mouseOver
		a.moveToElement(driver.findElement(By.id("nav-link-accountList-nav-line-1"))).build().perform();
		
		WebDriverWait w= new WebDriverWait(driver, Duration.ofSeconds(20));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='nav-xshop']")));
		
		//rightClick
		a.moveToElement(driver.findElement(By.xpath("//div[@id='nav-xshop']"))).contextClick().build().perform();
		
		//CapitalLetter -> Using shift key
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("sads").doubleClick().build().perform();
		
		
	}

}
