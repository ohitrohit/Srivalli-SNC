package practiceChapter2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program4 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 14");
	Thread.sleep(3000);
	List<WebElement> element =driver.findElements(By.xpath("//div[@class='autocomplete-results-container']"));
    Thread.sleep(3000);
    for(WebElement e: element) {
    	System.out.println(e.getText());
    }
    driver.quit();
}
}
