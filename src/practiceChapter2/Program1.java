package practiceChapter2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program1 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.name("q")).sendKeys("java");
	List<WebElement> suugestion = driver.findElements(By.xpath("//div[@class='OBMEnb']/descendant::li"));
	for(WebElement e : suugestion ) {
		System.out.println(e.getText());
	}
	Thread.sleep(3000);
	driver.quit();
}
}
