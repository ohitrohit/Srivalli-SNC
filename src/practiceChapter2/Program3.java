package practiceChapter2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program3 {
public static void main(String[] args) {
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.findElement(By.name("q")).sendKeys("ana di arms");
	
	List<WebElement> suggestion =driver.findElements(By.xpath("//div[@class='erkvQe']/descendant::ul[@jsname='bw4e9b']"));
	for(WebElement e : suggestion) {
		System.out.println(e.getText());
	}
	driver.quit();
		
	
	
}
}
