package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseClass.BaseClass;

public class CheckoutYourInformation extends BaseClass {
	
	
	@FindBy(id = "first-name") public WebElement firstNameTxt;
	@FindBy(id = "last-name") public WebElement lastNameTxt;
	@FindBy(id = "postal-code") public WebElement postalCodeTxt;
	@FindBy(id = "continue") public WebElement continueBtn;
	
	public CheckoutYourInformation() {
		
		PageFactory.initElements(driver, this);
	}

}
