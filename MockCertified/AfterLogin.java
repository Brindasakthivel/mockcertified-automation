package MockCertified;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class AfterLogin {
	public ChromeDriver driver;

	@BeforeMethod
	
	public void Precondition2() throws InterruptedException {
		driver=new ChromeDriver(); 
		//To open the browser
		driver.get("https://feature-mockbuddy-list.d22h3uk4vvon62.amplifyapp.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
      //Maximize the window
        driver.manage().window().maximize();
        
		//SUCCESSFUL LOGIN TESTCASE
		//Find the XPath to locate the login element & Click on the login button
		driver.findElement(By.xpath("//button[@class='login_btn me-3']")).click();	
		Thread.sleep(2000);
		
		//Find the XPath to locate the email field & Enter the credentials in Email 
		driver.findElement(By.xpath("//input[@placeholder='name@email.com']")).sendKeys("segined289@aiworldx.com");
		
		//Find the XPath to locate the password & Enter the credentials in password
		driver.findElement(By.xpath("//input[@placeholder='Enter Your Password']")).sendKeys("Mock@12345");
		Thread.sleep(2000);

			//Find the XPath to locate the login element & Click on the login button
		driver.findElement(By.xpath("(//button[text()=' Login '])[3]")).click();	
		   //cancel the popup
  		driver.findElement(By.xpath("//button[text()='Cancel']")).click();
  		Thread.sleep(5000);
		
	}
		@AfterMethod
		public void Postcondition2()
		{
		
		driver.close();

		}}

