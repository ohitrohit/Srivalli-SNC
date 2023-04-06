package practiceChapter1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Program16 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	WebDriverWait Wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	WebElement usernametf =driver.findElement(By.name("login"));
	Wait.until(ExpectedConditions.visibilityOf(usernametf)).sendKeys("rohit");
	Thread.sleep(3000);
	driver.quit();
	
}
}
