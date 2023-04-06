package practiceChapter2;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Program19 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://skillrary.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.findElement(By.xpath("//a[@href=\"javascript::\" and text()=' GEARS ']")).click();
	driver.findElement(By.xpath("(//a[text()=' SkillRary Essay'])[2]")).click();
	
    Set<String> windowIDs = driver.getWindowHandles();
    for(String Id: windowIDs) {
    	driver.switchTo().window(Id);
    }
    Thread.sleep(3000);
    driver.findElement(By.id("mytext")).sendKeys("don");
    driver.findElement(By.xpath("//input[@value=\"Yes It's My Name\"]")).click();
    Thread.sleep(3000);
    driver.quit();
    
    	
		
}
}
