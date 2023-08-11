package demoQA;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Alert_Page {

	public Alert_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//h5[text()='Alerts, Frame & Windows']")
	private WebElement alertsFrame;
	
	@FindBy(xpath = "//span[text()='Alerts']")
	private WebElement alerts;
	
	@FindBy(id = "promtButton")
	private WebElement promptButton;
	
	@FindBy(id = "promptResult")
	private WebElement promptResult;
	
	@FindBy(xpath = "//span[text()='Browser Windows']")
	private WebElement browserWindow;
	
	@FindBy(id = "windowButton")
	private WebElement windowButton;

	public WebElement getAlertsFrame() {
		return alertsFrame;
	}

	public WebElement getAlerts() {
		return alerts;
	}

	public WebElement getPromptButton() {
		return promptButton;
	}

	public WebElement getPromptResult() {
		return promptResult;
	}

	public WebElement getBrowserWindow() {
		return browserWindow;
	}

	public WebElement getWindowButton() {
		return windowButton;
	}


}
