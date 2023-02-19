package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseClass.BaseClass;

public class CheckoutComplete extends BaseClass {
	
	@FindBy(css = ".complete-header") public WebElement completeHeaderLbl;
	
	
	
	public CheckoutComplete() {
		PageFactory.initElements(driver, this);
	}
	

}
