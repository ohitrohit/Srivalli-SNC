package practiceChapter1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program29 {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.instagram.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	
	driver.findElement(By.name("username")).sendKeys("ravishkumar");
	driver.findElement(By.name("password")).sendKeys("raja");
	driver.findElement(By.xpath("//button[@type='submit']")).submit();
	WebElement button = driver.findElement(By.xpath("//button[@class='_acan _aiit _acap _aijb _acas _aj1-']"));
	Boolean l = button.isEnabled();
	System.out.println(l);
	
	driver.quit();
}
}
