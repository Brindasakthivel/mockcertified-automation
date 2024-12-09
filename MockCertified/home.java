package MockCertified;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class home extends AfterLogin{
	@Test
	public void homepage() throws InterruptedException{
//		ChromeDriver driver=new ChromeDriver(); 
//		driver.manage().window().maximize();
//		//To open the browser
//		driver.get("https://feature-mockbuddy-list.d22h3uk4vvon62.amplifyapp.com/");
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
//		driver.findElement(By.xpath("//button[@class='login_btn me-3']")).click();	
//		Thread.sleep(2000);
//		
//		//Find the XPath to locate the email field & Enter the credentials in Email 
//		driver.findElement(By.xpath("//input[@placeholder='name@email.com']")).sendKeys("segined289@aiworldx.com");
//		
//		//Find the XPath to locate the password & Enter the credentials in password
//		driver.findElement(By.xpath("//input[@placeholder='Enter Your Password']")).sendKeys("Mock@12345");
//		Thread.sleep(2000);
//
//			//Find the XPath to locate the login element & Click on the login button
//		driver.findElement(By.xpath("(//button[text()=' Login '])[3]")).click();
//		Thread.sleep(3000);
		System.out.println("*********************************************************************************************");
		System.out.println("HOMEPAGE2");
		System.out.println("*********************************************************************************************");
		
	       //Mockcertified logo
	    	Boolean LogoDisplay= driver.findElement(By.xpath("(//img[@class='w-100'])[1]")).isDisplayed();
	    	System.out.println("The Logo is Displayed:" +LogoDisplay);
	    	//featured Tests are displaying or not.
	    	Boolean feature= driver.findElement(By.xpath("//div[@class='mt-5']")).isDisplayed();
	    	System.out.println("Featured tests are displaying: "+feature);
	    	Thread.sleep(3000);
//	    	 //cancel the popup
//	    	driver.findElement(By.xpath("//button[text()='Cancel']")).click();
//	    	Thread.sleep(5000);
	    	
	    	
	    	//click anyone of the tests
	    	WebElement javas=driver.findElement(By.xpath("(//div[@class='shawdow_card position-relative bg-white px-3 py-1 test_card_border_radius card_height text-start'])[3]"));
	    	 driver.executeScript("arguments[0].click()",javas);
	         Thread.sleep(5000);
	    	//Test details are displaying or not
	    	Boolean tD= driver.findElement(By.xpath("//div[@class='test_detail_width']")).isDisplayed();
	    	System.out.println("The Test details are Displayed:" +tD);
	    	Thread.sleep(3000);
	    	
	    	driver.navigate().back();
	    	
	    	//recently added are displaying or not
	    		Boolean RA= driver.findElement(By.xpath("//h2[text()=' Recently Added ']")).isDisplayed();
	    		System.out.println("The Recently Added Tests are Displayed:" +RA);
	    		Thread.sleep(5000);
		
	

}
}