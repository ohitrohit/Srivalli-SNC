package practiceChapter1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program17 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/login.do");
	driver.findElement(By.xpath("//input[@class='textField']")).sendKeys("admin");
	driver.findElement(By.xpath("//input[@class='textField pwdfield']")).sendKeys("manager");
	driver.findElement(By.xpath("//a[@class='initial']")).click();
	Thread.sleep(3000);
	if(driver.getTitle().contains("actiTIME"))
		System.out.println("balle balle");
	else
		System.out.println("holy shit");
	driver.quit();
}
}
