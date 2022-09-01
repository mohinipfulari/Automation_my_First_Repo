package Day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getCurrentUrl {
	public static void main(String[] args) {
		String str="https://www.amazon.in/";
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32(1)\\chromedriver.exe");
		
		WebDriver driver1=new ChromeDriver();
		driver1.get("https//www.amazon.in/");
		
		//5.getCurrentUrl
				String x=driver1.getCurrentUrl();
				System.out.println(x);
				
				if(str.equals(x)) {
					System.out.println("pass");
					
			}else {
				System.out.println("fail");
			}
		
		//6.maximize
		driver1.manage().window().maximize();
		
		
		
		
		
		
	}

}
