package practiceChapter2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Program16 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoapp.skillrary.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	WebElement course=driver.findElement(By.id("course"));
	
	Actions a = new Actions(driver);
	a.moveToElement(course).perform();
	
	driver.findElement(By.xpath("//span[@class=\"wrappers\"]/a[text()='Selenium Training']")).click();
	driver.findElement(By.xpath("//button[@type='submit']/i[@class='fa fa-shopping-cart']")).click();
	
	Alert alertpopup =driver.switchTo().alert();
	System.out.println(alertpopup.getText());
	alertpopup.accept();
	Thread.sleep(3000);
	driver.quit();
	
	
}
}
