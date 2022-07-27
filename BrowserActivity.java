import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserActivity {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/Users/nirliptachatterjee/Documents/TestAutomation/ChromeDriver/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();// vs fullscreen
		// maximize vs fullscreen 
		driver.get("https://rahulshettyacademy.com");// will wait until the components are fully loaded
		Thread.sleep(2000);
		driver.navigate().to("https://google.com");// go to another webpage -- does not wait for the page to load
		Thread.sleep(2000);
		driver.navigate().back();
		driver.navigate().forward();
		driver.quit();
	}

}
