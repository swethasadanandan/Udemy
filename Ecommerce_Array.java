package first;


		import java.time.Duration;
import java.util.Arrays;

		import java.util.List;

		import org.openqa.selenium.By;

		import org.openqa.selenium.WebDriver;

		import org.openqa.selenium.WebElement;

		import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;



		public class Ecommerce_Array {

			//Udemy video -73 
			public static void main(String[] args) throws InterruptedException {
				// TODO Auto-generated method stub
				WebDriver driver = new ChromeDriver();
				System.setProperty("webdriver.chrome.driver",
						"D:\\Selenium\\Selenium-webdriver\\chromedriver-win64\\chromedriver.exe");


			//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));



		String[] itemsNeeded= {"Cucumber","Brocolli","Beetroot"};





		driver.get("https://rahulshettyacademy.com/seleniumPractise/");

		Thread.sleep(3000);

	addItems(driver,itemsNeeded);
		
		driver.findElement(By.className("cart-icon")).click();
		driver.findElement(By.xpath("//button[normalize-space()='PROCEED TO CHECKOUT']")).click();
		Thread.sleep(4000); 
		driver.findElement(By.className("promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.className("promoBtn")).click();
		
		//explicit Wait
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(20));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.className("promoInfo")));
		
		System.out.println(driver.findElement(By.className("promoInfo")).getText());
		
		Assert.assertEquals(driver.findElement(By.className("promoInfo")).getText(), "Code applied ..!");

		}

			
			
			
			
		public static  void addItems(WebDriver driver,String[] itemsNeeded)

		{

		int j=0;

		List<WebElement> products=driver.findElements(By.cssSelector("h4.product-name"));

		for(int i=0;i<products.size();i++)

		{

		//Brocolli - 1 Kg

		//Brocolli,    1 kg

		String[] name=products.get(i).getText().split("-");

		String formattedName=name[0].trim();

		//format it to get actual vegetable name

		//convert array into array list for easy search

		//  check whether name you extracted is present in arrayList or not-

		List itemsNeededList = Arrays.asList(itemsNeeded);

		if(itemsNeededList.contains(formattedName))

		{

		j++;

		//click on Add to cart

		driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

		if(j==itemsNeeded.length)

		{

		break;

		}

		}

		}

		}



		


	}


