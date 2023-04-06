package practiceChapter1;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program27 {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/login.do");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	WebElement element= driver.findElement(By.id("headerContainer"));
	Dimension size = element.getSize();
	int hieght=size.getHeight();
	int width = size.getWidth();
	System.out.println("hieght="+hieght);
	System.out.println("width="+width);
	driver.quit();
}
}
