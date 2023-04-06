package practiceChapter1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program7 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.xpath("//a[contains(text(),'Forgotten')]")).click();
	driver.findElement(By.xpath("//input[contains(@type,'text')]")).sendKeys("8878498098");
	driver.findElement(By.xpath("//button[contains(text(),'Search')]")).click();
	Thread.sleep(3000);
	driver.quit();	
}
}
