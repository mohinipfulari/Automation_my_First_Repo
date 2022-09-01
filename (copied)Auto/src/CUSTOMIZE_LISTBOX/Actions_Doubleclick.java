package CUSTOMIZE_LISTBOX;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_Doubleclick {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32(1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(2000);
		
		WebElement doubleClick = driver.findElement(By.xpath("//button[contains(text(),'Double-Click Me To See Alert')]"));
		
		Actions act=new Actions(driver);
		
		act.doubleClick(doubleClick).perform();
		
	   Alert alt=driver.switchTo().alert();
	   
	   System.out.println(alt.getText());
	   Thread.sleep(2000);
		
	   alt.accept();//use to click on ok button
	   //alt.dismiss();//use to click on cancel button
	   Thread.sleep(2000);
	   driver.quit();
	}

}
