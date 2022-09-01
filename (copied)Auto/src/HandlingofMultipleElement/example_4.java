package HandlingofMultipleElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebElement;

public class example_4 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32(1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com");
		Thread.sleep(200);
		
		 List<WebElement> links = driver.findElements(By.xpath("//a"));
		 System.out.println(links.size());
		 
		 for(WebElement L:links) {
			 System.out.println(L.getText());
			 
			 
		 }
		 Thread.sleep(2000);
		 driver.quit();
		
		
	}

}
