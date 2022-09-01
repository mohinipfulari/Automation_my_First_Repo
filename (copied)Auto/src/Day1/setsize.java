package Day1;

import java.awt.Dimension;
import java.awt.Point;
import java.awt.geom.Point2D;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class setsize {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32(1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.amazon.in");
		
		
		Object p=new Point(400,200);
		
		Thread.sleep(5000);
		

		
		driver.quit();
		
		
	}

}
