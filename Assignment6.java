import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment6 {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","/Users/nirliptachatterjee/Documents/TestAutomation/ChromeDriver/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("checkBoxOption1")).click();
		String option = driver.findElement(By.cssSelector("label[for='bmw']")).getText();
		//driver.findElement(By.id("dropdown-class-example")).click();
		WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
		Select options = new Select(dropdown);
		options.selectByVisibleText(option);
		driver.findElement(By.cssSelector("input[id='name']")).sendKeys(option);
		driver.findElement(By.xpath("//input[@class='btn-style'][1]")).click();
		String text = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		Thread.sleep(1000);
		
		String finalText = text.split("Hello")[1].trim().split(",")[0];
		/*
		System.out.println(text);
		
		String[] text1 = text.split("Hello");
		
		String text2=text1[1].trim();
		System.out.println(text2);
		String[] text3 = text2.split(",");
		System.out.println(text3[0]);
		*/
		//System.out.println(finalText);
		if (finalText.equals(option))
		{
			System.out.println("Matching");
		}
		else
		{
			System.out.println("Not matching");
		}
		
		driver.quit();
		

	}
}