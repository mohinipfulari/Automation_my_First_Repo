package WEBELEMENT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelement_isEnable {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32(1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		Thread.sleep(2000);
		
		//boolean result = driver.findElement(By.xpath("//a[contains(text(),'Sign up')]")).isEnabled();
		//System.out.println(result);
		
		boolean output = driver.findElement(By.xpath("//button[@name='login']")).isEnabled();
		System.out.println(output);
		Thread.sleep(2000);
		driver.quit();
	}
}
