package alertPack;


import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium-webdriver\\chromedriver-win64\\chromedriver.exe");

		  
		  driver.get("https://www.edureka.co/");
		 
		  Actions act = new Actions(driver);
		  WebElement click = driver.findElement(By.xpath("//a[@class='dropdown-toggle hidden-xs hidden-sm ga_browse_top_cat']"));
		  act.moveToElement(click).build().perform();
		  WebElement search = driver.findElement(By.xpath("//a[@class ='dropdown-toggle ga_top_category'][normalize-space()='Software Testing']"));
		  act.moveToElement(search).build().perform();
		  driver.findElement(By.xpath("//a[@class='ga_top_categories_course'][normalize-space()='Selenium Certification Training Course']")).click();

		  driver.findElement(By.xpath("//div[@class='navbar_search_bx__1IWnI']")).click();
		  
		  
	}

}
