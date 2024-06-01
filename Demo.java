package first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium-webdriver\\chromedriver-win64\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  
		  //Sample 1
//		  driver.get("https://www.ebay.com/");
//		  
//		  //Title of page
//		  System.out.println(driver.getTitle());
//		  Thread.sleep(3000);
//		  driver.quit();	
		  
		  
		  
		  
		  
		  //Sample 2
		  driver.get("https://accounts.google.com/v3/signin/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F%3Flogin&emr=1&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F%3Flogin&osid=1&passive=1209600&service=mail&ifkv=ATuJsjxhs3eKfErAbc02olbakJTEykHemQDmfJaLdPFMquehQmnt283GVSdxaKDsl255rL2gnOdDUA&theme=glif&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		  
		  //Maximize the window
		  driver.manage().window().maximize()	;
		  driver.findElement(By.id("identifierId")).sendKeys("swethasadanandan@gmail.com");
		  driver.findElement(By.xpath("//*[text()='Next']")).click();
		  Thread.sleep(4000);
		  String et = driver.getTitle();
		  String dt ="Gmail";
		  
		  if(et.equals(dt))
		  {
			  System.out.println("success");
		  }
		  else {
			  System.out.println("error");
		  }
		  
		  driver.quit();

	}

}
