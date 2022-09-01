package All_Automation_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTitle {
public static void main(String[] args) {
	
	
String exp="Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";

		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32(1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		String acttitle=driver.getTitle();
		System.out.println(acttitle);
		
		if(exp.equals(acttitle)) {
			System.out.println("pass");
		}else {
			System.out.println("fail");
		}
		
		driver.close();

}
}