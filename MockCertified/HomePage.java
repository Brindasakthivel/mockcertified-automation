package MockCertified;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class HomePage extends BeforeLogin{
	@Test
	public void home() throws InterruptedException {
		
		//HOMEPAGE TESTCASES
		
		System.out.println("*********************************************************************************************");
		System.out.println("HOMEPAGE1");
		System.out.println("*********************************************************************************************");
		//1. Top navigation bar:(Verify whether the below items are displaying or not)
//	      Mockcertified logo
		Boolean LogoDisplay=driver.findElement(By.xpath("(//img[@class='w-100'])[1]")).isDisplayed();
		System.out.println("The Logo is Displayed:" +LogoDisplay);

//			Search text box
		Boolean txtbox=driver.findElement(By.xpath("//input[@placeholder='Search']")).isDisplayed();
		System.out.println("The Search textbox is Displayed:" +txtbox);

//			Categories menu
		Boolean category= driver.findElement(By.xpath("//p[text()=' Categories ']")).isDisplayed();
		System.out.println("The category button is Displayed:" +category);

//			Mock Tests menu
		Boolean mocktest=driver.findElement(By.xpath("//p[text()=' Mock Tests ']")).isDisplayed();
		System.out.println("The MockTest button button is Displayed:" +mocktest);
		
//			Login button
		Boolean login=	driver.findElement(By.xpath("//button[@class='login_btn me-3']")).isDisplayed();
		System.out.println("The login button is Displayed:" +login);
		
//			Sign up button
		Boolean signup=	driver.findElement(By.xpath("(//button[text()=' Sign up '])[2]")).isDisplayed();
		System.out.println("The signup button is Displayed:" +signup);
		
		//2.Banner image:

		//Find the element and click on the Explore now button
		driver.findElement(By.xpath("//button[text()=' Explore Now ']")).click();
		Thread.sleep(3000);
		//It displays the login pop up
		driver.findElement(By.xpath("(//button[@class='btn-close'])[1]")).click();
		Thread.sleep(8000);
		
		//Find the element and click on the learn More button
		WebElement javascript=driver.findElement(By.xpath("//button[@class='login_btn mt-3 mt-md-5']"));
	    driver.executeScript("arguments[0].click()",javascript);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));

		//It redirects to mockTests page, find the element and get the text of the page title
		WebElement ele3=driver.findElement(By.xpath("//h2[text()=' Mock Tests ']"));
		String pageTitle3=ele3.getText();
		System.out.println("When I Click on the 'Learn More' button, The opened page is:" +pageTitle3);
		Thread.sleep(3000);
		//Click on the CompanyLogo to redirects to the home page
		driver.findElement(By.xpath("(//img[@class='w-100'])[1]")).click();	
		Thread.sleep(5000);
		   
		//3.View We got what you're looking for section.
	    
		   //Find the element and click on the explore link
		WebElement js=driver.findElement(By.xpath("(//p[text()=' Explore '])[1]"));
		driver.executeScript("arguments[0].click()",js);
		Thread.sleep(3000);
		//It redirects to categories>Test and get the text of the page title
		WebElement ele4=driver.findElement(By.xpath("(//a[text()='AWS'])[1]"));
		String pageTitle4=ele4.getText();
		System.out.println("When I click on the AWS test explore link, The opened categories>Test page is:" +pageTitle4);
		Thread.sleep(3000);
		//Click on the CompanyLogo to redirects to the home page
		driver.findElement(By.xpath("(//img[@class='w-100'])[1]")).click();	
		 
		
		//4.View Experience Tests Like Never Before section:


		//Find the element and click on the JOIN FOR FREE button
		WebElement js2=driver.findElement(By.xpath("(//button[text()=' JOIN FOR FREE '])[1]"));
		driver.executeScript("arguments[0].click()",js2);
		Thread.sleep(2000);
		//It displays the signup popup
		driver.findElement(By.xpath("(//button[@class='btn-close'])[2]")).click();
		Thread.sleep(3000);
		
		//5.View Our Top-Selling Tests section:

		
		//Find the element and click on the Our Top-Selling Tests explore link
		WebElement js3=driver.findElement(By.xpath("(//p[text()=' Explore '])[5]"));
		driver.executeScript("arguments[0].click()",js3);
		Thread.sleep(2000);
		//It redirects to mockTests page, find the element and get the text of the page title
		String ele5=driver.findElement(By.xpath("//h2[text()=' Mock Tests ']")).getText();
		System.out.println("When I Click on the 'Explore' Link, The opened page is:" +ele5);
		Thread.sleep(3000);
		//Click on the CompanyLogo to redirects to the home page
		driver.findElement(By.xpath("(//img[@class='w-100'])[1]")).click();	

		//6.View the Go Easy on Your Wallet section:

		//Check that the section of 'Go Easy on your wallet' is displaying or not.
		WebElement ele7=driver.findElement(By.xpath("//div[@class='my-5 my-5']"));
		Boolean pageTitle7=ele7.isDisplayed();
		System.out.println("The 'Go Easy on your wallet'section is displayed:" +pageTitle7);
		
		//7.View the Why Us? section:

		//Check that the title of 'Why US' is displaying or not.
		WebElement ele8=driver.findElement(By.xpath("(//div[@class='container py-5'])[1]"));
		Boolean pageTitle8=ele8.isDisplayed();
		System.out.println("The 'Why US' section is displayed:" +pageTitle8);

	    //8.View the Our Blogs section:

		//Find the element and click on 'explore'link and redirects to the blogs page
		WebElement js4=driver.findElement(By.xpath("(//p[text()=' Read More '])[1]"));
		driver.executeScript("arguments[0].click()",js4);
		Thread.sleep(3000);
		//It redirects to blogs page, find the element and get the text of the page title
		WebElement ele9=driver.findElement(By.xpath("//h2[text()='Blog']"));
		String pageTitle9=ele9.getText();
		System.out.println("After clicking on 'explore'link, the opened page is:" +pageTitle9);
		Thread.sleep(3000);
		//Click on the CompanyLogo to redirects to the home page
		driver.findElement(By.xpath("(//img[@class='w-100'])[1]")).click();	
		
		//Find the element and click on 'view More'link and redirects to the blogs page
		WebElement js5=driver.findElement(By.xpath("//p[text()=' View More ']"));
		driver.executeScript("arguments[0].click()",js5);
		Thread.sleep(3000);
		//It redirects to blogs page, find the element and get the text of the page title
		WebElement ele10=driver.findElement(By.xpath("//h2[text()='Blogs']"));
		String pageTitle10=ele10.getText();
		System.out.println("After clicking on 'view more'link, the opened page is:" +pageTitle10);
		Thread.sleep(3000);
		//Click on the CompanyLogo to redirects to the home page
		driver.findElement(By.xpath("(//img[@class='w-100'])[1]")).click();	
		
		
		//9.Need a helping hand? section
		WebElement js6=driver.findElement(By.xpath("//button[text()='Connect with us']"));
		driver.executeScript("arguments[0].click()",js6);
		Thread.sleep(2000);
		//enter the full name
		driver.findElement(By.id("secondName")).sendKeys("Tester");
		//Enter the email
		driver.findElement(By.id("email")).sendKeys("b@g.in");
		//Enter the contact number
		driver.findElement(By.id("mobilePhone")).sendKeys("1234567890");
		//Enter the message
		driver.findElement(By.id("messageBox")).sendKeys("The message is Sent.Testing Purpose@!#$%123456");
		//Click on submit button
		WebElement submit=driver.findElement(By.xpath("//button[text()='Submit']"));
		if(submit.isSelected())
		{
			System.out.println("connect with us form is working");
		}else
		{
			System.out.println("connect with us form is not working");
		}
	    Thread.sleep(3000);
		//Click on the CompanyLogo to redirects to the home page
		driver.findElement(By.xpath("(//img[@class='w-100'])[1]")).click();	
	    Thread.sleep(5000);

//		Click on the email
//		driver.findElement(By.xpath("(//a[text()='mockcertified@gmail.com'])[1]")).click();	
		
		//10.'What our students are saying' Section
		//Verify whether the Right and left arrows are working fine or not.
		WebElement javas=driver.findElement(By.xpath("//img[@alt='preview_icon']"));
		driver.executeScript("arguments[0].click()",javas);
		System.out.println("The right arrow is clickable");
	    Thread.sleep(3000);

		WebElement javas2=driver.findElement(By.xpath("//img[@alt='next_icon']"));
		driver.executeScript("arguments[0].click()",javas2);
		System.out.println("The left arrow is clickable" );
	    Thread.sleep(3000);

		//11.View the footer section :
		
		Boolean footer=driver.findElement(By.xpath("//img[@alt='preview_icon']")).isDisplayed();
		System.out.println("The Footer section is displayed:" +footer);

	  
		}

		
	

	

}
