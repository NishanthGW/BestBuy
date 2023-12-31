package testcasesUSA;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePageNew;

public class Task006 {
	
	//6. Write code to search for and add an item to the shopping cart.

	WebDriver driver;
	
	@BeforeTest
	public void Setup() throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\godwi\\eclipse-workspace\\MavenSaucedemo\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.get("https://www.bestbuy.com/");
	}
	
	@Test
	public void search() throws InterruptedException{
		try{
			HomePageNew HP = new HomePageNew(driver);
			HP.usa();
			HP.search("Apple MegSafe Battery Pack");
		}
		catch(Exception e){
			System.out.println("TESTCASE-6 RESULT : FAIL : Test Script running is interrupted .");
		}
	}
	
	@AfterTest
	public void end() {
		driver.close();	
	}
}
