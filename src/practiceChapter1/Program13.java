package practiceChapter1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program13 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.id("email")).sendKeys("rohit");
	driver.findElement(By.id("pass")).sendKeys("admin");
	driver.findElement(By.name("login")).click();
	Thread.sleep(3000);
	String title= driver.getTitle();
    System.out.println(title);
    driver.quit();
}
}
