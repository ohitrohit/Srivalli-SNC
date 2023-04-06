package practiceChapter2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program17 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.abhibus.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.findElement(By.id("datepicker1")).click();
	driver.findElement(By.xpath("//td[@data-handler=\"selectDay\"  and @data-month=\"1\"]/a[text()='17']")).click();
	driver.findElement(By.xpath("//a[text()='Search']")).click();
	Thread.sleep(3000);
	driver.quit();
}
}
