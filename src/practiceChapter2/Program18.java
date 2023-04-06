package practiceChapter2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Program18 {
public static void main(String[] args) throws InterruptedException {
	
	ChromeOptions option = new ChromeOptions();
	option.addArguments("--disable-notifications");
	
	WebDriver driver = new ChromeDriver(option);
	driver.manage().window().maximize();
	driver.get("https://www.ajio.com/s/0-to-2-years-3767-54091");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	Thread.sleep(3000);
	driver.quit();
	
	
	
}
}
