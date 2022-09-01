package AutoSuggestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class exe2 {
	public static void main(String[] args) throws InterruptedException {
		String exp="redmi note 10 pro";
		System.setProperty("webdrver.chrome.driver","D:\\Selenium\\chromedriver_win32(1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.co.in/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("redmi note 10 pro");
		Thread.sleep(2000);
		
		
	List<WebElement> apt = driver.findElements(By.xpath("(//span[@class='bmaJhd iJddsb'])[3]"));
	
	for(WebElement options:apt) {
		
		
		String act=options.getText();
		
		if(act.equals(exp)) {
			options.click();
			break;
		}
	}
	Thread.sleep(5000);
	driver.quit();
		
		
	}

}
