package step.definition;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import core.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.DesktopPageObject;
import utilities.Utils;

public class DesktopPageStepDefinition extends Base {
	
	DesktopPageObject desktopPage = new DesktopPageObject();
	
	@Given("User is on Retail website")
	public void user_is_on_retail_website() {
		
	}
	
	@When("User click on Desktops tab")
	public void user_click_on_desktops_tab() {
	desktopPage.clickOnDesktopMenue();
	logger.info("user clicked on desktops tab");
	     
	}
	@And("User click on Show all desktops")
	public void user_click_on_show_all_desktops() {
	desktopPage.clickOnShowAllDesktops();
	logger.info("user clicked on show all desktops");
	     
	}
	@Then("User should see all items are present in Desktop page")
	public void user_should_see_all_items_are_present_in_desktop_page() {
	List<WebElement> desktopElements = desktopPage.desktopItems();
	for(WebElement element:desktopElements) {
	Assert.assertTrue(element.isDisplayed());	
	logger.info(element.getAttribute("title")+ "is present");
	}
	Utils.takeScreenShot();
	Utils.hardWait();
	}
	
	/*
	 * Step 1 we need to store the element in a list
	 * step 2 we need to iterate through the list
	 * step 3 we need to write an assertion to validate each element (index) is present
	 */
	     
	@When("User click  ADD TO CART option on HP LP3065item")
	public void user_click_add_to_cart_option_on_hp_lp3065item() {
	desktopPage.clickOnHpLP3065Item();
	logger.info("user clicked add to cart option on hp lp3065");
	     
	}
	@When("User select quantity {string}")
	public void user_select_quantity(String string) {
	desktopPage.enterQuantity(string);
	logger.info("user entered the quantity");
	     
	}
	
	@When("User click add to Cart button")
	public void user_click_add_to_cart_button() {
	desktopPage.clickOnAddToTheCartButton();
	logger.info("user clicked add to cart button");
	    
	}
	@Then("User should see a message {string}")
	public void user_should_see_a_message(String expectedSuccessMessage) {
//	Assert.assertEquals(desktopPage.successMessage(),expectedSuccessMessage);
//	logger.info(expectedSuccessMessage+"equals to" + desktopPage.successMessage() );
	Assert.assertTrue(desktopPage.isSuccessYouHaveAddedHPLP3065ToYourShoppingCartPresent());
	logger.info("success message is present");
	Utils.takeScreenShot();
	
	}
	
	@When("User click  ADD TO CART option on Canon EOS 5Ditem")
	public void user_click_add_to_cart_option_on_canon_eos_5ditem() {
	desktopPage.clickOnAddToCartOptionOnCanonEOS5Ditem();
	logger.info("user clicked add to the cart option on canon eos 5ditem");
	}
	@And("User select color from dropdown Red")
	public void user_select_color_from_dropdown_red() {
	desktopPage.selectRedColorFromDropDown();
	logger.info("user selected color from dropdown red");
	     
	}
	
	@When("User click on Canon EOS 5D item")
	public void user_click_on_canon_eos_5d_item() {
	desktopPage.clickOnCanonEOS5DCamera();
	logger.info("user clicked on canon eos5d item");
	
	     
	}
	@And("User click on write a review link")
	public void user_click_on_write_a_review_link() {
	desktopPage.clickOnReviewpart();
	logger.info("user clicked on review link");
	     
	}
	@And("user fill the review information with below information")
	public void user_fill_the_review_information_with_below_information(DataTable dataTable) {
	List<Map<String,String>> reviewInfo = dataTable.asMaps(String.class,String.class);
	desktopPage.enteryourNameField(reviewInfo.get(0).get("yourname"));
	desktopPage.enteryourReviewField(reviewInfo.get(0).get("yourReview"));
	desktopPage.clickOnSelectRating();
	logger.info("user filled the review information");
	Utils.takeScreenShot();
	     
	}
	@And("User click on ContinueButton")
	public void user_click_on_continue_button() {
	desktopPage.clickOnReviewContinueButton();
	logger.info("user clicked on continue button");
	Utils.takeScreenShot();   
	}
	@Then("User should see a message with {string}")
	public void user_should_see_a_message_with(String string) {
	Assert.assertTrue(desktopPage.isreviewThankYouMessagePresent(string));
	logger.info("thank you message is present");
	Utils.takeScreenShot();
	    
	}

}
