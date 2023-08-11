package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Register_Page {

	public Register_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "gender-male")
	private WebElement genderMale;
	
	@FindBy(id = "gender-female")
	private WebElement genderFemale;
	
	@FindBy(id = "FirstName")
	private WebElement firstName;
	
	@FindBy(id = "LastName")
	private WebElement lastName;
	
	@FindBy(id = "Email")
	private WebElement email;
	
	@FindBy(id = "Password")
	private WebElement password;
	
	@FindBy(id = "ConfirmPassword")
	private WebElement confirmPwd;
	
	@FindBy(id = "register-button")
	private WebElement registerButton;

	public WebElement getGenderMale() {
		return genderMale;
	}

	public WebElement getGenderFemale() {
		return genderFemale;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getConfirmPwd() {
		return confirmPwd;
	}

	public WebElement getRegisterButton() {
		return registerButton;
	}

}
