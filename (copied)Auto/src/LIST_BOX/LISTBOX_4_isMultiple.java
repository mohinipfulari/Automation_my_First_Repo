package LIST_BOX;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LISTBOX_4_isMultiple {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32(1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		

		driver.get("https://www.facebook.com/");
		Thread.sleep(200);
		driver.findElement(By.xpath(("(//div[@class='_6ltg'])[2]"))).click();
		Thread.sleep(2000);
		
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
        Select s=new Select(month);
        
        boolean result = s.isMultiple();
        if(result==true) {
        	System.out.println("list box is multi-selectable");
        }
        else {
        	System.out.println("list box is single-selectable");
        }
        Thread.sleep(2000);
        driver.quit();
	}
	
}
