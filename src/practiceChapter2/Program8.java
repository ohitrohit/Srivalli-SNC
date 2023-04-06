package practiceChapter2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Program8 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.myntra.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	WebElement bt=driver.findElement(By.xpath("//div[@class='desktop-navLink']/a[text()=\"Beauty\"]"));
	Actions a = new Actions(driver);
	a.contextClick(bt).perform();
	Thread.sleep(2000);
	driver.quit();
}
}
