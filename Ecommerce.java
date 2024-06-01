package first;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ecommerce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium\\Selenium-webdriver\\chromedriver-win64\\chromedriver.exe");


		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
	
		
		int i=1;
		while(i<5)
		{
			
			driver.findElement(By.xpath("//div[3]//div[2]//a[2]")).click();
			i++;
	
		}
		
		driver.findElement(By.xpath("(//button[@type='button'][normalize-space()='ADD TO CART'])[3]")).click();

	}

}
