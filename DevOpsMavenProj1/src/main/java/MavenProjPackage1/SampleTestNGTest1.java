package MavenProjPackage1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SampleTestNGTest1 {
 public String baseurl = "http://newtours.demoaut.com/" ;
 //public RemoteWebDriver driver;
 WebDriver driver = new ChromeDriver();
 
 @BeforeTest
 public void setBaseURL() {
	 	 driver.get(baseurl);
 }

@Test
public void verifyHomePageTitle() {
	//String expectedTitle = "Welcome: Mercury Tours";
	String actualTitle = driver.getTitle();
	//Assert.assertEquals(actualTitle, expectedTitle);
	System.out.println(actualTitle +  " is the actual page title");
}

@AfterTest
public void endSession() {
	 	 driver.quit();
}
}