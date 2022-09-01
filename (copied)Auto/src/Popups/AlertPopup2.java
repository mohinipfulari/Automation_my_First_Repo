package Popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AlertPopup2 {
	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32(1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/V4/");
		Thread.sleep(2000);
		WebElement D = driver.findElement(By.xpath("//input[@type='password']"));
		D.sendKeys("123456");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
		Thread.sleep(2000);
		Alert alt = driver.switchTo().alert();
		
		System.out.println(alt.getText());
		
		alt.accept();//click on ok button
		alt.dismiss();//click on cancel button
		
		Thread.sleep(2000);
		driver.quit();
		
	}

}
