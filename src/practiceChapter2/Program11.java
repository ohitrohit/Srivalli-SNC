package practiceChapter2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Program11 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoapp.skillrary.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	WebElement dropdown=driver.findElement(By.id("cars"));
	Select s = new Select(dropdown);
	s.selectByIndex(2);
	s.selectByValue("399");
	s.selectByVisibleText("Free ( 90 ) ");
	System.out.println(dropdown.getText());
	Thread.sleep(5000);
	s.deselectAll();
	driver.quit();
}
}
