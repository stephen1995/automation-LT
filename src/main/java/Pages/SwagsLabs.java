package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import baseClass.BaseClass;

public class SwagsLabs extends BaseClass  {


	
	@FindBy(id ="user-name") public WebElement usernameTxt;
	
	@FindBy(id = "password") public WebElement passwordTxt;
	
	@FindBy(id = "login-button") public WebElement loginBtn;
	

	
	public SwagsLabs() {
		PageFactory.initElements(driver, this);		
		
	}
	
	
	
}
