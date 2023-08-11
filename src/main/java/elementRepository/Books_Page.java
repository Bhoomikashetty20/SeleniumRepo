package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Books_Page {

	public Books_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "products-orderby")
	private WebElement sortBy;
	
	@FindBy(id = "products-pagesize")
	private WebElement display;
	
	@FindBy(id = "products-viewmode")
	private WebElement viewAs;
	
	@FindBy(linkText  = "Computing and Internet")
	private WebElement computingAndInternet;
	
	@FindBy(linkText  = "Copy of Computing and Internet EX")
	private WebElement internetEx;
	
	@FindBy(linkText  = "Fiction")
	private WebElement fiction;
	
	@FindBy(linkText = "Fiction EX")
	private WebElement fictionEx;

	public WebElement getSortBy() {
		return sortBy;
	}

	public WebElement getDisplay() {
		return display;
	}

	public WebElement getViewAs() {
		return viewAs;
	}

	public WebElement getComputingAndInternet() {
		return computingAndInternet;
	}

	public WebElement getInternetEx() {
		return internetEx;
	}

	public WebElement getFiction() {
		return fiction;
	}

	public WebElement getFictionEx() {
		return fictionEx;
	}
}
