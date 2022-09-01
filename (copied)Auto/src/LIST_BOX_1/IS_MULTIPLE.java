package LIST_BOX_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IS_MULTIPLE {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32(1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/search?q=create+new+facebook+account&sxsrf=ALiCzsYsF19YY1I9MzMErvDWN4pED6MUfw%3A1657195648174&ei=gMzGYpyYCoq54t4Pi4ih2Ao&oq=creat+&gs_lcp=Cgdnd3Mtd2l6EAEYBDIHCCMQsQIQJzIECAAQQzIFCAAQgAQyCggAELEDEIMBEAoyBAgAEEMyBAgAEAoyBAgAEEMyBQgAEIAEMgQIABAKMgQIABAKOgcIABBHELADOgcIABCwAxBDOgQIIxAnOgoILhDHARDRAxBDOgsIABCABBCxAxCDAToICAAQsQMQgwE6CAgAEIAEELEDSgQIQRgASgQIRhgAUKdFWO5PYIx7aAVwAHgAgAHfAYgBtwmSAQUwLjQuMpgBAKABAcgBCsABAQ&sclient=gws-wiz");
		driver.findElement(By.xpath("(//div[@role='heading'])[2]")).click();
		
		Thread.sleep(2000);
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		
		Select s=new Select(day);
		
		boolean result=s.isMultiple();
		
		if(result==true) {
			System.out.println("list box is multiselectable");
			
		}else {
			System.out.println("list box is single selectable");
		}
		Thread.sleep(2000);
		driver.quit();
		
		
		

	}

}
