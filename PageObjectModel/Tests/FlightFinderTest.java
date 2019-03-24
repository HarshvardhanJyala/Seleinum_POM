package Tests;

import static org.testng.Assert.assertTrue;
import org.testng.annotations.Test;

import UI_Components.FlightFinderComponent;

public class FlightFinderTest extends AbstractTest {
	
		@Test(description = " Know the size of radio buttons on the Page", priority = 2)
		public void knowRadioSize() {
			assertTrue(FlightFinderComponent.verifysizeOfRadios(), " Verify the size of radios");
		}

	

}
