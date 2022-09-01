package LOCATOR;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssSelector {
 public static void main(String[] args) throws InterruptedException {
	 
	 System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32(1)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("file:///D:/HTML.DOC/webpage.locator.html");
	
	//7.cssSElector
	//driver.findElement(By.cssSelector("input[type='submit']")).click();	
	
	
	driver.findElement(By.cssSelector("input[type='checkbox']")).click();
	
	
	Thread.sleep(2000);
	
	driver.quit();
	
}	
 
 
 

}
