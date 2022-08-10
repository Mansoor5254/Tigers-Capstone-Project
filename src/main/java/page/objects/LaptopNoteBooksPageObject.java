package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class LaptopNoteBooksPageObject extends Base {
	
	public LaptopNoteBooksPageObject() {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath = "//a[text()='Laptops & Notebooks']")
	private WebElement laptopsAndNoteBooks;
	
	@FindBy(xpath = "//a[text()='Show All Laptops & Notebooks']")
	private WebElement showAllLaptopsAndNoteBooks;
	
	@FindBy(xpath = "(//img[@class='img-responsive'])[3]")
	private WebElement macBookItem;
	 
	@FindBy(id = "cart-total")
	private WebElement buyingCartMessage;
	
	@FindBy(xpath = "//i[@class='fa fa-times']")
	private WebElement redXButton;
	
	@FindBy(xpath = "(//i[@class='fa fa-shopping-cart'])[2]")
	private WebElement cartShowZeroItem;
	
	@FindBy(xpath = "(//i[@class='fa fa-exchange'])[2]")
	private WebElement mackBookComparisonButton;
	
	@FindBy(xpath = "(//i[@class='fa fa-exchange'])[3]")
	private WebElement macBookAirComparisonButton;
	
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement comparisonSuccessMessage;
	
	@FindBy(id = "compare-total")
	private WebElement compareLink;
	
	@FindBy(id = "content")
	private WebElement productContent;
	
	@FindBy(xpath = "(//i[@class='fa fa-heart'])[6]")
	private WebElement heartIconToAddSonyVaio;
	
	@FindBy(xpath = " //a[text()='MacBook Pro']")
	private WebElement macBookProItem;
	
	@FindBy(xpath = "//h2[text()='$2,000.00']")
	private WebElement priceTag;
	
	
	
	public void clickOnLaptopsAndNoteBooks() {
		laptopsAndNoteBooks.click();
	}
	
	public void clickOnShowAllLaptopsAndNoteBooks() {
		showAllLaptopsAndNoteBooks.click();
	}
	
	public void clickOnMacBookItem() {
		macBookItem.click();
	}
	
	public boolean iscartTotalMessagePresent(String string,String string2){
		if(buyingCartMessage.isDisplayed())
			return true;
		else 
			return false;
	}
	
	public void clickOnCartOption() {
		buyingCartMessage.click();
	}
	
	public void clickOnRedXButton() {
		redXButton.click();
	}
	
	public boolean isCartShowZeroItemPresent(String string){
		if(cartShowZeroItem.isDisplayed())
			return true;
		else
			return false;
		
	}
	
	public void clickMackBookComparisonButton() {
		mackBookComparisonButton.click();
		
	}
	
	public void clickMacBookAirComparisonButton() {
		macBookAirComparisonButton.click();
	}
	
	public boolean isComparisonSuccessMessagePresent(String string) {
	if(comparisonSuccessMessage.isDisplayed())
		return true;
	else
		return false;	
	}
	
	public void clickCompareLink() {
		compareLink.click();
	}
	
	public boolean iscomparisonContentPresent() {
		if(productContent.isDisplayed())
			return true;
		else
			return false;
	}
	
	public void clickOnHeartIconToAddSonyVaioInWishList() {
		heartIconToAddSonyVaio.click();
		
	}
	
	public void clickOnMacBookProItem() {
		macBookProItem.click();
	}
	
	public boolean isPriceTagPresent() {
		if(priceTag.isDisplayed())
			return true;
		else
			return false;
	}
	
	
	

}
