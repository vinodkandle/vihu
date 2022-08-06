package testNgProgram;

import org.testng.annotations.Test;

public class depenceongroupDemo {
  @Test(groups= {"login","credentials"})
  public void login() {
	  System.out.println("in the login page");
  }
  
	@Test(groups = "homepage"/* ,dependsOnGroups = "login" */)
  public void homepage() {
	  System.out.println("in homepage");
  }

	@Test(groups="jobs"/* dependsOnGroups ="credentials" */ )
  public void jobs()
  {
	  System.out.println("in jobs page");
  }
}
