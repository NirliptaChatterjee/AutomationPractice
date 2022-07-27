import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locators {

public static void main (String [] args) throws InterruptedException {
	

	System.setProperty("webdriver.chrome.driver","/Users/nirliptachatterjee/Documents/TestAutomation/ChromeDriver/chromedriver");
	WebDriver driver = new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/locatorspractice/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.findElement(By.id("inputUsername")).sendKeys("Rahul");
	driver.findElement(By.name("inputPassword")).sendKeys("Rahul");
	driver.findElement(By.className("signInBtn")).click();
	System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
	
	driver.findElement(By.linkText("Forgot your password?")).click();
	Thread.sleep(2000); // waiting for objects to show on the page
	driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Name");
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("email");
	driver.findElement(By.cssSelector("input[placeholder='Email']")).clear();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("email");
	driver.findElement(By.cssSelector("input[type='text']:nth-child(4)")).sendKeys("1234567890");
	Thread.sleep(1000);
	driver.findElement(By.className("reset-pwd-btn")).click();
	System.out.println(driver.findElement(By.cssSelector("p.infoMsg")).getText());
	Thread.sleep(1000);
	driver.findElement(By.className("go-to-login-btn")).click();
	driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");
	Thread.sleep(1000);
	driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@id='chkboxTwo']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	Thread.sleep(1000);
	
	System.out.println(driver.findElement(By.tagName("p")).getText());//single tag
	Assert.assertEquals(driver.findElement(By.tagName("p")).getText(),"You are successfully logged in.");
	Thread.sleep(1000);

	
	System.out.println(driver.getTitle()); // Will print the title in the console.
	System.out.println(driver.getCurrentUrl());
	driver.close(); 
}

}