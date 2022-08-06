package testNgProgram;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class RetryAnalyzer implements IRetryAnalyzer {
	int count =0;
	int retry = 4;
	@Override
	public boolean retry(ITestResult result) {
		
		if(count<retry)
		{
			count++;
			return true;
		}
		return false;
	}
  
}//this listner called when one method fail we know but still want to just try for 4 time then use this retryanaliser class 
//this class called in ItestListenerWithExample class see there
//this is the explicite way we want to define globaly then we have to define iannotationTransformer
