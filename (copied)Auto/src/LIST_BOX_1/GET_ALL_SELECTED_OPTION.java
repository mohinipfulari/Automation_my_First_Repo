package LIST_BOX_1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GET_ALL_SELECTED_OPTION {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32(1)\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/search?q=create+new+facebook+account&sxsrf=ALiCzsYsF19YY1I9MzMErvDWN4pED6MUfw%3A1657195648174&ei=gMzGYpyYCoq54t4Pi4ih2Ao&oq=creat+&gs_lcp=Cgdnd3Mtd2l6EAEYBDIHCCMQsQIQJzIECAAQQzIFCAAQgAQyCggAELEDEIMBEAoyBAgAEEMyBAgAEAoyBAgAEEMyBQgAEIAEMgQIABAKMgQIABAKOgcIABBHELADOgcIABCwAxBDOgQIIxAnOgoILhDHARDRAxBDOgsIABCABBCxAxCDAToICAAQsQMQgwE6CAgAEIAEELEDSgQIQRgASgQIRhgAUKdFWO5PYIx7aAVwAHgAgAHfAYgBtwmSAQUwLjQuMpgBAKABAcgBCsABAQ&sclient=gws-wiz");
   Thread.sleep(2000);
   driver.findElement(By.xpath("(//div[@role='heading'])[2]")).click();
   Thread.sleep(2000);
   WebElement month=driver.findElement(By.xpath("//select[@title='Month']"));
   Select s=new Select(month);
   List<WebElement> AllSelectedOption = s.getAllSelectedOptions();
  
for(WebElement option:AllSelectedOption) {
	
	System.out.println(option.getText());
}
Thread.sleep(2000);
driver.quit();
}
}