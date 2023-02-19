package Helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Helper {
	
	
	
	public void waitForElement(WebDriver driver, WebElement element) {

		WebDriverWait wait = new WebDriverWait(driver,20);
		try {
			wait.until(ExpectedConditions.elementToBeClickable(element));
		} catch (Exception e) {
			System.out.println("Element not displayed: " + element);
		}

	}

}
