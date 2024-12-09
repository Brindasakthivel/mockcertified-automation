package MockCertified;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

 public class ProfileTab extends AfterLogin {
	@Test
	public void profile()
	{
		System.out.println("*********************************************************************************************");
		System.out.println("PROFILE TAB");
		System.out.println("*********************************************************************************************");
	//profile Icon
	    WebElement profile=driver.findElement(By.xpath("//div[@class='d-flex flex-column align-items-center justify-content-center ms-5 mt-1 bg-primary text-white cursor_pointer circle']"));
    Actions action =new Actions(driver);
    action.moveToElement(profile).perform();
    
   // 1. Displaying profile name and email id or not
  	driver.findElement(By.xpath("(//span[@class='p-1 ms-3'])[2]")).click();
  	if(driver.findElement(By.xpath("//div[@class='mt-5 text-center']")).isDisplayed())
  	{
  	System.out.println("Balance is displaying properly");
  	}
    //2.Created tests 
  	driver.findElement(By.xpath("(//span[@class='p-1 ms-3'])[1]")).click();
  	if(driver.findElement(By.xpath("//div[@class='container bottom_margin']")).isDisplayed())
  	{
  	System.out.println("Created Tests-Approved is working");
  	}
  	//ongoing
  	if(driver.findElement(By.xpath("//div[text()=' Ongoing ']")).isSelected());
  	{
      	System.out.println("Created Tests-ongoing is working");
  	}
  	//Rejected
  	if(driver.findElement(By.xpath("//div[text()=' Rejected ']")).isSelected());
  	{
      	System.out.println("Created Tests-Rejected is working");
  	}
  	
    //3.balance
 	driver.findElement(By.xpath("(//span[@class='p-1 ms-3'])[2]")).click();
  	if(driver.findElement(By.xpath("//div[@class='mt-5 text-center']")).isDisplayed())
  	{
  	System.out.println("Balance is displaying properly");
  	}
  
    //4.MockTest RevisionList
  	driver.findElement(By.xpath("(//span[@class='p-1 ms-3'])[3]")).click();
  	if(driver.findElement(By.xpath("//div[@class='container bottom_margin']")).isDisplayed())
  	{
  	System.out.println("MockTest RevisionList is displaying properly");
  	}
	  //5.Logout
    driver.findElement(By.xpath("(//span[@class='p-1 ms-3'])[4]")).click();
    System.out.println("Logout successfully");

}}
