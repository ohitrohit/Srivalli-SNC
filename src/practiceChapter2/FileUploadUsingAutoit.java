package practiceChapter2;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadUsingAutoit {
public static void main(String[] args) throws IOException, InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.naukri.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.findElement(By.id("register_Layer")).click();
	
	
	WebElement element= driver.findElement(By.xpath("//button[text()='Upload Resume']"));
	
	JavascriptExecutor js =(JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView(true)",element);
	Thread.sleep(3000);
	element.click();
	
	Runtime.getRuntime().exec("D:\\Q-spider Notes\\SELENIUM\\practice.exe");
}
}
