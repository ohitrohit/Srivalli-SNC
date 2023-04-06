package practiceChapter1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program3 {
 public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/login.do");
	Thread.sleep(5000);
	driver.findElement(By.partialLinkText("Forgot"));
	Thread.sleep(3000);
	if(driver.getTitle().contains("actiTIME"))
	{
	System.out.println("pass");	
	}
	else
	{
		System.out.println("fail");
	}
	driver.quit();
}
}
