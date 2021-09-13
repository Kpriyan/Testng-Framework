package testNg;

import org.testng.annotations.Test;

public class Depenson_method {
	@Test(enabled = true)
	public void HighSchool() {
		System.out.println("Pass High School");
	}
	@Test(dependsOnMethods = "HighSchool")
	public void HigherSecSchool() {
		System.out.println("Pass Higher Sec School");
	}
	@Test(dependsOnMethods = "HigherSecSchool")
	public void College() {
		System.out.println("Pass Engineering");
	}


}
