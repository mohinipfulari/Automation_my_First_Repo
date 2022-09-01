package Popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Popup {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32(1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/V4/");
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("5");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
		Thread.sleep(2000);
		
		Alert alt = driver.switchTo().alert();
		//3.getText-
		System.out.println(alt.getText());
				
		//1.accept-use to click on ok button
		alt.accept();
		
		//2.dismiss-use to click on cancel button
		//alt.dismiss();
		
		//Alert alt1=driver.switchTo().alert();	
		//System.out.println(alt1.getText());
		
		//alt1.accept();
		

Thread.sleep(2000);
driver.quit();
		
	}

}
