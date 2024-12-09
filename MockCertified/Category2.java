package MockCertified;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


public class Category2 extends AfterLogin{
	@Test
	public void category() throws InterruptedException {
		System.out.println("*********************************************************************************************");
		System.out.println("CATEGORY2");
		System.out.println("*********************************************************************************************");
   
   //mouse hover on category
   WebElement element= driver.findElement(By.xpath("//span[text()=' Category ']"));
	 Actions action = new Actions(driver);
   action.moveToElement(element).perform();
   Thread.sleep(5000);
	
      //Get all the category option

	   String text = driver.findElement(By.xpath("//ul[@class='position-absolute border border-rounded list-group my-2 px-4 py-2 category_dropdown']")).getText();
	   System.out.println("When I click on the category, it is displaying all the category options:" +text);
	   Thread.sleep(5000);
		
  	   
  		//click anyone of the option, it leads to particular category page
		    driver.findElement(By.xpath("(//a[text()='AWS'])[1]")).click();
		    String cat=driver.findElement(By.xpath("(//a[text()='AWS'])[2]")).getText();
		    System.out.println("selected category is displayed:"+cat);
		    Thread.sleep(5000);
		    
  			//click anyone of the option, it leads to subcategory page
  			driver.findElement(By.xpath("(//div[@class='row align-items-center m-2 p-2 shawdow_category category_border_radius hover_effect'])[1]")).click();
  			String sub=driver.findElement(By.xpath("(//p[@class='mt-2 font_size_24'])[1]")).getText();
  			System.out.println("selected subcategory is displayed:"+sub);
  			
  			//click anyone of the test
  			driver.findElement(By.xpath("(//div[@class='shawdow_card position-relative bg-white px-3 py-1 test_card_border_radius card_height text-start'])[1]")).click();
            //check that the details of the test is displaying or not
  			boolean detail=driver.findElement(By.xpath("//div[@class='shawdow_card position-relative p-2 px-3 test_card_border_radius']")).isDisplayed();
            System.out.println("The details of the test is displaying: " +detail);
		
	}


}
