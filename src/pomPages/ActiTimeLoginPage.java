package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimeLoginPage {

	//declaration of element
	
	@FindBy(className="atLogoImg") private WebElement logo;
	@FindBy(id="username")  private WebElement usernameTF;
	@FindBy(name="pwd")  private WebElement passwordTF;
	@FindBy(id="keepLoggedInCheckBox") private WebElement KeepMELoggedCheckbox;
	@FindBy(id="loginButton") private WebElement loginbutton;
	@FindBy(partialLinkText="Forgot") private WebElement forgotPasswordLink;
	
	//Initialization
	public ActiTimeLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//Utilization
	public WebElement getLogo() {
	    return logo;
    }
	public void setUsername(String username) {
		usernameTF.sendKeys(username);
	}
	
	public void setPassword(String password) {
		passwordTF.sendKeys(password);
	}
	public void clickLoginButton() {
		loginbutton.click();
	}
	public void clickForgotPassword() {
		forgotPasswordLink.click();
	}
	public void clickCheckbox() {
		KeepMELoggedCheckbox.click();
	}
}
