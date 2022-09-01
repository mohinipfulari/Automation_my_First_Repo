package All_Automation_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getcurrentUrl {
	public static void main(String[] args) {
		String expurl="https://www.instagram.com/accounts/login/";
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32(1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.instagram.com/accounts/login/");
		
		String acturl=driver.getCurrentUrl();
		System.out.println(acturl);
		
		if(expurl.equals(acturl)) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}driver.close();
	}

}
