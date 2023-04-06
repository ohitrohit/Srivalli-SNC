package dropDowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownPractice5 {
	public static void main(String[] args) throws InterruptedException {
	     WebDriver driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://demoapp.skillrary.com/");
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	     
	     WebElement dropdown = driver.findElement(By.id("cars"));
	     
	     Select s = new Select(dropdown);
	     if(s.isMultiple()) {
	    	 s.selectByIndex(0);
	    	 s.selectByValue("199");
	    	 s.selectByVisibleText("INR 300 - INR 399 ( 1 ) ");
	    	 Thread.sleep(3000);
	    	 List<WebElement> selectedoptions = s.getAllSelectedOptions();
	    	 for(WebElement element : selectedoptions) {
	    		 System.out.println(element.getText());
	    	 }
	    	 s.deselectAll();
	     }
	     else
	    	 System.out.println("single");
	     driver.quit();
}
}