package CUSTOMIZE_LISTBOX;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_DragNDrop {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32(1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		Thread.sleep(2000);
		
		WebElement src = driver.findElement(By.xpath("(//a[@style='color:#FFFFFF;'])[2]"));
		
		WebElement dest = driver.findElement(By.xpath("(//ol[@align='center'])[4]"));
		
		Actions act=new Actions(driver);
		
		act.dragAndDrop(src, dest).perform();
		
		//act.moveToElement(src).clickAndHold().moveToElement(dest).release().build().perform();
		
		Thread.sleep(2000);
		driver.quit();
		
	}
}
