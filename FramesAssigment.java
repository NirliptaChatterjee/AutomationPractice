import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesAssigment {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"/Users/nirliptachatterjee/Documents/TestAutomation/ChromeDriver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/nested_frames");

		WebElement topframe = driver.findElement(By.xpath("//frame[@name='frame-top']"));
		String frame1 = driver.switchTo().frame(topframe).switchTo().frame("frame-middle")
				.findElement(By.xpath("//body")).getText();
		System.out.println(frame1);

		driver.quit();

	}
}

/*driver.findElement(By.linkText("Nested Frames")).click();



driver.switchTo().frame("frame-top");



driver.switchTo().frame("frame-middle");



System.out.println(driver.findElement(By.id("content")).getText());



}


*/