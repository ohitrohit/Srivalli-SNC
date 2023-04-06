package practiceChapter1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program10 {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	String title= driver.getTitle();
	System.out.println(title);
	String URl= driver.getCurrentUrl();
	System.out.println(URl);
	driver.navigate().to("https://www.google.com/");
	driver.navigate().refresh();
	driver.navigate().to("https://www.skillrary.com/");
	driver.navigate().back();
	driver.quit();
}
}
