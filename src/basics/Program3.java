package basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class Program3 {
   public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.manage().window().minimize();
	Thread.sleep(2000);
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	driver.navigate().to("https://www.amazon.in/");
	driver.navigate().back();
	String title = driver.getTitle();
	System.out.println(title);
	String currenturl= driver.getCurrentUrl();
	System.out.println(currenturl);
	String pagesource = driver.getPageSource();
	System.out.println(pagesource);
	driver.navigate().forward();
	Thread.sleep(2000);
	driver.quit();	
}
}
