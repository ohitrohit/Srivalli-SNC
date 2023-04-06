package practiceChapter2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Program5 {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoapp.skillrary.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement element =driver.findElement(By.id("course"));
	
	Actions a = new Actions(driver);
	a.moveToElement(element).perform();
	
	driver.findElement(By.xpath("//span[@class='wrappers']/a[text()='Cucumber']")).click();
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	WebElement element2 = driver.findElement(By.xpath("//b[text()='Description:']"));
	wait.until(ExpectedConditions.visibilityOf(element2));
	System.out.println(element2);
	driver.quit();
	
	
	
}
}
