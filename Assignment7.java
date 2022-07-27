import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

public class Assignment7 {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		int j = 0;
		int i = 0;
		System.setProperty("webdriver.chrome.driver",
				"/Users/nirliptachatterjee/Documents/TestAutomation/ChromeDriver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,630)");// scroll to the table

		List<WebElement> rows = driver.findElements(By.xpath("//body/div[3]/div[1]/fieldset/table/tbody/tr"));
		while (i < rows.size()) {
			i++;
		}
		System.out.println(i); // to find the number of rows.

		List<WebElement> columns = driver.findElements(By.xpath("//body/div[3]/div[1]/fieldset/table/tbody/tr[1]/th"));

		while (j < columns.size()) {
			j++;

		}
		System.out.println(j);// to find the number of columns

		List <WebElement> items = driver.findElements(By.xpath("//body/div[3]/div[1]/fieldset/table/tbody/tr[3]/td"));
		for (int k=0; k<items.size();k++)
		{
			String item = items.get(k).getText();
			System.out.println(item);
		}
		
		
		driver.quit();

	}
	// to find the number of rows.

}
