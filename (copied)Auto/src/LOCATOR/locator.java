package LOCATOR;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locator {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32(1)//chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	 driver.get("file:///D:/HTML.DOC/webpage.locator.html");
	
	 //1.tagName
	driver.findElement(By.tagName("input")).sendKeys("quamtum@pune5.com");
	
	//2.id
	driver.findElement(By.id("abc")).sendKeys("Dnyanu5@");
	
	//3.classname
	driver.findElement(By.id("abcd")).sendKeys("dnyanu5@gmail.com");

	//4.name
	driver.findElement(By.id("123")).sendKeys("9011608564");
	
	//5.LinkText
	//driver.findElement(By.linkText("Link1")).click();
	
	//6.partial Link list
	driver.findElement(By.partialLinkText("Li")).click();
	Thread.sleep(2000);
	driver.quit();
}
}
