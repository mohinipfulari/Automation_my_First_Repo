package SCREENSHOT;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class SCREENSHOT1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32(1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://affiliate.flipkart.com/login");
		Thread.sleep(2000);
		
		 File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 System.out.println(src);
		 
		 String random = RandomString.make(3);
		 File dest=new File("E:\\screenshot\\flipkart"+random+".png");
		 FileHandler.copy(src,dest);
		 Thread.sleep(2000);
		 driver.quit();

	}

}
