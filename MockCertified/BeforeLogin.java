package MockCertified;

import java.time.Duration;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BeforeLogin {
	public ChromeDriver driver;

	@BeforeMethod

	public void Precondition1() throws InterruptedException {
		
			driver=new ChromeDriver(); 
			//To open the browser
			driver.get("https://feature-mockbuddy-list.d22h3uk4vvon62.amplifyapp.com/");
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
	    	//Maximize the window
			driver.manage().window().maximize();
}
@AfterMethod
public void Postcondition()
{
driver.close();

}}



