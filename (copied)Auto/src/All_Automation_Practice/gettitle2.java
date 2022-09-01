package All_Automation_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gettitle2 {
public static void main(String[] args) {
		String exptitle="instagram login";
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32(1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.instagram.com/accounts/login/");
		
		String acttitle=driver.getTitle();
		System.out.println(acttitle);
		
		if(exptitle.equals(acttitle)) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
driver.close();
}
}