package webelementMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetattributeValuePractice2 {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.instagram.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement nametextfeild=driver.findElement(By.name("username"));
	String attributevalue = nametextfeild.getAttribute("type");
	System.out.println(attributevalue);
	driver.quit();
}
}
