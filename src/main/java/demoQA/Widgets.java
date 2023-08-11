package demoQA;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Widgets {

	public Widgets(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//h5[text()='Widgets']")
	private WebElement widgets;
	
	@FindBy(xpath = "//span[text()='Date Picker']")
	private WebElement datePicker;
	
	@FindBy(id = "datePickerMonthYearInput")
	private WebElement calendar;
	
	@FindBy(xpath = "//span[text()='Select Menu']")
	private WebElement selectMenu;
	
	@FindBy(xpath = "//div[text()='Select...']")
	private WebElement multiSelectDropDown;
	
	@FindBy(id = "cars")
	private WebElement standardMultiSelect;
	
	@FindBy(xpath = "//button[text()='Next Month']")
	private WebElement nextMonth;

	public WebElement getNextMonth() {
		return nextMonth;
	}

	public WebElement getWidgets() {
		return widgets;
	}

	public WebElement getDatePicker() {
		return datePicker;
	}

	public WebElement getCalendar() {
		return calendar;
	}

	public WebElement getSelectMenu() {
		return selectMenu;
	}

	public WebElement getMultiSelectDropDown() {
		return multiSelectDropDown;
	}

	public WebElement getStandardMultiSelect() {
		return standardMultiSelect;
	}
	
	

}
