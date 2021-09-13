package testNg;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter_Suite_testcase {
	@Test
	@Parameters("ID")
	public void studentdetail(String StudentID) {
		System.out.println("studentID:"+ StudentID);
		
	}
	
	@Test
	@Parameters("Name")
	public void studentdetails(String StudentName) {
		System.out.println("studentName:"+ StudentName);
		
	}

}
