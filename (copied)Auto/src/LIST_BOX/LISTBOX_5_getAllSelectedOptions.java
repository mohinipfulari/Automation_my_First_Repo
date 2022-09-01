package LIST_BOX;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LISTBOX_5_getAllSelectedOptions {
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
		
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		
		for(WebElement option:allSelectedOptions) {
			System.out.println(option.getText());//jul
		}
		driver.quit();
		
		
		
	}
}
