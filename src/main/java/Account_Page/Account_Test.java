package Account_Page;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.devskiller.jfairy.Fairy;
import com.devskiller.jfairy.producer.company.Company;
import com.devskiller.jfairy.producer.person.Person;

import Random_Data.Random_data_generator;

public class Account_Test {
	WebDriver driver;
	
	  Account_Page lp = new Account_Page();
	  Random_data_generator rd = new Random_data_generator();

	  @BeforeMethod
	  public void beforeMethod() throws IOException {
		      lp.openBrowser();
	          lp.openlink();
	  }

	   @AfterMethod
	  public void afterMethod() {
		// lp.closeBrowser();
	  }
	   
	   @Test
	     public void loginwithemail() throws InterruptedException {
		
		  lp.enterEmail();
		   
	   }
	   
}
