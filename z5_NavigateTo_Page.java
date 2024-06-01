package first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class z5_NavigateTo_Page {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium\\Selenium-webdriver\\chromedriver-win64\\chromedriver.exe");

		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.navigate().to("https://www.rahulshettyacademy.com/#/practice-project");
		String course = driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p']"))
		.get(1).getText();
		driver.navigate().back();
		driver.findElement(By.cssSelector("[name='name']")).sendKeys(course);

	}

}
