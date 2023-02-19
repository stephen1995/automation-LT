package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseClass.BaseClass;

public class CheckoutOverview  extends BaseClass{
	
	@FindBy(css = ".inventory_item_name") public WebElement itemNameLbl;
	@FindBy(id = "finish") public WebElement finishBtn;
	
	
	
	
public CheckoutOverview() {
		
		PageFactory.initElements(driver, this);
	}

}
