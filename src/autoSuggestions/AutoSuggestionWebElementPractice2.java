package autoSuggestions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestionWebElementPractice2 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/ref=nav_logo");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("laptop");
	Thread.sleep(2000);
	List<WebElement> suggestion = driver.findElements(By.className("autocomplete-results-container"));
    Thread.sleep(2000);   
	for(WebElement e:suggestion ) {
    	System.out.println(e.getText());
    }
    driver.quit();
}
}
