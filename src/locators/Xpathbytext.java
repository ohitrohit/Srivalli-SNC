package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathbytext {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.skillrary.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[.='GEARS']")).click();
		driver.findElement(By.xpath("//a[.=' SkillRary Demo APP']")).click();
		Thread.sleep(3000);
		driver.quit();
	}

}
