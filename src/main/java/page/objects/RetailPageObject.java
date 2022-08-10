package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class RetailPageObject extends Base {
	
	public RetailPageObject() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[contains (text(),'My Account')]")
	private WebElement myAccount;
	
	@FindBy(xpath = "//a[contains (text(),'Login')]")
	private WebElement loginOption;
	
	@FindBy(id = "input-email")
	private WebElement emailField;
	
	@FindBy(id = "input-password")
	private WebElement passwordField;
	
	@FindBy(xpath = "//input[@type ='submit']")
	private WebElement loginButton;
	
	@FindBy(xpath = "//a[contains(text(),'TEST ENVIRONMENT')]")
	private WebElement pageLogo;
	
	@FindBy(xpath = "//h2[contains(text(),'My Account')]")
	private WebElement myAccountValidation;
	
	@FindBy(xpath = "//a[text()='Register for an affiliate account']")
	private WebElement registerForAnAffiliate;
	
	@FindBy(id = "input-company")
	private WebElement companyField;
	
	@FindBy(id = "input-website")
	private WebElement websiteField;
	
	@FindBy(id = "input-tax")
	private WebElement taxIdField;
	
	@FindBy(xpath = "//input[@value='cheque']")
	private WebElement chequeButton;
	
	@FindBy(xpath = "//input[@value='paypal']")
	private WebElement paypalButton;
	
	@FindBy(xpath = "//input[@value='bank']")
	private WebElement bankButton;
	
	@FindBy(id = "input-cheque")
	private WebElement chequePayeeName;
	
	@FindBy (xpath = "//input[@type='checkbox']")
	private WebElement aboutUsCheckBox;
	
	@FindBy (xpath = "//input[@type='submit']")
	private WebElement continueButton;
	
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement successMessageOfAffiliateAccount;
	
	@FindBy(xpath = "//a[text()='Edit your affiliate information']")
	private WebElement editYourAffiliateInformation;
	
	@FindBy(xpath = "//input[@value='bank']")
	private WebElement secondBankButton;
	
	@FindBy(id = "input-bank-name")
	private WebElement bankNameField;
	
	@FindBy(id = "input-bank-branch-number" )
	private WebElement abaNumberField;
	
	@FindBy(id = "input-bank-swift-code")
	private WebElement swiftCodeField;
	
	@FindBy(id = "input-bank-account-name")
	private WebElement accountNameField;
	
	@FindBy(id = "input-bank-account-number")
	private WebElement accountNumberField;
	
	@FindBy(xpath = "//input[@value='Continue']")
	private WebElement secondContinueButton;
	
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement editAffiliateSuccessMessage;
	
	@FindBy(xpath = "//a[text()='Edit your account information']")
	private WebElement editYourAccountInformation;
	
	@FindBy(id = "input-firstname")
	private WebElement firstNameField;
	
	@FindBy(id = "input-lastname")
	private WebElement lastNameField;
	
	@FindBy(id = "input-email")
	private WebElement editEmailField; 
	
	@FindBy(id = "input-telephone")
	private WebElement telephoneField;
	
	@FindBy(xpath = "//input[@class='btn btn-primary']")
	private WebElement thirdContinueButton;
	
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement yourAccountSuccessfullyHasBeenUpdated;
	
	public void clickOnMyAccount() {
		myAccount.click();
	}
	
	public void clickOnLoginOption() {
		loginOption.click();
	}
	
	public void enterUserNameAndPassword(String emailValue,String passwordValue) {
		emailField.sendKeys(emailValue);	
		passwordField.sendKeys(passwordValue);
	}
	
	public void clickOnLoginButton() {
		loginButton.click();	
	}
	
	public boolean isTestEnvironmentLogoPresent() {
		if(pageLogo.isDisplayed())
		return true;
		else
		return false;
	}
	
	public boolean ismyAccountValidationPresent() {
		if(myAccountValidation.isDisplayed())
			return true;
		else
			return false;
	}
	
	public void clickOnRegisterForAnAffiliate() {
		registerForAnAffiliate.click();
	
	}
	
	public void enterCompanyName(String companyNameValue) {
		companyField.sendKeys(companyNameValue);	
	}
	
	public void enterWebsiteField(String webSiteFieldValue) {
		websiteField.sendKeys(webSiteFieldValue);
		
	}
	
	public void taxIdField(String taxIDValue) {
		taxIdField.sendKeys(taxIDValue);
	}
	
	public void selectPaymentType(String paymentType) {
		if(paymentType.equalsIgnoreCase("cheque")) {
			if(!chequeButton.isSelected()) {
				chequeButton.click();
			}
			
			}else if(paymentType.equalsIgnoreCase("paypalButton")) {
					paypalButton.click();	
				 
			} else
				bankButton.click();
		}
	
	public void enterChequePayeeName(String chequePayeeNameValue) {
		chequePayeeName.sendKeys(chequePayeeNameValue);
		
	}
	
	public void clickOnAboutUsCheckBox() {
		if(!aboutUsCheckBox.isSelected()) {
			aboutUsCheckBox.click();
		}
	}
	
	public void clickOnContinueButton() {
		continueButton.click();
	}
	
	public boolean isSuccessMessageOfAffiliateAccountPresent() {
		if(successMessageOfAffiliateAccount.isDisplayed())
			return true;
		else
			return false;
	}
	
	public void clickOnEditYourAffiliateInformation() {
		editYourAffiliateInformation.click();
	}
	
	public void clickOnSecondBankButton() {
		secondBankButton.click();
	}
	
	public void enterBankName(String bankNameValue) {
		bankNameField.sendKeys(bankNameValue);
		
	}
	
	public void enterAbaNumber(String abaNumber) {
		abaNumberField.sendKeys(abaNumber);
	}
	
	public void enterSwiftCode(String swiftCodeValue) {
		swiftCodeField.sendKeys(swiftCodeValue);
	}
	
	public void enterAccountName(String accountNameValue) {
		accountNameField.sendKeys(accountNameValue);
	}
	
	public void enterAccountNumber(String accountNumberValue) {
		accountNumberField.sendKeys(accountNumberValue);
	}
	
	public void clickOnSecondContinueButton() {
		secondContinueButton.click();
	}
	
	public boolean isEditAffiliateSuccessMessagePresent() {
		if(editAffiliateSuccessMessage.isDisplayed())
			return true;
		else
			return false;
	}
	
	public void clickOnEditYourAccountInformation() {
		editYourAccountInformation.click();
	}
	
	public void enterFirstName(String firstNameValue) {
		firstNameField.clear();
		firstNameField.sendKeys(firstNameValue);
	}
	
	public void enterLastName(String lastNameValue) {
		lastNameField.clear();
		lastNameField.sendKeys(lastNameValue);
	}
	
	public void enterEditEmailField(String emailValue) {
		editEmailField.clear();
		editEmailField.sendKeys(emailValue);
	}
	
	public void enterTelephoneField(String telephoneValue) {
		telephoneField.clear();
		telephoneField.sendKeys(telephoneValue);
	}
	
	public void clickOnthirdContinueButton() {
		thirdContinueButton.click();
	}
	
	public boolean isYourAccountSuccessfullyHasBeenUpdatedPresent() {
		if(yourAccountSuccessfullyHasBeenUpdated.isDisplayed())
			return true;
		else
			return false;
	}
	
		
}
	
	
	
	


