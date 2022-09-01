package HandlingofMultipleElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32(1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/login/");
		Thread.sleep(2000);

		
		List<WebElement> tag = driver.findElements(By.xpath("//input"));
		System.out.println(tag.size());
		
		for(WebElement l2:tag) {
		System.out.println(l2.getText());
		}
		Thread.sleep(2000);
		driver.quit();
}
	
}
