package practiceChapter1;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program22 {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	WebElement e = driver.findElement(By.id("nav-search-submit-button"));
	boolean searchbt = e.isEnabled();
	System.out.println(searchbt);
	driver.quit();
}
}
