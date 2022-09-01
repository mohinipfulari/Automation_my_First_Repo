package SCREENSHOT;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Take_Screenshot {


	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32(1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		  File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		System.out.println(src);//C:\Users\ksd\AppData\Local\Temp\screenshot17650305546745110636.png

File dest=new File("E:\\screenshot\\facebook.png");
FileHandler.copy(src, dest);
Thread.sleep(2000);
driver.quit();

	}

}
