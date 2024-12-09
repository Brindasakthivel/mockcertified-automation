package MockCertified;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class blogs extends BeforeLogin{
	
		@Test
		public void blog() throws InterruptedException {
			System.out.println("*********************************************************************************************");
			System.out.println("BLOG PAGE");
			System.out.println("*********************************************************************************************");
		    //click on blogs
			WebElement js=driver.findElement(By.xpath("//p[text()='Blogs']"));
    		driver.executeScript("arguments[0].click()",js);
    		Thread.sleep(3000);
    		//It redirects to blogs page, find the element and get the text of the page title
    		boolean ele=driver.findElement(By.xpath("//h2[@class='font-size-28 font-size-md-38 font_family_poppins_bold text-white my-2']")).isDisplayed();
    		System.out.println("The blog page is opened:" +ele);
    		Thread.sleep(3000);
    		
    		
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
    		
    		//view all button is clickable
    		WebElement view= driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
    		 driver.executeScript("arguments[0].click()",view);
    		System.out.println("view all button is clickable");

}}
