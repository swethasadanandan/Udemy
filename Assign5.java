import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assign5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Selenium-webdriver\\chromedriver-win64\\chromedriver.exe");

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("checkBoxOption3")).click();
		String a= driver.findElement(By.xpath("//label[normalize-space()='Option3']")).getText();
		WebElement dropdown=driver.findElement(By.id("dropdown-class-example"));
		Select s=new Select(dropdown);
        s.selectByVisibleText(a);
        
        driver.findElement(By.xpath("//input[@id='name']")).sendKeys(a);
        driver.findElement(By.id("alertbtn")).click();
       System.out.println(driver.switchTo().alert().getText());
       driver.switchTo().alert().accept();
		
		
		
		

		//driver.quit();
	}

}
