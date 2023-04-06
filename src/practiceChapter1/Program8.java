package practiceChapter1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program8 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("8878498098");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("rohit");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@name='login']")).click();
		Thread.sleep(3000);
		driver.quit();
	}

}