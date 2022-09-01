package Day1;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class getTitle {
public static void main(String[] args) {
	
	String expTitle="Online shoping site in india :shope online for mobile,books,and more-Amazon.in";
	
	System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32(1)\\chromedriver.exe");
	WebDriver driver1=new ChromeDriver();
	driver1.get("https://www.amazon.in");
	String actTitle =driver1.getTitle();
	System.out.println(actTitle);
	
	//if(expTitle.equals(actTitle)) {
		//System.out.println("pass");
	//}else {
	//	System.out.println("fail");
}
	
	
}


