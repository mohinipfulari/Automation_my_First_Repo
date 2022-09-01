package All_Automation_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

public class ListBoxcreatfacebook {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32(1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/search?q=facebook&oq=&aqs=chrome.0.69i59i450l3.21144450j0j15&sourceid=chrome&ie=UTF-8");
		
	Thread.sleep(2000);
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//h3[contains(text(),'Facebook - log in or sign up')]")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
	Thread.sleep(2000);
	
	//WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
	
	//Select s=new Select(day);
	//s.selectByIndex(5);//6
	//s.selectByValue("5");//5
	//s.selectByVisibleText("5");//5
	//Thread.sleep(2000);
	WebElement month = driver.findElement(By.xpath("//select[@id='Month']"));
	Select s1=new Select(month);
	//s1.selectByIndex(6);
	//s1.selectByValue("6");
	s1.selectByVisibleText("june");
	Thread.sleep(2000);
	
	driver.quit();
}
}