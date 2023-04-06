package popups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBroweserPopupPractice {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.skillrary.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.findElement(By.xpath("//a[text()=' GEARS ']")).click();
	driver.findElement(By.xpath("(//a[text()=' SkillRary Essay'])[2]")).click();
	
	String parentId = driver.getWindowHandle();
	Set<String> windowIDs = driver.getWindowHandles();
	
	for(String id :windowIDs) {
		driver.switchTo().window(id);
	}
	
	Thread.sleep(3000);
	driver.findElement(By.id("mytext")).sendKeys("rohit");
	driver.findElement(By.xpath("//input[@value=\"Yes It's My Name\"]")).click();
	Thread.sleep(5000);
	
	driver.quit();
}
}
