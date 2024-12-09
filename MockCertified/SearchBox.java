package MockCertified;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SearchBox extends BeforeLogin {
	@Test
	public void search() throws InterruptedException {
	
		System.out.println("*********************************************************************************************");
		System.out.println("SEARCHBOX FUNCTIONALITY");
		System.out.println("*********************************************************************************************");
	//SEARCH FUNCTIONALITY
	   //Successful search
		WebElement e=driver.findElement(By.xpath("//input[@placeholder='Search']"));
		e.sendKeys("aws");
		e.submit();
		Thread.sleep(6000); 
		WebElement elem=driver.findElement(By.xpath("//h3[@class='col-8 fw-bolder mb-0 mb-2 text-truncate font_size_22 test_card_title']"));
		String str=elem.getText();
		System.out.println("The search functionality is working-Get the title from search:" +str);
	
		
		//UnSuccessful search-Negative test case
		WebElement e1=driver.findElement(By.xpath("//input[@placeholder='Search']"));
		e1.sendKeys("xyz1234");
		e1.submit();
		Thread.sleep(5000);
		WebElement e2=driver.findElement(By.xpath("//h2[text()='No search results found']"));
		String stri=e2.getText();
		System.out.println("The search functionality is working-Negative testcase:" +stri);
		driver.findElement(By.xpath("//input[@placeholder='Search']")).clear();
		//Click on the CompanyLogo to redirects to the home page
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//img[@class='w-100'])[1]")).click();	

}}