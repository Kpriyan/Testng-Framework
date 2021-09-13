package testNg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Annotations_method {
  @Test
  public void test() {
	  
	  System.out.println("im test");
  }
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.out.println("im before method");
  }

  @AfterMethod
  public void afterMethod() {
	  
	  System.out.println("im Afer method");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("im before class");
	  
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("im After class");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("im Before test");
	  
  }

  @AfterTest
  public void afterTest() {
	  
	  System.out.println("im After test");
  }

  @BeforeSuite
  public void beforeSuite() {
	  
	  System.out.println("im Before suite");
  }

  @AfterSuite
  public void afterSuite() {
	  
	  System.out.println("im After suite");
  }

}
