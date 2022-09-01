package WEBELEMENT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getText1 {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32(1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        
        driver.get("https://affiliate.flipkart.com/login");
        Thread.sleep(2000);
     String s = driver.findElement(By.xpath("//a[@href='/forgot-password']")).getText();   
     System.out.println(s);
     Thread.sleep(2000);
     driver.quit();
	}
}
