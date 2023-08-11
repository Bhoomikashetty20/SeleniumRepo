package demoQA;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class TC_002 extends BaseTest {

	@Test
	public void closeChildWindow() throws InterruptedException {
		Alert_Page ap = new Alert_Page(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,800)");
		Thread.sleep(1000);
		
		ap.getAlertsFrame().click();
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,200)");
		ap.getBrowserWindow().click();
		Thread.sleep(1000);
		String parentId = driver.getWindowHandle();
		ap.getWindowButton().click();
		Thread.sleep(1000);
		Set<String> allWindowId = driver.getWindowHandles();
		allWindowId.remove(parentId);
		for(String windowId:allWindowId) {
			driver.switchTo().window(windowId);
			driver.close();
		}
	}

}
