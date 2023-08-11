package demoQA;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Interaction_Page {
	
	public Interaction_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//h5[text()='Interactions']")
	private WebElement interactions;
	
	@FindBy(xpath = "//span[text()='Droppable']")
	private WebElement droppablebutton;
	
	public WebElement getInteractions() {
		return interactions;
	}

	public WebElement getDroppablebutton() {
		return droppablebutton;
	}

	public WebElement getDraggable() {
		return draggable;
	}

	public WebElement getDroppable() {
		return droppable;
	}

	@FindBy(id = "draggable")
	private WebElement draggable;
	
	@FindBy(id = "droppable")
	private WebElement droppable;

}
