package crossbrowserparallel;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ActitimeLoginTest {
    @Parameters("Browser")
	@Test
	public void loginTest(String browser) {
		WebDriver driver = null;
		
		switch(browser) {
		case "chrome" : driver = new ChromeDriver();
		break;
		case "edge" : driver = new EdgeDriver();
		break;
		default: System.out.println("invalid");
		}
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.titleContains("Enter Time-Track"));
		
		driver.quit();
		
	}
}
