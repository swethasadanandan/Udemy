package first;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class calenderUi {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		String date ="15";
		String month ="6";
		String year ="2025";
		String[] expectedList = {month,date,year};

		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Selenium-webdriver\\chromedriver-win64\\chromedriver.exe");

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		Thread.sleep(4000);
		driver.findElement(By.cssSelector(".react-date-picker")).click();
		driver.findElement(By.className("react-calendar__navigation__label__labelText")).click();
		driver.findElement(By.className("react-calendar__navigation__label__labelText")).click();

		driver.findElement(By.xpath("//button[text()='"+year+"']")).click();
		driver.findElements(By.className("react-calendar__year-view__months__month")).get(Integer.parseInt(month)-1).click();
		driver.findElement(By.xpath("//abbr[text()='"+date+"']")).click();


		List<WebElement> actualList = driver.findElements(By.cssSelector(".react-date-picker__inputGroup__input"));

		for(int i =0; i<actualList.size();i++)

		{
		System.out.println(actualList.get(i).getAttribute("value"));

		Assert.assertEquals(actualList.get(i).getAttribute("value"), expectedList[i]);

		}
	}

}
