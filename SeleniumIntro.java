import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// To run in chrome
		System.setProperty("webdriver.chrome.driver","/Users/nirliptachatterjee/Documents/TestAutomation/ChromeDriver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle()); // Will print the title in the console.
		System.out.println(driver.getCurrentUrl());
		driver.close(); // closes the current window
		//driver.quit(); // closes all associated windows
		
		//To run in firefox
		//geckodriver
		System.setProperty("webdriver.gecko.driver","/Users/nirliptachatterjee/Documents/TestAutomation/GeckoDriver/geckodriver");
		WebDriver driverr = new FirefoxDriver();
		driverr.get("https://rahulshettyacademy.com");
		driverr.manage().window().maximize();
		System.out.println(driverr.getTitle()); // Will print the title in the console.
		System.out.println(driverr.getCurrentUrl());
		driver.close();
		
		//To run in edge 
		/*
		System.setProperty("webdriver.edge.driver","PATH");
		WebDriver driverr = new EdgeDriver(); 
		 */
		
	}

}