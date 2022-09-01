package CUSTOMIZE_LISTBOX;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class customizedlistbox {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32(1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
	  driver.findElement(By.xpath("//a[@rel='async']")).click();
		Thread.sleep(2000);
		WebElement year = driver.findElement(By.xpath("//select[@title='Year']"));
		Actions act=new Actions(driver);
		
		act.click(year).perform();
		
		act.sendKeys(Keys.ARROW_DOWN).perform();
		
		act.sendKeys(Keys.ARROW_DOWN).perform();
		
		act.sendKeys(Keys.ARROW_DOWN).perform();
		
		act.sendKeys(Keys.ARROW_DOWN).perform();
		
		Thread.sleep(2000);
		
		WebElement day = driver.findElement(By.xpath("//select[@class='_9407 _5dba _9hk6 _8esg _9m5o'][1]"));
		Actions act1=new Actions(driver);
		act1.click(day).perform();
		act1.sendKeys(Keys.ARROW_DOWN).perform();
		act1.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
		
		
		driver.quit();
		
	}

}
