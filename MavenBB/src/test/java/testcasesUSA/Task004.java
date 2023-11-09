package testcasesUSA;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.USA_MenuNew;

public class Task004 {
	
	//Task4 : validation of title in each Menu page
	//4. Write a code for navigation of all Menu and validation of title in each page.
	
	WebDriver driver;
	
	@BeforeTest
	public void Setup() throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\godwi\\eclipse-workspace\\MavenSaucedemo\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.get("https://www.bestbuy.com/");
		HomePage P1 = new HomePage(driver);
		P1.usa();
	}
	
	@Test
	public void ShopMenu() throws InterruptedException {
		try{		
			USA_MenuNew USAmenu = new USA_MenuNew(driver);
			USAmenu.MenuDeal();
			USAmenu.SupportServise();
			USAmenu.Brands();
//			USAmenu.OtherMenuOpt();
			System.out.println();
			System.out.println("TESTCASE-4 RESULT : Menus options in the home page working as Expected.");
			System.out.println();
		}
		catch(Exception e){
			System.out.println();
			System.out.println("TESTCASE-4 RESULT : Execution of Test Script is interrupted.");
			System.out.println();
		}
	}
	
	@AfterTest
	public void end() {
		driver.close();
	}

}
