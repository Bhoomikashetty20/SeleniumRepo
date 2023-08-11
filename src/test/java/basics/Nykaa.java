package basics;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Nykaa {
	
	@Test
	public void nykaa() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Actions action=new Actions(driver);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		driver.get("https://www.nykaa.com/");
		Thread.sleep(1000);
		String parentId = driver.getWindowHandle();
		action.moveToElement(driver.findElement(By.linkText("Health & Wellness"))).perform();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Weighing Scales")).click();
		Thread.sleep(1000);
		Set<String> allWindowId = driver.getWindowHandles();
		allWindowId.remove(parentId);
		for(String wid: allWindowId) {
			driver.switchTo().window(wid);
		}
		driver.findElement(By.xpath("//span[text()='Brand']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='iGRiD']/../..//div[@class='control-indicator checkbox ']")).click();
		Thread.sleep(3000);
		WebElement addToBag = driver.findElement(By.xpath("//div[contains(text(),'iGRiD Digital Bluetooth Body')]/../../../..//span[text()='Add to Bag']"));
		js.executeAsyncScript("arguments[0].click()", addToBag);
		driver.findElement(By.xpath("//button[@class='css-aesrxy']")).click();
	}

}
