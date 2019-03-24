package UI_Components;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import bds_queries.serviceCall;

public class LoginComponent {

	@FindBy(name = "userName")
	static WebElement userNameEditbox1;

	@FindBy(name = "password")
	static WebElement passwordEditbox;

	@FindBy(xpath = ".//*[@name='login']")
	static WebElement loginButton;

	@FindBy(xpath = ".//*[@src='/images/spacer.gif']//following::font")
	static WebElement loginVerificationText;

	@FindBy(xpath = ".//input[@type='radio']")
	static List<WebElement> allRadios;

	/*
	 * public LoginComponent() { //initiate Page Factory
	 * PageFactory.initElements(driver, LoginComponent);
	 * 
	 * }
	 */

	public boolean login() {
		userNameEditbox1.sendKeys("batman");
		passwordEditbox.sendKeys("batman");
		loginButton.click();
		return true;
	}

	public boolean verifyLoginFunc() {

		login();
		String actualText = loginVerificationText.getText();
		String expectedText = serviceCall.getLoginVerificationText();
		if (actualText.equals(expectedText)) {
			return true;
		} else
			return false;

	}

	public boolean sizeOfRadios() {
		System.out.println("No. of Radio buttons on this page are " + allRadios.size());

		return true;
	}

	public boolean verifysizeOfRadios() {
		sizeOfRadios();

		int actualRadios = allRadios.size();
		int expectedRadios = serviceCall.getExpectedRadiosSize();
		if (actualRadios == expectedRadios) {
			return true;
		} else
			return false;
	}

	/*
	 * public boolean verifyDropdownValue() {
	 * 
	 * }
	 */

}
