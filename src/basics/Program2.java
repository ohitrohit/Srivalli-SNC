package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program2 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	Thread.sleep(2000);
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	driver.navigate().back();
	driver.navigate().to("https://www.cricbuzz.com/");
	String title= driver.getTitle();
	System.out.println(title);
	String url = driver.getCurrentUrl();
	System.out.println(url);
	String pagesource = driver.getPageSource();
	System.out.println(pagesource);
	driver.quit();
	
}
}
