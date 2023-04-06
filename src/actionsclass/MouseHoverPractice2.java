package actionsclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverPractice2 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.myntra.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement kids = driver.findElement(By.xpath("//a[text()='Kids' and @data-type='navElements']"));
	 Actions a = new Actions(driver);
	 a.moveToElement(kids).perform();
	 driver.findElement(By.xpath("//a[text()='Learning & Development']")).click();
	 Thread.sleep(3000);
	 driver.quit();
}
}
