package practiceChapter1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program25 {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement text=driver.findElement(By.xpath("//h2[text()='Facebook helps you connect and share with the people in your life.']"));
    String out=text.getText();
    System.out.println(out);
    driver.quit();
}
}
