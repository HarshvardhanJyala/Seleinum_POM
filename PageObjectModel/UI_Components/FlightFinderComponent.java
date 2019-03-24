package UI_Components;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import bds_queries.serviceCall;

public class FlightFinderComponent {
	
	
	@FindBy(xpath = ".//input[@type='radio']")
	static List<WebElement> allRadios;

	public static boolean sizeOfRadios() {
		System.out.println("No. of Radio buttons on this page are " + allRadios.size());

		return true;
	}

	public static boolean verifysizeOfRadios() {
		sizeOfRadios();

		int actualRadios = allRadios.size();
		int expectedRadios = serviceCall.getExpectedRadiosSize();
		if (actualRadios == expectedRadios) {
			return true;
		} else
			return false;
	}


}
