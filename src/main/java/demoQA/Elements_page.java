package demoQA;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Elements_page {
	
	public Elements_page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//h5[text()='Elements']")
	private WebElement elements;
	
	@FindBy(xpath = "//span[text()='Dynamic Properties']")
	private WebElement dynamicProperties;
	
	@FindBy(id = "visibleAfter")
	private WebElement visibleAfter;
	
	@FindBy(id = "enableAfter")
	private WebElement enableAfter;

	public WebElement getElements() {
		return elements;
	}

	public WebElement getDynamicProperties() {
		return dynamicProperties;
	}

	public WebElement getVisibleAfter() {
		return visibleAfter;
	}

	public WebElement getEnableAfter() {
		return enableAfter;
	}

}
