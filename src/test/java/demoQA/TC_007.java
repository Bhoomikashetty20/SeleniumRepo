package demoQA;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TC_007 extends BaseTest{
	
	@Test
	public void dragDrop() throws InterruptedException {
		Interaction_Page ip=new Interaction_Page(driver);
		Actions action=new Actions(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,800)");
		Thread.sleep(1000);
		ip.getInteractions().click();
		js.executeScript("arguments[0].scrollIntoView(true)", ip.getDroppablebutton());
		ip.getDroppablebutton().click();
		action.dragAndDrop(ip.getDraggable(), ip.getDroppable()).perform();
	}

}
