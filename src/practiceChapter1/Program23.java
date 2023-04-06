package practiceChapter1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Program23 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	WebElement mobile=driver.findElement(By.xpath("//a[text()='Mobiles']"));
	wait.until(ExpectedConditions.elementToBeClickable(mobile)).click();
	
	WebElement w1 =driver.findElement(By.xpath("//span[text()='Mobile Accessories']"));
	wait.until(ExpectedConditions.elementToBeClickable(w1)).click();
	
	if(driver.getTitle().contains("Mobile"))
		System.out.println("yes");
	else
		System.out.println("no");
	
	driver.quit();
	
	
	
}
}
