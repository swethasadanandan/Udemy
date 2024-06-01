package alertPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class RobotExample {
    public static void main(String[] args) throws AWTException, InterruptedException {
        // Set the path to 
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium-webdriver\\chromedriver-win64\\chromedriver.exe");

        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();

        
        driver.get("https://www.edureka.co/");

        // Click on the "Courses" link
        WebElement coursesLink = driver.findElement(By.linkText("Courses"));
        coursesLink.click();

        // Create a Robot instance
        Robot robot = new Robot();

        // Simulate pressing the down arrow key
        robot.keyPress(KeyEvent.VK_DOWN);
        
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        
//        robot.keyRelease(KeyEvent.VK_DOWN);

        // Wait for a while to see the effect (you might need to adjust this based on your needs)
        Thread.sleep(2000);

        // Close the browser
        driver.quit();
    }
}
