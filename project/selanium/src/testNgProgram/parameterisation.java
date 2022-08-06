package testNgProgram;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameterisation {
  @Test
  @Parameters({"val1","val2"})
  public void add(int a,int b) {
	  int sum = a + b;
	  System.out.println("sum is" + sum);
	  }
  
 @Test
 @Parameters({"val1","val2"})
public void diff(int c ,int d)
{
	 int dif = c -d;
	 System.out.println("diff is" + dif);
 }
 }
