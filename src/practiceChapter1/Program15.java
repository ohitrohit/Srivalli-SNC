package practiceChapter1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program15 {
public static void main(String[] args) throws InterruptedException{
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/login.do");
	driver.findElement(By.partialLinkText("Forgot")).click();
	Thread.sleep(3000);
	driver.findElement(By.partialLinkText("Return")).click();
	Thread.sleep(3000);
	String title=driver.getTitle();
	System.out.println(title);
	driver.quit();
}
}
