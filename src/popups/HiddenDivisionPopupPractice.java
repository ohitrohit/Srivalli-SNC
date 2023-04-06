package popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivisionPopupPractice {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.abhibus.com/");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	    Thread.sleep(3000);
	    driver.findElement(By.id("datepicker1")).click();
	    driver.findElement(By.xpath("//td[@data-year='2023'][5]/a[text()='13']")).click();
	    driver.findElement(By.xpath("//a[text()='Search']")).click();
	    driver.quit();
	    
	    
}
}