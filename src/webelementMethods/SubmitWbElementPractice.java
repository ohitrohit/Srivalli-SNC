package webelementMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SubmitWbElementPractice {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement SearchTextField = driver.findElement(By.id("twotabsearchtextbox"));
		SearchTextField.sendKeys("dresses");
		driver.findElement(By.id("nav-search-submit-button")).submit();
		driver.quit();
		
	}

}
