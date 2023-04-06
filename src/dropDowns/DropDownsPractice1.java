package dropDowns;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownsPractice1 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement dropdown = driver.findElement(By.id("searchDropdownBox"));
	Select s = new Select(dropdown);
	s.selectByVisibleText("Appliances");
	Thread.sleep(3000);
	s.selectByValue("search-alias=amazon-pharmacy");
	Thread.sleep(3000);
	s.selectByIndex(8);
	Thread.sleep(3000);
	driver.quit();
	
}
}
