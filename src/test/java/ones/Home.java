package ones;

import org.testng.annotations.Test;

public class Home extends Example {

	@Test
	public void testName() throws Exception {
//		System.out.println("Hllo");
		googleHomePage.performAction();
	}
	
}
