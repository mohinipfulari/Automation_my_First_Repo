package LIST_BOX;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LISTBOX_2_getSizeofList {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32(1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		

		driver.get("https://www.facebook.com/");
		Thread.sleep(200);
		driver.findElement(By.xpath(("(//div[@class='_6ltg'])[2]"))).click();
		Thread.sleep(2000);
		
		WebElement year = driver.findElement(By.xpath("//select[@class='_9407 _5dba _9hk6 _8esg'][3]"));
		
		Select s=new Select(year);
		List<WebElement> options = s.getOptions();
		
		int size = options.size();
		System.out.println("size of year list box"+size);
		
		//print all options in list box using for each loop
		System.out.println("print all options in list box using for each loop");
		for(int i=0;i<=size-1;i++) {
			System.out.println(options.get(i).getText());
		}
		Thread.sleep(2000);
		driver.quit();
		
		
	}

}
