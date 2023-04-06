package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActitimeLoginUsingProperties2 {
public static void main(String[] args) throws IOException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
    FileInputStream fis = new FileInputStream("./test data/data.properties");
    
	Properties property = new Properties();
	
	property.load(fis);
	
	driver.get(property.getProperty("url"));
	long time = Long.parseLong(property.getProperty("time"));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
	
	String user = property.getProperty("username");
	String pwd= property.getProperty("password");
	
	driver.findElement(By.id("username")).sendKeys(user+Keys.TAB+pwd+Keys.ENTER);
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
	boolean status = wait.until(ExpectedConditions.titleContains("Enter Time-Track")).booleanValue();
	if(status)
		System.out.println("pass");
	else
		System.out.println("fail");
	driver.quit();
	
	
	
}
}
