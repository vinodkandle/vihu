package testNgProgram;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class makeparameteroptional {
  @Test
  @Parameters({"val1","val2"})
  public void add(@Optional("10") int a,@Optional("20") int b) {
	  int sum = a + b;
	  System.out.println(sum);
  }
}
