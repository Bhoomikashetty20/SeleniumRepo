package demoQA;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TC_006 extends BaseTest {

	@Test
	public void selectOption() throws InterruptedException {
		Widgets wid=new Widgets(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,800)");
		Thread.sleep(1000);
		wid.getWidgets().click();
		js.executeScript("arguments[0].scrollIntoView(true)", wid.getSelectMenu());
		wid.getSelectMenu().click();
		Select select=new Select(wid.getStandardMultiSelect());
		select.selectByVisibleText("Volvo");
		select.selectByVisibleText("Audi");
		List<WebElement> selectedOptions = select.getAllSelectedOptions();
		for(WebElement ele:selectedOptions) {
			System.out.println(ele.getText());
		}
	}
}
