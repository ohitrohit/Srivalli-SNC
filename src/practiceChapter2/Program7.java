package practiceChapter2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Program7 {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoapp.skillrary.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement sb=driver.findElement(By.id("course"));
			
	
	Actions a = new Actions(driver);
	a.moveToElement(sb).perform();
	driver.findElement(By.xpath("//span[@class='wrappers']/a[text()='Selenium Training']")).click();
	WebElement plus= driver.findElement(By.id("add"));
	a.doubleClick(plus).perform();
	
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	WebElement Q=driver.findElement(By.id("quantity"));
	wait.until(ExpectedConditions.visibilityOf(Q));
	driver.quit();
	
	
}
}
