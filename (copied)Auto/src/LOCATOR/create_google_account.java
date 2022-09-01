package LOCATOR;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class create_google_account {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32(1)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.google.com/search?q=google+account+login&oq=google+a&aqs=chrome.1.69i57j69i59j0i131i433i512j0i433i512j0i512j69i60l3.28635j0j4&sourceid=chrome&ie=UTF-8");
	    
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//h3[text()='Google Account'])[1]")).click();
		
	Thread.sleep(2000);
	
		
	    driver.findElement(By.xpath("(//a[contains(text(),'Go to ')])[2]")).click();
	
	    driver.findElement(By.id("identifierId")).sendKeys("dnyanrajbhutekar5@gmail.com");
	    
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("(//span[@class='VfPpkd-vQzf8d'])[2]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//span[@jsname='V67aGc']")).click();
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("(//span[@class='VfPpkd-vQzf8d'])[3]")).click();
	    
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//span[text()='For myself']")).click();
	    Thread.sleep(2000);
	    
	    driver.findElement(By.name("firstName")).sendKeys("dnyanu");
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//input[@tabindex='0']")).sendKeys("bhutekar");
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//input[@name='Username']")).sendKeys("dnyanubhutekar3");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//input[@dir='ltr'])[3]")).sendKeys("123456789");
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//input[@type='checkbox']")).click();
	    Thread.sleep(2000);
	    driver.quit();
	    
	    
	    
	    
	}

	
	}


