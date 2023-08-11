package basics;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import AutomationBase.Base_Test;

public class ActiTime extends Base_Test {

	@Test
	public void run() throws InterruptedException {
		driver.findElement(By.id("username")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys("manager");
		Thread.sleep(2000);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
	}

}
