import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;


public class SampleTest {
	
	@BeforeSuite
	public void beforeSuiteMethod(){
		System.out.println("Executing Before Test suite");
	}
	
	@AfterSuite
	public void afterSuiteMethod(){
		System.out.println("Executing After Test Suite ");
	}

}
