package webelementMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetsizemethodPractice {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.com/ref=nav_logo");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds( 10));
	WebElement amazonlogo = driver.findElement(By.id("nav-logo-sprites"));
	Dimension size = amazonlogo.getSize();
	int height = size.getHeight();
	int width = size.getWidth();
	System.out.println("height"+height);
	System.out.println("width"+width);
	driver.quit();
}
}
