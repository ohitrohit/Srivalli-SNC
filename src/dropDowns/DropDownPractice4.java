package dropDowns;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownPractice4 {
	public static void main(String[] args) {
     WebDriver driver = new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://demoapp.skillrary.com/");
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
     
     WebElement dropdown = driver.findElement(By.id("cars"));
     
     Select s = new Select(dropdown);
     if(s.isMultiple()) 
    	 System.out.println("muliple");
     else
    	 System.out.println("single");
     driver.quit();
}
}