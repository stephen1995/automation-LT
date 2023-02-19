package stepDefinitions;

import static org.junit.Assert.assertTrue;

import Helper.Helper;
import Pages.Cart;
import Pages.CheckoutComplete;
import Pages.CheckoutOverview;
import Pages.CheckoutYourInformation;
import Pages.Products;
import Pages.SwagsLabs;
import baseClass.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitions extends BaseClass {

	private String itemToBuyName;
	private SwagsLabs swaggy;
	private Products product;
	private Cart cart;
	private CheckoutOverview checkoutOveview;
	private CheckoutYourInformation checkoutYourInformation;
	private CheckoutComplete checkoutComplete;
	private Helper helper;

	@Given("user visits saucedemo page")
	public void user_visits_saucedemo_page() {
		helper = new Helper();
		BaseClass.Setup("https://www.saucedemo.com/");

	}

	@Given("enters valid credentials")
	public void enters_valid_credentials() {

		swaggy = new SwagsLabs();
		helper.waitForElement(driver, swaggy.usernameTxt);
		swaggy.usernameTxt.sendKeys("standard_user");
		swaggy.passwordTxt.sendKeys("secret_sauce");
		swaggy.loginBtn.click();

	}

	@Given("user add the first item to the cart")
	public void user_add_the_first_item_to_the_cart() {

		product = new Products();
		helper.waitForElement(driver, product.shoppingCartLnk);
		itemToBuyName = "Sauce Labs Bolt T-Shirt";

		product.clickAddToCartForItem(itemToBuyName);
		product.shoppingCartLnk.click();

	}

	@When("user completes checkout")
	public void user_completes_checkout() {

		cart = new Cart();

		helper.waitForElement(driver, cart.checkoutBtn);
		String currentItemName = cart.itemDescriptionLbl.getText();
		assertTrue(itemToBuyName.equals(currentItemName));
		cart.checkoutBtn.click();

		checkoutYourInformation = new CheckoutYourInformation();

		checkoutYourInformation.firstNameTxt.sendKeys("test");
		checkoutYourInformation.lastNameTxt.sendKeys("test");
		checkoutYourInformation.postalCodeTxt.sendKeys("test");
		checkoutYourInformation.continueBtn.click();

		checkoutOveview = new CheckoutOverview();

		String itemNameDoubleCheck = checkoutOveview.itemNameLbl.getText();
		assertTrue(itemToBuyName.equals(itemNameDoubleCheck));

		checkoutOveview.finishBtn.click();

	}

	@Then("User is able to see Thank you for your order message")
	public void user_is_able_to_see_Thank_you_for_your_order_message() {

		checkoutComplete = new CheckoutComplete();

		helper.waitForElement(driver, checkoutComplete.completeHeaderLbl);

		String currentMessage = checkoutComplete.completeHeaderLbl.getText();

		assertTrue(currentMessage.equals("THANK YOU FOR YOUR ORDER"));

	}

}
