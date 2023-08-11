package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Base_Page {

	public Base_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "Register")
	private WebElement registerLink;

	@FindBy(linkText = "Log in")
	private WebElement loginLink;

	@FindBy(xpath = "//span[text()='Shopping cart']")
	private WebElement shoppingCartLink;

	@FindBy(xpath = "//span[text()='Wishlist']")
	private WebElement wishlistLink;

	@FindBy(partialLinkText = "BOOKS")
	private WebElement booksLink;

	@FindBy(partialLinkText = "COMPUTERS")
	private WebElement computersLink;

	@FindBy(partialLinkText = "ELECTRONICS")
	private WebElement electronicsLink;

	@FindBy(partialLinkText = "APPAREL & SHOES")
	private WebElement shoesLink;

	@FindBy(partialLinkText = "DIGITAL DOWNLOADS")
	private WebElement digitalLink;

	@FindBy(partialLinkText = "JEWELRY")
	private WebElement jewelryLink;

	@FindBy(partialLinkText = "GIFT CARDS")
	private WebElement giftCards;

	public WebElement getRegisterLink() {
		return registerLink;
	}

	public WebElement getShoppingCartLink() {
		return shoppingCartLink;
	}

	public WebElement getWishlistLink() {
		return wishlistLink;
	}

	public WebElement getBooksLink() {
		return booksLink;
	}

	public WebElement getComputersLink() {
		return computersLink;
	}

	public WebElement getElectronicsLink() {
		return electronicsLink;
	}

	public WebElement getShoesLink() {
		return shoesLink;
	}

	public WebElement getDigitalLink() {
		return digitalLink;
	}

	public WebElement getJewelryLink() {
		return jewelryLink;
	}

	public WebElement getGiftCards() {
		return giftCards;
	}

	public WebElement getLoginLink() {
		return loginLink;
	}

}
