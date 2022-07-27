import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandlerAssignment {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver" , "/Users/nirliptachatterjee/Documents/TestAutomation/ChromeDriver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/windows");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("body:nth-child(2) div.row:nth-child(2) div.large-12.columns:nth-child(2) div.example > a:nth-child(2)")).click();
		Thread.sleep(2000);
		Set<String> windows = driver.getWindowHandles(); // [parentid,childid,subchildId]
		Iterator<String> it = windows.iterator();
		String parentId = it.next();
		String childId = it.next();
		driver.switchTo().window(childId);
		System.out.println(driver.findElement(By.cssSelector("div[class='example']")).getText());
		Thread.sleep(2000);
		driver.switchTo().window(parentId);
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath("//h3[text()=\"Opening a new window\"]")).getText());
		driver.quit();
}
}
