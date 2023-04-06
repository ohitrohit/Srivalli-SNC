package webelementMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnableMethodsPractice {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement searchbutton =driver.findElement(By.id("nav-search-submit-button"));   
	    boolean enablestatus = searchbutton.isEnabled();
	    if(enablestatus)
	    	System.out.println("enable");
	    else
	    	System.out.println("disable");
	    driver.quit();
	}

}
