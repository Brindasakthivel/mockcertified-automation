package MockCertified;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class MockTest extends BeforeLogin{
	@Test
	public void Mock() throws InterruptedException {
		System.out.println("*********************************************************************************************");
		System.out.println("MOCKTEST PAGE");
		System.out.println("*********************************************************************************************");
	//1.MockTest Page
		
		//Find the element and click on the blogs 
		//Find the element and click on the MockTests button
			driver.findElement(By.xpath("//p[text()=' Mock Tests ']")).click();
			Thread.sleep(3000);
			//It redirects to mockTests page, find the element and get the text of the page title
			WebElement ele2=driver.findElement(By.xpath("//h2[text()=' Mock Tests ']"));
			String pageTitle2=ele2.getText();
			System.out.println("The opened page is:" +pageTitle2);
			Thread.sleep(3000);
			
			// Go to Mock Test Programs To Get You Started section.
			//Find the element and verify if it is there are not.
		  Boolean MC=driver.findElement(By.xpath("(//div[@class='container'])[2]")).isDisplayed();
		  System.out.println("'Mock Test Programs To Get You Started'section is displaying: "+MC);
		  Thread.sleep(3000);

    
    //2.Featured Tests
    
		  //View Featured Tests section.
		  Boolean feature=driver.findElement(By.xpath("//div[@class='row align-items-center']")).isDisplayed();
		  System.out.println("feature Test is displaying: " +feature);
		  Thread.sleep(5000);
		  //Click on next OR previous button.
		  WebElement nxt=driver.findElement(By.xpath("//img[@alt='preview_icon']"));//Left Arrow
		  driver.executeScript("arguments[0].click()",nxt);
		  System.out.println("The Left Arrow is clickable");
		  Thread.sleep(3000);
		  WebElement pre=driver.findElement(By.xpath("//img[@alt='next_icon']"));//Right Arrow
		  driver.executeScript("arguments[0].click()",pre);
		  System.out.println("The Right Arrow is clickable");
		  Thread.sleep(5000);	
		  
		  
    
    
		//3.Click on Explore on the required test card.
		  WebElement explore=driver.findElement(By.xpath("(//p[text()=' Explore '])[5]"));
		  driver.executeScript("arguments[0].click()", explore);
		  Thread.sleep(5000);	

		  //Verify it is redirects to the selected tests.
		  String testname=driver.findElement(By.xpath("(//h2[text()='New publish test'])[1]")).getText();
		  System.out.println("After clicking the explore link,the redirected particular test is:"+testname);
		  Thread.sleep(2000);
		  //When i click on 'start test', it opens the the signup popup
		  driver.findElement(By.xpath("//button[text()=' Start Test ']")).click();
		  Thread.sleep(2000);
		  //close the popup
		  driver.findElement(By.xpath("(//button[@class='btn-close'])[2]")).click();
		  Thread.sleep(5000);
		  

		  //4.Pagination
		    WebElement page1=driver.findElement(By.xpath("(//button[@class='nav_btn px-3'])[1]"));
		    driver.executeScript("arguments[0].click()", page1);//Left Arrow
		  	 System.out.println("The Left Arrow is clickable");
		  	 Thread.sleep(2000);
		     WebElement page2=driver.findElement(By.xpath("(//button[@class='nav_btn px-3'])[2]"));
		     driver.executeScript("arguments[0].click()", page2);//Right Arrow
		     System.out.println("The Right Arrow is clickable");
		     Thread.sleep(5000);
		//   //FAQ
//				WebElement faq1=driver.findElement(By.xpath("(//span[@class='arrow'])[1]"));
//				driver.executeScript("arguments[0].click()",faq1);
//				Thread.sleep(3000);	
//				Boolean faq2=driver.findElement(By.xpath("(//p[@class='font-size-12 font-size-lg-14'])[1]")).isDisplayed();
//				System.out.println("FAQ is expandable:" +faq2);
		//	

			//Returning Users, First time Users
			WebElement log=driver.findElement(By.xpath("//span[text()=' Log in']"));
			driver.executeScript("arguments[0].click()",log);
			Thread.sleep(3000);	
		  driver.findElement(By.xpath("(//button[@class='btn-close'])[1]")).click();
			Thread.sleep(3000);	
			WebElement sign=driver.findElement(By.xpath("//span[text()='Create an account ']"));
			driver.executeScript("arguments[0].click()",sign);
			Thread.sleep(3000);	
		  driver.findElement(By.xpath("(//button[@class='btn-close'])[2]")).click();
			Thread.sleep(3000);	

}}      	

  

	