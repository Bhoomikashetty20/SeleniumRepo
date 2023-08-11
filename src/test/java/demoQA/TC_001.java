package demoQA;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class TC_001 extends BaseTest {
	
	@Test
	public void clickOnVisible() {
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		Elements_page ep=new Elements_page(driver);
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,800)");
		ep.getElements().click();
		ep.getDynamicProperties().click();
		js.executeScript("arguments[0].scrollIntoView(true)", ep.getVisibleAfter());
		ep.getVisibleAfter().click();
	}

}
