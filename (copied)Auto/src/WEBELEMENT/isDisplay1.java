package WEBELEMENT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isDisplay1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32(1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://affiliate.flipkart.com/login");
		Thread.sleep(2000);
		
		//boolean result = driver.findElement(By.xpath("//a[@class='navbar-brand']")).isDisplayed();
		//System.out.println(result);
		
		
		//WebElement result1 = driver.findElement(By.xpath("//a[@class='navbar-brand']"));
		//boolean out = result1.isDisplayed();
		//System.out.println(out);
		
		boolean D = driver.findElement(By.xpath("//img[@class='fb_logo _registrationPage__fbLogo img']")).isDisplayed();
		System.out.println(D);
		
	
		boolean result5 = false;
		try {
			WebElement logo = driver.findElement(By.xpath("//img[@class='fb_logo _registrationPage__fbLogo img']"));
			boolean result51 = logo.isDisplayed();
		}catch (Exception e) {
		 result5 = false;
		}
		
		System.out.println(result5);
		
		Thread.sleep(2000);
		driver.quit();

}
}