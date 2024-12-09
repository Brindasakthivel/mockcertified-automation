package MockCertified;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
public class Otherpages extends AfterLogin {
@Test
public void allotherpages() throws InterruptedException
{
	System.out.println("*********************************************************************************************");
	System.out.println("ALL OTHER PAGES");
	System.out.println("*********************************************************************************************");
		//New test page->check all the fields are displaying properly
		
		driver.findElement(By.xpath("(//a[@class='d-flex flex-column align-items-center justify-content-center ms-5'])[2]")).click();	
		Boolean newTest=driver.findElement(By.xpath("//h1[text()='Create new test']")).isDisplayed();
		System.out.println("New Test page is Displayed: " +newTest);
		Thread.sleep(8000);
		
		//re-attempt page
		driver.findElement(By.xpath("(//a[@class='d-flex flex-column align-items-center justify-content-center ms-5'])[3]")).click();	
		//1. Ongoing page->"No test Available" is displayed
		Boolean newTest2=driver.findElement(By.xpath("//form[@class='wrapper mt-3']")).isDisplayed();
		System.out.println("No test Available page is displayed: " +newTest2);
		Thread.sleep(5000);
		
		//2.  Attempt A Test button is clickable
		driver.findElement(By.xpath("//span[text()=' Attempt A Test ']")).click();	
		     //it redirects to the purchased Page
	Boolean newTest3=driver.findElement(By.xpath("(//div[@class='text-sm-start text-end my-3'])[1]")).isDisplayed();
		System.out.println("It redirects to the purchased page : " +newTest3);
		Thread.sleep(5000);
	    driver.navigate().back();
	   Thread.sleep(5000);
	   
		//3.Click on "completed" link
		driver.findElement(By.xpath("//div[text()=' Completed ']")).click();
		Thread.sleep(5000);
		 //it shows the completed test page
	Boolean newTest4=driver.findElement(By.xpath("(//div[@class='row'])[1]")).isDisplayed();
		System.out.println("It shows the completed test page : " +newTest4);
		Thread.sleep(5000);
		
		//4.Aborted
	    driver.findElement(By.xpath("//div[text()=' Aborted ']")).click();
		System.out.println("Aborted link is clickable");
		Thread.sleep(5000);
		
		//Purchased Page
		driver.findElement(By.xpath("(//img[@alt='purchase_icon'])[1]")).click();	
	    
    Boolean pur=driver.findElement(By.xpath("(//div[@class='text-sm-start text-end my-3'])[1]")).isDisplayed();
	    System.out.println("It's showing the purchased page : " +pur);
	    Thread.sleep(5000);
		
		
	    WebElement elem=driver.findElement(By.xpath("//select[@class='border border-primary rounded mx-1']"));
 	Select sel=new Select(elem);
 	sel.selectByValue("duration");
 	Thread.sleep(5000);
 	if(driver.findElement(By.xpath("//option[text()='Duration']")).isSelected())
 	{
 	System.out.println("sortby dropdown is working properly");
 	
 	}

}}
