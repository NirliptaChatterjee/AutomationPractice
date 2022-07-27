import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitsAssignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		int j = 0;
		// To run in chrome
		System.setProperty("webdriver.chrome.driver",
				"/Users/nirliptachatterjee/Documents/TestAutomation/ChromeDriver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/loginpagePractise/");
		
		String[] itemsNeeded = { "iphone X", "Samsung Note 8", "Nokia Edge", "Blackberry" };
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("learning");
		driver.findElement(By.xpath("//span[contains(text(),'User')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[contains(@class,'justify-content-center')]/button[text()='Okay']")).click();

		WebElement dropdown = driver.findElement(By.cssSelector("select[class='form-control']"));
		Select option = new Select(dropdown);
		option.selectByVisibleText("Consultant");

		driver.findElement(By.cssSelector("input[id='terms']")).click();

		driver.findElement(By.cssSelector("input[name='signin']")).click();
		// Thread.sleep(10000);

		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(10));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("h4[class='card-title']")));
		List<WebElement> products = driver.findElements(By.cssSelector("h4[class='card-title']"));
		for (int i = 0; i < products.size(); i++) {
			String[] name = products.get(i).getText().split("-");
			String formattedName = name[0].trim();
			List itemsNeededList = Arrays.asList(formattedName);
			if (itemsNeededList.contains(name)) {
				j++;
			}

			driver.findElements(By.cssSelector("button[class='btn btn-info']")).get(i).click();
			if (j == itemsNeeded.length) {
				break;
			}
		}
		Thread.sleep(10000);

		driver.quit();

	}
}
