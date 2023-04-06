package webelementMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedMethodPractice {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.linkText("Create New Account")).click();
	WebElement radiobutton = driver.findElement(By.xpath("//input[@type='radio' and @value='2']"));
	radiobutton.click();
	if(radiobutton.isSelected())
		System.out.println("selected");
	else
		System.out.println("not selected");
	driver.quit();
}
}
