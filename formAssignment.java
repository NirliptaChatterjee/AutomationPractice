import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class formAssignment {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/Users/nirliptachatterjee/Documents/TestAutomation/ChromeDriver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("div[class='form-group'] input[name='name']")).sendKeys("Nirlipta");
		driver.findElement(By.cssSelector("div[class='form-group'] input[name='email']")).sendKeys("nirlipta.chatterjee@yopmail.com");
		driver.findElement(By.cssSelector("input[id='exampleInputPassword1']")).sendKeys("password123");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id='exampleCheck1']")).click();
		
		driver.findElement(By.cssSelector("input[id='inlineRadio1']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("input[name='bday']")).sendKeys("13031998");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.cssSelector("div[class='alert alert-success alert-dismissible']")).getText());
		driver.quit();
	}
}
