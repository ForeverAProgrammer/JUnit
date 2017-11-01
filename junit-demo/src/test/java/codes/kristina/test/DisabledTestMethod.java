package codes.kristina.test;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class DisabledTestMethod {

	/*
	* Disabled Test Method
	* This Demos disabling a test method using the JUnit @Disabled annotation 
	*/
	
	@Disabled
	@Test
	/* This test method will not run. Normally this test will cause the build to fail */
	void DisabledTestMethodTest() {
		fail("Fail Build");
	}

}
