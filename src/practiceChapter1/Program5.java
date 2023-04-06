package practiceChapter1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program5 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/login.do");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@name='username']"));
	driver.findElement(By.xpath("//input[@name='pwd']"));
	driver.findElement(By.xpath("//a[@id='loginButton']"));
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
