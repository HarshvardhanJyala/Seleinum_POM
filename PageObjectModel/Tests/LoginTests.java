package Tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class LoginTests extends AbstractTest {

	@Test(description = "Verify Login", priority = 1)
	public void verifyLogin() {
		assertTrue(loginComponent.verifyLoginFunc(), "Verify Login");

	}

	/*
	 * @Test(description = " Know the size of radio buttons on the Page", priority =
	 * 2) public void knowRadioSize() {
	 * assertTrue(loginComponent.verifysizeOfRadios(), " the size of radios"); }
	 */

}
