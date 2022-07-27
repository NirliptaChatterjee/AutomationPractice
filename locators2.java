import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators2 {

	public static void main (String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/Users/nirliptachatterjee/Documents/TestAutomation/ChromeDriver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String password = getPassword(driver);
		driver.findElement(By.className("go-to-login-btn")).click();
		driver.findElement(By.id("inputUsername")).sendKeys("Nirlipta");
		Thread.sleep(1000);

		driver.findElement(By.name("inputPassword")).sendKeys(password);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='chkboxTwo']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		Thread.sleep(1000);
				
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		driver.close();
		
	}


public static String getPassword(WebDriver driver) throws InterruptedException { // to make the driver available to this method.
	driver.get("https://rahulshettyacademy.com/locatorspractice/");
	driver.findElement(By.linkText("Forgot your password?")).click();
	Thread.sleep(2000); // waiting for objects to show on the page
	driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Name");
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("email");
	driver.findElement(By.cssSelector("input[type='text']:nth-child(4)")).sendKeys("1234567890");
	Thread.sleep(1000);
	driver.findElement(By.className("reset-pwd-btn")).click();
	String passwordText = driver.findElement(By.cssSelector("p.infoMsg")).getText();// to get the password from the sentence
	String passwordArray[]=passwordText.split("'");
	String password= passwordArray[1].split("'")[0];
	return password;
	//Thread.sleep(1000);
}
}