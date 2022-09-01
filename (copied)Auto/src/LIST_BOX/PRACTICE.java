package LIST_BOX;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PRACTICE {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32(1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(200);
		driver.findElement(By.xpath(("(//div[@class='_6ltg'])[2]"))).click();
		Thread.sleep(3000);
		
		WebElement month = driver.findElement(By.xpath("//select[@title='Month']"));
		
		
		Select s=new Select(month);
		s.selectByVisibleText("jul");
		System.out.println(s.getFirstSelectedOption().getText());
		
		}
	}


