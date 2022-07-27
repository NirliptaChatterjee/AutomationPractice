import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class checkboxAssignment {
	// TODO Auto-generated method stub
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","/Users/nirliptachatterjee/Documents/TestAutomation/ChromeDriver/chromedriver");
	WebDriver driver = new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	driver.manage().window().maximize();
	driver.findElement(By.cssSelector("input[name='checkBoxOption1']")).click();
	System.out.println(driver.findElement(By.cssSelector("input[name='checkBoxOption1']")).isSelected());
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("input[name='checkBoxOption1']")).click();
	System.out.println(driver.findElement(By.cssSelector("input[name='checkBoxOption1']")).isSelected());
	Thread.sleep(2000);

	System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
	driver.quit();
	}
}
