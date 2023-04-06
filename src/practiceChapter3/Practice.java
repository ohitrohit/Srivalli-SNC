package practiceChapter3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Practice {

	@FindBy(className = "atLogoImg") private WebElement logo;
	@FindBy(id = "username") private WebElement usernametf;
	@FindBy(name = "pwd") private WebElement passwordtf;
	@FindBy(id = "loginButton") private WebElement loginbutton;
	
	public Practice (WebDriver driver) {
		PageFactory.initElements(driver , this);
	}
	
	public WebElement getlogo(){
		return logo;
		
	}
	public void  setUsername(String username) {
		usernametf.sendKeys(username);
	}
	public void setPassword(String password) {
		passwordtf.sendKeys(password);
	}
	public void clickLoginButton() {
		loginbutton.click();
	}
	
	
}
