package All_Automation_Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import graphql.execution.instrumentation.tracing.TracingInstrumentation.Options;

public class getsizeoflistbox {
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
	
	WebElement day = driver.findElement(By.xpath("//select[@title='Day']"));
	
	Select s=new Select(day);
	List<WebElement> opt = s.getOptions();
	
	int size = opt.size();
	System.out.println("size of day list "+size);
		for(int i=0;i<=size-1;i++) {
		System.out.println(opt.get(i).getText());
	}
	Thread.sleep(2000);
	driver.quit();
	
	
	
	
	
	

}
	
}