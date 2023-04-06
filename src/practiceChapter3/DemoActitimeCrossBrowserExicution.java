package practiceChapter3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DemoActitimeCrossBrowserExicution {

	@Parameters("Browser")
	@Test
	public void login(String browser) throws InterruptedException {
		WebDriver driver = null;
		
		switch(browser) {
		case "chrome" : driver =new ChromeDriver(); break;
		case "edge" : driver = new EdgeDriver() ; break;
		default : System.out.println("invalid");
		}
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("admin");
		driver.findElement(By.id("loginButton")).click();
		
		Thread.sleep(3000);
		driver.quit();
	}
}
