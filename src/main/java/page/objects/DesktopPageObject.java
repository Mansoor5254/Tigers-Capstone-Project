package page.objects;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import core.Base;
import utilities.Utils;

public class DesktopPageObject extends Base{
	
	public DesktopPageObject () {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[text()='Desktops']")
	private WebElement desktopMenue;
	
	@FindBy(xpath = "//a[text()='Show All Desktops']")
	private WebElement showAllDesktops;
	
	@FindBy(tagName = "img")
	private List<WebElement> items;
	
	@FindBy(xpath = "//a[text()='HP LP3065']")
	private WebElement hpLP3065;
	
	@FindBy(id = "input-quantity")
	private WebElement addQuantity;
	
	@FindBy(id = "button-cart")
	private WebElement addToTheCartButton;
	
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement HPLPSuccessMessage;
	
	@FindBy(xpath = "//a[text()='Canon EOS 5D Camera']")
	private WebElement clickADDTOCARTOptionOnCanonEOS5Ditem;
	
	@FindBy(id = "input-option226")
	private WebElement selectRedColorFromDropDown;
	
	@FindBy(xpath = "//a[text()='Canon EOS 5D Camera']")
	private WebElement canonEOS5DCamera;
	
	@FindBy(xpath = "//a[text()='Reviews (0)']")
	private WebElement clickOnReview;
	
	@FindBy(id = "input-name")
	private WebElement YourNameField;
	
	@FindBy(id = "input-review")
	private WebElement yourReviewField;
	
	@FindBy(xpath = "//input[@value='5']")
	private WebElement selectRating;
	
	@FindBy(id = "button-review")
	private WebElement reviewContinueButton;
	
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement reviewThankYouMessage;
	
	
//	public void clickOnDesktopMenue() {
//		desktopMenue.click();	
//	}
	
	public void clickOnDesktopMenue() {
		Utils.moveToElement(desktopMenue);
	}
	
	public void clickOnShowAllDesktops() {
		showAllDesktops.click();
	}
	
	public List<WebElement> desktopItems(){
		List<WebElement> itemsDesk = items;
		return itemsDesk ;
	}
	
	public void clickOnHpLP3065Item() {
		hpLP3065.click();
	}
	
	public void enterQuantity(String quantityValue) {
		addQuantity.clear();
		addQuantity.sendKeys(quantityValue);
		
	}
	
	public void clickOnAddToTheCartButton() {
		addToTheCartButton.click();
	}
	
	public String successMessage() {
		String actualResult = "Success: You have added " 
	+ HPLPSuccessMessage.getText()+ "to your shopping cart!";
		return actualResult;
	}
	
	public void clickOnAddToCartOptionOnCanonEOS5Ditem() {
		clickADDTOCARTOptionOnCanonEOS5Ditem.click();
	}
	
	public void selectRedColorFromDropDown() {
		selectRedColorFromDropDown.click();
		 Select select = new Select(selectRedColorFromDropDown);
		 select.selectByIndex(1);
	}
	
	public boolean isSuccessYouHaveAddedHPLP3065ToYourShoppingCartPresent() {
		if(HPLPSuccessMessage.isDisplayed())
			return true;
		else
			return false;
	}
	
	public void clickOnCanonEOS5DCamera() {
		canonEOS5DCamera.click();
	}
	
	public void clickOnReviewpart() {
		clickOnReview.click();
	}
	
	public void enteryourNameField(String nameValue) {
	YourNameField.sendKeys(nameValue);
	
	}
	
	public void enteryourReviewField(String reviewValue) {
		yourReviewField.sendKeys(reviewValue);
	}
	
	public void clickOnSelectRating() {
		selectRating.click();
	}
	
	public void clickOnReviewContinueButton() {
		reviewContinueButton.click();
	}
	
	public boolean isreviewThankYouMessagePresent(String messageValue) {
		if(reviewThankYouMessage.isDisplayed())
			return true;
		else
			return false;
	}

}
