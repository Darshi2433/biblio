package Account_Page;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.devskiller.jfairy.Fairy;
import com.devskiller.jfairy.producer.person.Address;
import com.devskiller.jfairy.producer.person.Person;


public class Account_Page {

	
	    public WebDriver driver;
        Fairy fairy = Fairy.create();
		
		Person person = fairy.person();
		
	    String Fname = 	person.getFirstName();
	    String Lname = person.getLastName();
	    String Email = person.getEmail();
	    String Password = person.getPassword();
	    String Postalcode = ((Address) person).getPostalCode();
	   // Company = person.getCompany();
	     
	    //Address = person.getAddress();
	    //person.getCompany();
	    //person.getAddress();
	     String City = person.getAddress().getCity();
	    
	    @FindBy(className = "login")
	     public static WebElement clickonsignin;
		
		@FindBy(id = "email_create")
		public static WebElement email_create;
		
		@FindBy(id = "SubmitCreate")
		public static WebElement createacbutton;
		
		@FindBy(id = "id_gender1")
		public static WebElement id_gender1;
		
		@FindBy(id = "id_gender2")
		public static WebElement id_gender2;
		
		@FindBy(id = "customer_firstname")
		public static WebElement customer_firstname;
		
		@FindBy(id = "customer_lastname")
		public static WebElement customer_lastname;
		
		
		@FindBy(id = "passwd")
		public static WebElement firstname;
		
		@FindBy(id = "lastname")
		public static WebElement lastname;
		
		@FindBy(id = "firstname")
		public static WebElement passwd;
		
		@FindBy(id = "company")
		public static WebElement company;
		
		@FindBy(id = "address1")
		public static WebElement address1;
		@FindBy(id = "city")
		public static WebElement city;
		@FindBy(id = "id_state")
		public static WebElement id_state;
		@FindBy(id = "postcode")
		public static WebElement postcode;
		@FindBy(id = "id_country")
		public static WebElement id_country;
		
		@FindBy(id = "phone_mobile")
		public static WebElement phone_mobile;
		
		public void openBrowser() throws IOException {
			FileInputStream fs = new FileInputStream("D:\\testing\\prop.properties");
			Properties prop = new Properties();
			prop.load(fs);
			
			String browser = prop.getProperty("browser");

			
			if(browser.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "D:\\SeleniumJars\\geckodriver.exe");
		    driver = new FirefoxDriver();
			}
		    else if(browser.equals("Chorme")){
		 System.setProperty("webdriver.chrome.driver", "D:\\SeleniumJars\\chromedriver.exe");
			driver = new ChromeDriver();
			}
			else{
			System.setProperty("webdriver.chrome.driver", "D:\\SeleniumJars\\chromedriver.exe");
			driver = new ChromeDriver();
			}
			
			PageFactory.initElements(driver, this);
			}
			
			public void openlink() {
				 driver.get("http://automationpractice.com/index.php");
		         driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			}
			
			public void closeBrowser() {
				 driver.quit();
			}

			
			public void enterEmail() throws InterruptedException {
				clickonsignin.click();
				email_create.sendKeys(Email);
				createacbutton.click();
				customer_firstname.sendKeys(Fname);
				customer_lastname.sendKeys(Lname);
				/*passwd.sendKeys(Password);
				firstname.sendKeys(Fname);
				lastname.sendKeys(Lname);
				city.sendKeys(City);
				postcode.sendKeys(Postalcode);*/
				
				Thread.sleep(3000);
				
			}
			

			
	}


