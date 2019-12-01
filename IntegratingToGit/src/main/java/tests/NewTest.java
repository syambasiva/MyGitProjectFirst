package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTest {

	public WebDriver driver;
	 
	 
	  
	  @BeforeMethod
	  public void beforeClass() {
	   
		
		  
		  System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "\\WDriver\\chromedriver.exe");
		   driver = new ChromeDriver();
			driver.manage().window().maximize();
	   
	  }
	 
	  
	  
	  
	  @Test
	  public void openMyBlog() {
		  driver.get("https://www.softwaretestingmaterial.com/");
	  }
	 
	}

