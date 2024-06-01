package alertPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_DragAndDrop {

	public static void main(String[] args) {
		
		//code is not working
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium-webdriver\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/#Accepted%20Elements");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//li[@id='Accepted Elements']")).click();
		
		driver.switchTo().frame(0);
		
		WebElement sourceElement = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement Target = driver.findElement(By.xpath("//div[@id='droppable']"));
		
		Actions actions = new Actions(driver);
		actions.dragAndDrop(sourceElement, Target).build().perform();
	
		
		
		
		
		

	}

}
