package All_Automation_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_ {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32(1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.whatsapp.com/");
		Thread.sleep(4000);
		
	driver.manage().window().maximize();
	Thread.sleep(4000);
	
	driver.findElement(By.xpath("(//h5[@class='_9vd5'])[2]")).click();
	Thread.sleep(3000);
	
	driver.quit();
	}

}
