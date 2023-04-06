package practiceChapter2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Program10 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	WebElement searchbox= driver.findElement(By.id("searchDropdownBox"));
	Select s = new Select(searchbox);
	List<WebElement> list=s.getOptions();
	for(WebElement element:list) {
			System.out.println(element.getText());
	}
	Thread.sleep(2000);
	driver.quit();

}
}