package page.objects;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import core.Base;
public class HomePageObject extends Base {
	
	public HomePageObject() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[text()='Currency']")
	private WebElement  currencyDropdown;
	
	@FindBy(name = "EUR")
	private WebElement chooseEuro;
	
	@FindBy(xpath = "//strong[text()='€']")
	private WebElement currencyValue;
	
	@FindBy(id = "cart-total")
	private WebElement shoppingCart;
	
	@FindBy(xpath = " //p[text()='Your shopping cart is empty!']")
	private WebElement emptyCartMessage;
	
	
	public void clickOnCurrencyDropdown() {
		currencyDropdown.click();	 
	}
	
	public void clickOnEuro() {
		chooseEuro.click();	
	}
	
	public boolean isCurrencyValueChagedToEuro() {
		if(currencyValue.isDisplayed())
				return true;
			else
				return false;
			
	}
	
	public void clickOnShoppingCart() {
		shoppingCart.click();
	}
	
	public boolean isEmptyCartMessagePresent() {
		if(emptyCartMessage.isDisplayed())
			return true;
		else
			return false;
	}


}
