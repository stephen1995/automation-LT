package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseClass.BaseClass;

public class Cart extends BaseClass{
	
	
	@FindBy(css = ".inventory_item_name") public WebElement itemDescriptionLbl;
	
	@FindBy(css = "#checkout") public WebElement checkoutBtn;
	
	
	public Cart() {
		PageFactory.initElements(driver, this);
	}

}
