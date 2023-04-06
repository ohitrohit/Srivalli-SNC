package pomPages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActitimeLoginTest {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/login.do");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	ActiTimeLoginPage login = new ActiTimeLoginPage(driver);
	
	if(login.getLogo().isDisplayed()) {
		System.out.println("login page display");
		
		login.setUsername("admin");
		login.setPassword("manager");
		login.clickCheckbox();
		login.clickLoginButton();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		boolean status = wait.until(ExpectedConditions.titleContains("Enter Time-Track"));
		if(status)
			System.out.println("home page display");
		else
			System.out.println("home page not found");
	}
	else
		System.out.println("login page not found");
	driver.quit();
}
}
