package example;		

import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;		
import org.testng.Assert;		
import org.testng.annotations.Test;	
import org.testng.annotations.BeforeTest;	
import org.testng.annotations.AfterTest;		
public class NewTest {		
	
	    private WebDriver driver;		
	    
		@Test				
		public void testEasy() {	
			String url = System.getProperty("url");
				
			driver.get(url); 
			
			System.out.println("--------------------"+url);
			String title = driver.getTitle();				 
			Assert.assertTrue(title.contains("Google")); 		
		}	
		@BeforeTest
		public void beforeTest() {	
			System.setProperty("webdriver.chrome.driver", "D:\\Selenium-java tools\\Chrome driver\\chromedriver.exe");
		    driver = new ChromeDriver();  
		}		
		@AfterTest
		public void afterTest() {
			driver.quit();			
		}		
}	