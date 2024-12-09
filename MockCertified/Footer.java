package MockCertified;

import java.time.Duration;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Footer extends BeforeLogin {
	@Test
	public void last() throws InterruptedException
	{
		System.out.println("*********************************************************************************************");
		System.out.println("FOOTER");
		System.out.println("*********************************************************************************************");
	//Footer
	//Find the element and get the text of the title
	WebElement ele11=driver.findElement(By.xpath("//img[@class='h_w_icon']"));
	String pageTitle11=ele11.getText();
	System.out.println("It is displaying the Company's logo:" +pageTitle11);
	Thread.sleep(5000);
	//categories, MockTests, Blogs
	//Find the element and click on the Categories button
	driver.findElement(By.xpath("//p[text()=' Categories ']")).click();
	Thread.sleep(3000);
	//It redirects to categories page, find the element and get the text of the page title
	WebElement ele12=driver.findElement(By.xpath("//p[text()='Categories']"));
	String pageTitle12=ele12.getText();
	System.out.println("The opened page is:" +pageTitle12);
	Thread.sleep(3000);
	//Click on the CompanyLogo to redirects to the home page
	driver.findElement(By.xpath("(//img[@class='w-100'])[1]")).click();	

	//Find the element and click on the MockTests button
	driver.findElement(By.xpath("//p[text()=' Mock Tests ']")).click();
	Thread.sleep(3000);
	//It redirects to mockTests page, find the element and get the text of the page title
	WebElement ele13=driver.findElement(By.xpath("//p[text()='Mock Tests']"));
	String pageTitle13=ele13.getText();
	System.out.println("The opened page is:" +pageTitle13);
	Thread.sleep(3000);
	//Click on the CompanyLogo to redirects to the home page
	driver.findElement(By.xpath("(//img[@class='w-100'])[1]")).click();	
	Thread.sleep(8000);

//	//Find the element and click on 'blogs'
//	driver.findElement(By.xpath("//p[text()='Blogs']")).click();
//	Thread.sleep(2000);
//	//It redirects to blogs page, find the element and get the text of the page title
//	WebElement ele14=driver.findElement(By.xpath("//h2[text()='Blogs']"));
//	String pageTitle14=ele14.getText();
//	System.out.println("The opened page is:" +pageTitle14);
//	Thread.sleep(3000);
//	//Click on the CompanyLogo to redirects to the home page
//	driver.findElement(By.xpath("(//img[@class='w-100'])[1]")).click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
	
	//Facebook
    
    WebElement js1=driver.findElement(By.xpath("(//img[@class='h_w_social'])[1]"));
 	 driver.executeScript("arguments[0].click()",js1);
      Thread.sleep(5000);
 	//windowhandling
 			Set<String> windowhandles = driver.getWindowHandles();
 			 Iterator<String> iterator = windowhandles.iterator();
 	           String parent = iterator.next();
 	  	       System.out.println("parentwindowhandle " +parent);
 	  	       Thread.sleep(2000);
 			   String child = iterator.next();
 	    		System.out.println("childwindowhandle " +child);
 				driver.switchTo().window(child);
 				String title=driver.getTitle();
 				System.out.println("The opened page is:"+title);
 				
 			
	
//	//twitter
//				WebElement js2=driver.findElement(By.xpath("(//img[@class='mx-3 h_w_social'])[1]"));
//				driver.executeScript("arguments[0].click()",js2);
//				//windowhandling
//						Set<String> windowhandles2 = driver.getWindowHandles();
//						 Iterator<String> iterator2 = windowhandles2.iterator();
//				           String parent2 = iterator2.next();
//				  	       System.out.println("parentwindowhandle " +parent2);
//						   String child2 = iterator2.next();
//				    		System.out.println("childwindowhandle " +child2);
//							driver.switchTo().window(child2);
//							String title2=driver.getTitle();
//							System.out.println("The opened page is:"+title2);
//							Thread.sleep(2000);
//									driver.close();
//				//Instagram
//							WebElement js3=driver.findElement(By.xpath("(//img[@class='h_w_social'])[2]"));
//							driver.executeScript("arguments[0].click()", js3);
//							//windowhandling
//									Set<String> windowhandles3 = driver.getWindowHandles();
//									 Iterator<String> iterator3 = windowhandles3.iterator();
//							           String parent3 = iterator3.next();
//							  	       System.out.println("parentwindowhandle " +parent3);
//									   String child3 = iterator3.next();
//							    		System.out.println("childwindowhandle " +child3);
//										driver.switchTo().window(child3);
//										String title3=driver.getTitle();
//										System.out.println("The opened page is:"+title3);
//										Thread.sleep(2000);
//											driver.close();
//							
//				                  //YouTube
//										WebElement js4=driver.findElement(By.xpath("(//img[@class='mx-3 h_w_social'])[2]"));
//										driver.executeScript("arguments[0].click()" ,js4);
//										//windowhandling
//												Set<String> windowhandles4 = driver.getWindowHandles();
//												 Iterator<String> iterator4 = windowhandles4.iterator();
//										           String parent4 = iterator4.next();
//										  	       System.out.println("parentwindowhandle " +parent4);
//												   String child4 = iterator4.next();
//										    		System.out.println("childwindowhandle " +child4);
//													driver.switchTo().window(child4);
//													String title4=driver.getTitle();
//													System.out.println("The opened page is:"+title4);
//													Thread.sleep(2000);
//														driver.close();								
//				//LinkedIn															
//													
//					WebElement js5=driver.findElement(By.xpath("(//img[@class='h_w_social'])[3]"));
//					driver.executeScript("arguments[0].click()" ,js5);
//					//windowhandling
//					Set<String> windowhandles5 = driver.getWindowHandles();
//					 Iterator<String> iterator5 = windowhandles5.iterator();
//			           String parent5 = iterator5.next();
//			  	       System.out.println("parentwindowhandle " +parent5);
//					   String child5 = iterator5.next();
//			    		System.out.println("childwindowhandle " +child5);
//						driver.switchTo().window(child5);
//						String title5=driver.getTitle();
//						System.out.println("The opened page is:"+title5);
//						Thread.sleep(2000);
//								driver.close();

	}
}
