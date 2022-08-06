package testNgProgram;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class annotations {
	@Test
	public void f2() {
		System.out.println("in f2method");
	}
  @Test
  public void f() {
	  System.out.println("in test");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("in beforemethod");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("in aftermethod");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("in beforclass");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("in afterclass");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("in beforetest");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("in aftertest");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("in beforesuit");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("in aftersuit");
  }

}
