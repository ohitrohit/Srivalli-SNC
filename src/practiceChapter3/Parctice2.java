package practiceChapter3;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Parctice2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Practice login = new Practice(driver);
		login.getlogo();
		login.setUsername("admin");
		login.setPassword("admin");
		login.clickLoginButton();
		
		driver.quit();
		
	}
}
