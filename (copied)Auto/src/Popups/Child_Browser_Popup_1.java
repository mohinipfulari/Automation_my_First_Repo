package Popups;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Child_Browser_Popup_1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32(1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://skpatro.github.io/demo/links/");
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("(//input[@class='btn'])[3]")).click();
		Thread.sleep(2000);
		
		String idofmainpage = driver.getWindowHandle();
		System.out.println(idofmainpage);
		
		Set<String> ids = driver.getWindowHandles();
		ArrayList<String>al=new ArrayList<String>(ids);
		
		System.out.println(al.get(0));
		
		System.out.println(al.get(1));
		
		Thread.sleep(2000);
		driver.quit();
		
		
		}

}
