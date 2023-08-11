package demoQA;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class TC_003 extends BaseTest{
	
	@Test
	public void promptPopUp() throws InterruptedException {
		Alert_Page ap=new Alert_Page(driver);
		WebDriverWait wait=new WebDriverWait(driver, 10);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,800)");
		Thread.sleep(1000);
		ap.getAlertsFrame().click();
		
		ap.getAlerts().click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOf(ap.getPromptButton()));
		js.executeScript("arguments[0].scrollIntoView(true)", ap.getPromptButton());
		ap.getPromptButton().click();
		driver.switchTo().alert().sendKeys("hlo");
		driver.switchTo().alert().accept();
		System.out.println(ap.getPromptResult().getText());
	}

}
