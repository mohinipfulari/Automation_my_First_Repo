package Popups;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class child_browser_popup3 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32(1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@class='btn'])[3]")).click();	
		Thread.sleep(2000);
		Set<String> D = driver.getWindowHandles();
		ArrayList<String> al=new ArrayList<String>(D);
		driver.switchTo().window(al.get(1));
		
		Thread.sleep(2000);

		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//span[@class='menu-text'])[7]")).click();
		Thread.sleep(2000);
		driver.switchTo().window(al.get(0));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='home']")).click();
		Thread.sleep(2000);
		driver.quit();
		
		
	}

}
