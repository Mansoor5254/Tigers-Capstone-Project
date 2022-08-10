package step.definition;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.LaptopNoteBooksPageObject;
import utilities.Utils;

public class LaptopNoteBooksStepDefinition extends Base {
	
	LaptopNoteBooksPageObject laptopPage = new LaptopNoteBooksPageObject();
	
	@When("User click on Laptop & NoteBook tab")
	public void user_click_on_laptop_note_book_tab() {
	laptopPage.clickOnLaptopsAndNoteBooks();
	logger.info("user clicked on laptop and notebook tab");
	    
	}
	@And("User click on Show all Laptop & NoteBook option")
	public void user_click_on_show_all_laptop_note_book_option() {
	laptopPage.clickOnShowAllLaptopsAndNoteBooks();
	logger.info("user clicked on show all laptop notebook option");
	     
	}
	@And("User click on MacBook item")
	public void user_click_on_mac_book_item() {
	laptopPage.clickOnMacBookItem();
	logger.info("user cliked on mackbook item");
		
	     
	}
	@Then("User should see {string} item\\(s) {string} showed to the cart")
	public void user_should_see_item_s_showed_to_the_cart(String string, String string2) {
	Assert.assertTrue(laptopPage.iscartTotalMessagePresent(string, string2));
	logger.info("user saw item(s) showed to the cart");
	Utils.takeScreenShot();    
	}
	@And("User click on cart option")
	public void user_click_on_cart_option() {
	laptopPage.clickOnCartOption();
	logger.info("user clicked on cart option");
	    
	}
	@And("user click on red X button to remove the item from cart")
	public void user_click_on_red_x_button_to_remove_the_item_from_cart() {
	laptopPage.clickOnRedXButton();	
	logger.info("user clicked on red x button");
	Utils.takeScreenShot();   
	}
	@And("item should be removed and cart should show {string} item\\(s)")
	public void item_should_be_removed_and_cart_should_show_item_s(String string) {
	logger.info("item removed from cart");
	Utils.takeScreenShot();
	
	}
	
	@And("User click on product comparison icon on MacBook")
	public void user_click_on_product_comparison_icon_on_MacBook() {
	laptopPage.clickMackBookComparisonButton();
	logger.info("user clicked on product comparison icon on macbook");
		  
	}
	
	@And("User click on product comparison icon on MacBook Air")
	public void user_click_on_product_comparison_icon_MacBook_Air() {
	laptopPage.clickMacBookAirComparisonButton();
	logger.info("user clicked on product comparison icon on macbook air");
		
	}
	@Then("User should get a message {string}")
	public void user_should_get_a_message(String string) {
	Assert.assertTrue(laptopPage.isComparisonSuccessMessagePresent(string));
	logger.info("comparison message is present");
	Utils.takeScreenShot();
		
	}
	
	@And("User click on Product comparison link")
	 public void user_click_on_product_comparison_link() {
	laptopPage.clickCompareLink();
	logger.info("user clicked on product comparison link");
		
	}
	
	@Then("User should see Product Comparison Chart")
	public void user_should_see_product_comparison_chart() {
	Assert.assertTrue(laptopPage.iscomparisonContentPresent());
	logger.info("comparison message is present");
	Utils.takeScreenShot();
		
	}
	
	@And("User click on heart icon to add {string} laptop to wish list")
	public void user_click_on_heart_icon_to_add_laptop_to_wish_list(String string) {
	laptopPage.clickOnHeartIconToAddSonyVaioInWishList();
	logger.info("user clicked on heart icon of sony vaio");
	Utils.hardWait();
	    
	}
	
	@And("User click on MacBook Pro item")
	public void user_click_on_macbook_pro_item() {
	laptopPage.clickOnMacBookProItem();	
	logger.info("user clicked on macBook pro item");
		
	}
	
	@Then("User should see  {string} price tag is present on UI")
	public void user_shoud_see_price_tag_is_present_on_ui(String string) {
	Assert.assertTrue(laptopPage.isPriceTagPresent());
	logger.info("price tag is present");
	Utils.takeScreenShot();
		
	}

}
