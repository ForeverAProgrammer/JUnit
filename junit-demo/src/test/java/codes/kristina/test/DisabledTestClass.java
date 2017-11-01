package codes.kristina.test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/*
* Disabled Test Method
* This Demos disabling a test using the JUnit @Disabled annotation 
*/

@Disabled
/* None of the test cases in this class will run because of the @Disabled annotation */
class DisabledTestClass {

	@Test
	void FailTest() {
		fail("Not yet implemented");
	}
	
	@Test
	void PassTest() {
		assertEquals(4,2+2);
	}

}
