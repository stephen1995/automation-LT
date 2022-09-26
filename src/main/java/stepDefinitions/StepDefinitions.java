package stepDefinitions;
import Pages.Flight;
import baseClass.BaseClass;
import cucumber.api.java.en.Given;


public class StepDefinitions extends BaseClass {

	
	

	@Given("The user has navigated to Flight search page")
	public void the_user_has_navigated_to_Flight_search_page() {
		BaseClass.Setup("https://amex-stg.iseatz.com/flight-searches");
	}

	@Given("selected an adult in economy class")
	public void selected_an_adult_in_economy_class() {
	    
	}

	@Given("fill From textfield")
	public void and_fill_From_textfield() {
	   Flight hijito = new Flight();
	   hijito.fromTxt.sendKeys("NYC");
	   hijito.airport.click();   
	}

	@Given("fill To textfield")
	public void and_fill_To_textfield() {
		Flight hijito = new Flight();
		  hijito.toTxt.sendKeys("LAX");
		  hijito.airport.click();
	}
	
	@Given("click on Search")
	public void click_on_Search() {
		Flight hijito = new Flight();
		  hijito.searchFlightsBtn.click();
	}
	
	@Given("fill Departure")
	public void fill_Departure() {
		Flight hijito = new Flight();
		  //Create a method for current time
		  hijito.departureTxt.sendKeys("08/28/2022");
	}

	@Given("fill Return")
	public void fill_Return() {

	}


	

	
}
