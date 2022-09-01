package LIST_BOX_1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import graphql.execution.instrumentation.tracing.TracingInstrumentation.Options;

public class GET_OPTION {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32(1)\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.google.com/search?q=create+new+facebook+account&sxsrf=ALiCzsYsF19YY1I9MzMErvDWN4pED6MUfw%3A1657195648174&ei=gMzGYpyYCoq54t4Pi4ih2Ao&oq=creat+&gs_lcp=Cgdnd3Mtd2l6EAEYBDIHCCMQsQIQJzIECAAQQzIFCAAQgAQyCggAELEDEIMBEAoyBAgAEEMyBAgAEAoyBAgAEEMyBQgAEIAEMgQIABAKMgQIABAKOgcIABBHELADOgcIABCwAxBDOgQIIxAnOgoILhDHARDRAxBDOgsIABCABBCxAxCDAToICAAQsQMQgwE6CAgAEIAEELEDSgQIQRgASgQIRhgAUKdFWO5PYIx7aAVwAHgAgAHfAYgBtwmSAQUwLjQuMpgBAKABAcgBCsABAQ&sclient=gws-wiz");

		driver.findElement(By.xpath("(//div[@role='heading'])[2]")).click();
		
		Thread.sleep(2000);
		
	
		WebElement day = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		
			Select s=new Select(day);
			
			List<WebElement> options = s.getOptions();
			int size =options.size();
			System.out.println("size of day list box"+size);
			
			System.out.println("print all options by using for loop");
			for(int i=0;i<=size-1;i++) {
				System.out.println(options.get(i).getText());
			}
			System.out.println("print all options by descending order using for loop");
			for(int i=size-1;i>=0;i--) {
				System.out.println(options.get(i).getText());
			}
			
			
			
			Thread.sleep(2000);
			
			
			
			
			driver.quit();
			
			
			
		
		
	}

}
