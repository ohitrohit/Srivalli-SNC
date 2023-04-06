package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssSelectorpractice {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("rohit");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("pihu");
		driver.findElement(By.cssSelector("button[name='login']")).click();
		Thread.sleep(5000);
		driver.quit();
	}

}
