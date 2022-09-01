package HandlingofMultipleElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example6 {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32(1)\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("file:///D:/HTML.DOC/10checkbox.html");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@type='checkbox'][1]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type='checkbox'][2]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type='checkbox'][3]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type='checkbox'][4]")).click();
         Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@type='checkbox'][5]")).click();
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//input[@type='checkbox'][6]")).click();
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//input[@type='checkbox'][7]")).click();
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//input[@type='checkbox'][8]")).click();
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//input[@type='checkbox'][9]")).click();
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//input[@type='checkbox'][10]")).click();
        Thread.sleep(4000);
		
		driver.findElement(By.xpath("//input[@type='checkbox'][10]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type='checkbox'][9]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type='checkbox'][8]")).click();
         Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@type='checkbox'][7]")).click();
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//input[@type='checkbox'][6]")).click();
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//input[@type='checkbox'][5]")).click();
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//input[@type='checkbox'][4]")).click();
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//input[@type='checkbox'][3]")).click();
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//input[@type='checkbox'][2]")).click();
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//input[@type='checkbox'][1]")).click();
        Thread.sleep(2000);
        driver.quit();
        
        
        
        
}
}
