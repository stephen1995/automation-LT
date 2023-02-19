package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseClass.BaseClass;

public class Products extends BaseClass {
	
	
	@FindBy(css =".inventory_item_name" ) public WebElement itemNameLbl;

	@FindBy(css = ".shopping_cart_link") public WebElement shoppingCartLnk;
	
	public Products() {
		PageFactory.initElements(driver, this);
	}
	
	public void clickAddToCartForItem(String itemName) {
	    List<WebElement> products = driver.findElements(By.className("inventory_item"));

	    for (WebElement product : products) {
	        WebElement productTitle = product.findElement(By.className("inventory_item_name"));
	        String name = productTitle.getText();

	        if (name.equals(itemName)) {
	            WebElement addToCartBtn = product.findElement(By.className("btn_inventory"));
	            addToCartBtn.click();
	            break;
	        }
	    }
	}
	
	
	
	
	
	
	
	

}
