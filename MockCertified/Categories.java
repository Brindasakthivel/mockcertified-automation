package MockCertified;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Categories extends BeforeLogin{
	@Test
	public void category() throws InterruptedException {
		System.out.println("*********************************************************************************************");
		System.out.println("CATEGORY1");
		System.out.println("*********************************************************************************************");
		
	//1.We got what you're looking for section.
		
	//Find the element and click on the Categories button
	driver.findElement(By.xpath("//p[text()=' Categories ']")).click();
	Thread.sleep(3000);
	//It redirects to categories page, find the element and get the text of the page title
	WebElement ele=driver.findElement(By.xpath("//h2[text()=' Categories ']"));
	String pageTitle=ele.getText();
	System.out.println("The opened page is:" +pageTitle);
	Thread.sleep(3000);
	
	//2.Category Page
	//Click on the category menu.
    driver.findElement(By.xpath("//p[text()='AWS']")).click();
	Boolean category= driver.findElement(By.xpath("//div[@class='my-5 my-5']")).isDisplayed();
	System.out.println("When I click on the AWS test, It redirects to categories>Test page :" +category);
	Thread.sleep(3000);
	//Click on the CompanyLogo to redirects to the home page
	driver.findElement(By.xpath("(//img[@class='w-100'])[1]")).click();	

}}
