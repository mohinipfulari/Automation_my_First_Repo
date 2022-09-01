package CUSTOMIZE_LISTBOX;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dropdown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32(1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/account/login?ret=/account/login%3Fret%3D%252Faccount%252Forders%26fromMyOrdersPage%3Dtrue");
		
		Thread.sleep(2000);
		WebElement men = driver.findElement(By.xpath("//span[@class='_2I9KP_'][3]"));
		Thread.sleep(2000);
		
		Actions act=new Actions(driver);
		act.contextClick(men).perform();
		Thread.sleep(2000);
		
		act.click(men).perform();
		
		Thread.sleep(2000);
		driver.quit();
		
		
	}

}
