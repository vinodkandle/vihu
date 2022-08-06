package testNgProgram;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;
import org.testng.annotations.Test;

public class annotationTranformerlistner implements IAnnotationTransformer
{

	@Override
	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
	annotation.setRetryAnalyzer(RetryAnalyzer.class);
	}
  //this class is used in ItestListenerWithExample
	//this listner retry the failed method number of time as you given in retryanalyaser class
}
