package practiceChapter3;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program1 {
public static void main(String[] args) throws IOException, InterruptedException {
	FileInputStream fis = new FileInputStream("./test data/practice.properties");
	Properties property = new Properties();
	property.load(fis);
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(property.getProperty("url"));
	Thread.sleep(2000);
	driver.quit();
	
	
}
}
