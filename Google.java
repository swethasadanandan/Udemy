import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Selenium-webdriver\\chromedriver-win64\\chromedriver.exe");

		driver.get("https://www.google.com/");
		//Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.className("gLFyf")).sendKeys("Test Automation Learning");
        driver.findElement(By.className("gLFyf")).sendKeys(Keys.ENTER);
        
        driver.findElement(By.xpath("//a[@href='https://www.udemy.com/topic/automation-testing/']")).click();
        Thread.sleep(4000);
        System.out.println(driver.findElement(By.className("ud-heading-serif-xxl")).getText());
        Thread.sleep(4000);

        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("BDD with Cucumber");
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//label[@for='u199-radio--206']")).click();

        driver.quit();

	}

}
