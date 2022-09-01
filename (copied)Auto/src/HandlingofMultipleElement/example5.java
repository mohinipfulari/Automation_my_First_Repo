package HandlingofMultipleElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example5 {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32(1)\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("file:///D:/HTML.DOC/10checkbox.html");
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.navigate().forward();
		Thread.sleep(2000);
		
		
		
		List<WebElement> D = driver.findElements(By.xpath("//input"));
		System.out.println(D.size());

		for(WebElement l:D) {
			System.out.println(l.getText());
		}
		Thread.sleep(2000);
		driver.quit();
		

	

	}

	
	

	
	}


