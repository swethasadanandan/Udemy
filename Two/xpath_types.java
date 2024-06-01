package PackNew;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_types {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//By setting this system property, you are informing Selenium WebDriver about the location of the ChromeDriver executable
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium-webdriver\\chromedriver-win64\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  
		  driver.get("https://www.ebay.com/");
		  driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("guitar");
		  WebElement search = driver.findElement(By.xpath("//input[@id='gh-btn']"));
		  search.click();
		  
		  //Clear the input field
		  driver.findElement(By.xpath("//input[@id='gh-ac']")).clear();
		  

	}

}
