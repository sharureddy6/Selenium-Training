import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class FirstSeleniumTest {
	
	@Test
	public void OpenSiteInChrome() {
		
		
		// Set the path to the chrome executable 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shara\\eclipse-workspace\\SeleniumDemoProject\\Drivers\\chromedriver.exe" )
	
		// create a new instance of the chrome driver 
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
	}

}
