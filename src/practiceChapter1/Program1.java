package practiceChapter1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver ();
		driver.manage().window().minimize();
		Thread.sleep(5000);
		driver.manage().window().maximize();
		driver.get("https://skillrary.com/");
		Thread.sleep(5000);
		driver.findElement(By.partialLinkText("GEARS")).click();
		Thread.sleep(5000);
		driver.quit();
	}

}
