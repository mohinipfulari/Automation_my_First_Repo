package SCREENSHOT;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class screenshot2 {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32(1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		 File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 System.out.println(src);
		String random=RandomString.make(4);
		File dest=new File("E:\\screenshot\\facebook"+random+".png");
		FileHandler.copy(src, dest);
		Thread.sleep(2000);
		driver.quit();
		
		
		
		
		
				
	}

}
