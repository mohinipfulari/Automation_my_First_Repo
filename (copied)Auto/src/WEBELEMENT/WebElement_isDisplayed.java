package WEBELEMENT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement_isDisplayed {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32(1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C589460569870%7Ce%7Ccreate%20facebook%27%7C&placement=&creative=589460569870&keyword=create%20facebook%27&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221432%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-368359293525%26loc_physical_ms%3D1007788%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=EAIaIQobChMIhL7DgsPo-AIV_5JmAh0-JgBWEAAYASAAEgLKqvD_BwE");
		Thread.sleep(2000);
		//boolean result = driver.findElement(By.xpath("//img[@alt='Facebook']")).isDisplayed();
		//System.out.println(result);//true
		
		boolean result = driver.findElement(By.xpath("//img[@id='dimg_19']")).isDisplayed();
		System.out.println(result);//no such element exception
		boolean result1;
		try {
			WebElement logo = driver.findElement(By.xpath("//img[@id='dimg_19']"));
				result1=logo.isDisplayed();
		
		}catch(Exception e) {
			result1=false;
		}
		System.out.println(result1);
		Thread.sleep(2000);
		driver.quit();
	}
}
