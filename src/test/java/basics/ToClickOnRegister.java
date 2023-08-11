package basics;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import elementRepository.Base_Page;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ToClickOnRegister {
	
	@Test
	public void demo() {
		WebDriver driver = WebDriverManager.chromedriver().create();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		Base_Page basepage=new Base_Page(driver);
		basepage.getRegisterLink().click();
	}

}
