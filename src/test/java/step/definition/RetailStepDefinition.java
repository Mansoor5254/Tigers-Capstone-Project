package step.definition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import core.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.RetailPageObject;
import utilities.Utils;

public class RetailStepDefinition extends Base {
	RetailPageObject retailPage = new RetailPageObject();
	
	@Given("User is on retail Website")
	public void user_is_on_retail_website() {
	    Assert.assertTrue(retailPage.isTestEnvironmentLogoPresent()); 
	    logger.info("user is on Retail Website");
	}
	@When("User click on myAccount")
	public void user_click_on_my_account() {
		retailPage.clickOnMyAccount();
		logger.info("user clicked on myAccount");
	}
	@And("User click on login option")
	public void user_click_on_login_option() {
		retailPage.clickOnLoginOption();
		logger.info("user clicked on login option");
	}
	@And("User enter userName {string} and password {string}")
	public void user_enter_user_name_and_password(String email, String password) {
		retailPage.enterUserNameAndPassword(email, password); 
		logger.info("user entered" + email + "and" + password);
	}
	@And("User click on login button")
	public void user_click_on_login_button() {
		retailPage.clickOnLoginButton();
		logger.info("user clicked on login button");
	}
	@Then("User should be logged into myAccount page")
	public void user_should_be_logged_into_my_account_page() {
		Assert.assertTrue(retailPage.ismyAccountValidationPresent());
		logger.info("user is on My Account Page");
	    Utils.takeScreenShot();
	}
	
	@When("User click on Register for an Affiliate Account link")
	public void user_click_on_register_for_an_affiliate_account_link() {
	retailPage.clickOnRegisterForAnAffiliate();
	logger.info("user clicked on register for an affiliate account link");
	 
	}
	
	@And("User fill affiliate form with below information")
	public void user_fill_affiliate_form_with_below_information(DataTable dataTable) {
	List<Map<String,String>> affiliateinformation = dataTable.asMaps(String.class,String.class);
	retailPage.enterCompanyName(affiliateinformation.get(0).get("company"));
	retailPage.enterWebsiteField(affiliateinformation.get(0).get("website"));
	retailPage.taxIdField(affiliateinformation.get(0).get("taxID"));
	retailPage.selectPaymentType(affiliateinformation.get(0).get("paymentMethod"));
	retailPage.enterChequePayeeName(affiliateinformation.get(0).get("Payee Name"));
	logger.info("user filled the affiliate form");
	Utils.takeScreenShot();
		
	}
	
	@And("User check on About us check box")
	public void user_check_on_about_us_box() {
	retailPage.clickOnAboutUsCheckBox();
	logger.info("user checked on about us check box");
		
	}
	
	@And("User click on Continue button")
	public void user_click_on_continue_button() {
	retailPage.clickOnContinueButton();
	logger.info("user clicked on continue button");
		
	}
	
	@Then("User should see a success message")
	public void user_should_see_a_success_message() {
	Assert.assertTrue(retailPage.isSuccessMessageOfAffiliateAccountPresent());
	logger.info("success message is present");
	Utils.takeScreenShot();
		
	}
	
	@When("User click on Edit your affiliate information link")
	public void user_click_on_edit_your_affiliate_information_link() {
	retailPage.clickOnEditYourAffiliateInformation();
	logger.info("user clicked on edit your affiiate information link");
	}
	
	@And("user click on Bank Transfer radio button")
	public void user_click_on_bank_transfer_radio_button() {
	retailPage.clickOnSecondBankButton();
	logger.info("user clicked on bank transfer radio button");
	}
	
	@And("User fill Bank information with below information")
	public void user_fill_bank_information_with_below_information(DataTable dataTable) {
	List<Map<String,String>> editAffilateInfo = dataTable.asMaps(String.class,String.class);
	retailPage.enterBankName(editAffilateInfo.get(0).get("bankName"));
	retailPage.enterAbaNumber(editAffilateInfo.get(0).get("abaNumber"));
	retailPage.enterSwiftCode(editAffilateInfo.get(0).get("swiftCode"));
	retailPage.enterAccountName(editAffilateInfo.get(0).get("accountName"));
	retailPage.enterAccountNumber(editAffilateInfo.get(0).get("accountNumber"));
	logger.info("user filled the edit affiliate form");
	Utils.takeScreenShot();
	}
	
	@And("User click on second continue button")
	public void user_click_on_second_continue_Button() {
	retailPage.clickOnSecondContinueButton();
	logger.info("user clicked on second continue button1");
	
	}
	
	@Then("User should validate a success message")
	public void user_should_validate_a_success_message() {
	Assert.assertTrue(retailPage.isEditAffiliateSuccessMessagePresent());
	logger.info("success message is present");
	Utils.takeScreenShot();
		
	}
	
	@When("User click on Edit your account information link")
	public void user_click_on_edit_your_account_information_link() {
	retailPage.clickOnEditYourAccountInformation();
	logger.info("user clicked on edit your account information link");
	}
	
	@When("User modify below information")
	public void user_modify_below_information(DataTable dataTable) {
	List<Map<String,String>> editAccuntInfo = dataTable.asMaps(String.class,String.class);
	retailPage.enterFirstName(editAccuntInfo.get(0).get("firstName"));
	retailPage.enterLastName(editAccuntInfo.get(0).get("lastName"));
	retailPage.enterEditEmailField(editAccuntInfo.get(0).get("email"));
	retailPage.enterTelephoneField(editAccuntInfo.get(0).get("telephone"));
	logger.info("user filled edit your account information form");
	Utils.takeScreenShot();
	     
	}
	
	@When("User click on third continue button")
	public void user_click_on_third_continue_button() {
	retailPage.clickOnthirdContinueButton();
	logger.info("user clicked on third continue button");
	     
	}
	
	@Then("User should see a message Success: Your account has been successfully updated")
	public void user_should_see_a_message_success_your_account_has_been_successfully_updated() {
	Assert.assertTrue(retailPage.isYourAccountSuccessfullyHasBeenUpdatedPresent());
	logger.info("your account successfully has been updated is present");
	    
	}

	

}
