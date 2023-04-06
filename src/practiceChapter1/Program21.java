package practiceChapter1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program21 {
	public static void main(String[] args) {
		
	
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://demo.actitime.com/");
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    WebElement h =driver.findElement(By.id("keepLoggedInCheckBox"));
    boolean check=h.isSelected();
    System.out.println(check);
    driver.quit();
    
}
}