package demoQA;

import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class TC_004 extends BaseTest {

	@Test
	public void calendar() throws InterruptedException {
		LocalDateTime date = LocalDateTime.now().plusMonths(2).plusDays(1);
		String month = date.getMonth().toString(); // NOVEMBER
		month = month.charAt(0) + month.substring(1).toLowerCase();
		int year = date.getYear();
		int day = date.getDayOfMonth();
		System.out.println(month + "   " + year + "   " + day);
		
		LocalDateTime dateminus = LocalDateTime.now().plusMonths(2).plusDays(1);
		String monthminus = dateminus.getMonth().toString(); // NOVEMBER
		monthminus = monthminus.charAt(0) + monthminus.substring(1).toLowerCase();
		int yearminus = dateminus.getYear();
		int dayminus = dateminus.getDayOfMonth();
		System.out.println(monthminus + "   " + yearminus + "   " + dayminus);

		Widgets wid = new Widgets(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,800)");
		Thread.sleep(1000);
		wid.getWidgets().click();
		js.executeScript("arguments[0].scrollIntoView(true)", wid.getDatePicker());
		wid.getDatePicker().click();
		Thread.sleep(1000);
		wid.getCalendar().click();
		for (;;) {
			try {
				if(LocalDateTime.now().getYear()>=year ) {
					driver.findElement(
							By.xpath("//div[text()='" + month + " " + year + "']/../..//div[text()='" + day + "']"))
							.click();
					break;
					
				}
				
			} catch (Exception e) {
				wid.getNextMonth().click();
			}
		}
	}

}
