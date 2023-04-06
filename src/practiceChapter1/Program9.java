package practiceChapter1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Program9 {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	WebDriver driver2 = new EdgeDriver();
	driver.quit();
	driver2.quit();
}
}
