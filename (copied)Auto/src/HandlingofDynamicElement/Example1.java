package HandlingofDynamicElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91902\\Desktop\\Rani Class\\selenium\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("oppo reno 7 pro");
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		Thread.sleep(2000);
		
		String review = driver.findElement(By.xpath("((//div[@class='_3pLy-c row'])[2]//span)[2]")).getText();
		System.out.println(review);
		
		Thread.sleep(2000);
		driver.quit();
		
		
		
	}

}
