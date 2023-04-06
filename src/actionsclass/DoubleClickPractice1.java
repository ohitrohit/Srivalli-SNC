package actionsclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickPractice1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement st= driver.findElement(By.xpath("//a[text()='COURSE']"));
		Actions a = new Actions(driver);
		a.moveToElement(st).perform();
		driver.findElement(By.xpath("//span[@class='wrappers']/a[text()='Selenium Training']")).click();
		WebElement plus = driver.findElement(By.id("add"));
		a.doubleClick(plus).perform();
		Thread.sleep(3000);
		driver.quit();
		
		
		
		
				
        		
}
}