package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathbytextbycontain {
public static void main(String[] args) {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.xpath("//a[contains(.,'Forgotten')]")).click();
	driver.findElement(By.xpath("//input[contains(@placeholder,'Email')]")).sendKeys("8878498098");
	driver.findElement(By.xpath("//button[contains(@class, 'selected')]")).click();	
	driver.quit();	
}
}
