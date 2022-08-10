package step.definition;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.HomePageObject;
import utilities.Utils;

public class HomePageStepDefinition extends Base{
	
	HomePageObject homePage = new HomePageObject();
	
	
	@When("User click on Currency")
	public void user_click_on_currency() {
	homePage.clickOnCurrencyDropdown();
	logger.info("user clicked on currency");
		
	}
	
	@And("User Chose Euro from dropdown")
	public void user_chose_euro_from_dropdown() {
	homePage.clickOnEuro();
	logger.info("user chose euro currency");
	
		
	}
	
	@Then("currency value should change to Euro")
	public void curency_value_should_change_to_euro() {
	Assert.assertTrue(homePage.isCurrencyValueChagedToEuro());
	logger.info("currency changed to euro");
	Utils.takeScreenShot();
		
	}
	
	@When("User click on shopping cart")
	public void user_clicked_on_shopping_cart() {
	homePage.clickOnShoppingCart();
	logger.info("user clicked on shopping cart");
		
		
	}
	
	@Then("{string} message should display")
	public void message_should_display(String string) {
	Assert.assertTrue(homePage.isEmptyCartMessagePresent()); 
	logger.info("empty cart message is present");
	Utils.takeScreenShot();
		
	}

}
