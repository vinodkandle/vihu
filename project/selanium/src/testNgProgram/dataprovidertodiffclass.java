package testNgProgram;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataprovidertodiffclass {
	@DataProvider
	  public Object[][] dp() {
	    return new Object[][] {
	      new Object[] { "a", "a" },
	      new Object[] { "b", "b" },
	    };
	  }
}
