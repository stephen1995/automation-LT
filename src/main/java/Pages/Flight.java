package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import baseClass.BaseClass;

public class Flight extends BaseClass  {


	
	@FindBy(id ="roundTripFlight_fromLocation") public WebElement fromTxt;
	
	@FindBy(id = "roundTripFlight_toLocation") public WebElement toTxt;
	
	@FindBy(xpath = "//a[@data-testid=\"DropdownListGroupItem_0_0_link\"]") public WebElement airport;
	
	@FindBy(xpath = "//button[@data-testid=\"SearchFlights\"]") public WebElement searchFlightsBtn;
	
	@FindBy(id = "roundTripFlightDepartureDate") public WebElement departureTxt;
	
	@FindBy(id = "roundTripFlightReturnDate") public WebElement returnTxt;

	
	
	public Flight() {
		PageFactory.initElements(driver, this);		
		
	}
	public void SwtichToFrame() {
		WebDriverWait wait =new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(fromTxt));
		
	}
	
	
	
	
	
}
