package pages;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePageNew {
	WebDriver driver;
	
	public HomePageNew(WebDriver driver) {
		this.driver=driver;
        PageFactory.initElements(driver, this);
	}

	String HomePage = "https://www.bestbuy.com/?intl=nosplash";
	
	@FindBy(xpath="//img[@alt='Canada'][1]")
	public static WebElement Canada;	
	@FindBy(xpath="//img[@alt='United States']")
	public static WebElement USA;

	@FindBy(xpath="//button[text()='No, Thanks']")
	public static WebElement NoThanks;
	
	@FindBy(xpath="//input[@id='gh-search-input']")
	public static WebElement search;	
	@FindBy(xpath="//button[@class='header-search-button']")
	public static WebElement submit;	
	@FindBy(xpath="//img[@alt='Apple - MagSafe Battery Pack - White - Front_Zoom']")
	public static WebElement MagSafeBatteryPack;	
	@FindBy(xpath="//button[@class='c-button c-button-primary c-button-lg c-button-block c-button-icon c-button-icon-leading add-to-cart-button']")
	public static WebElement appPBaddItem;	
	@FindBy(xpath="//button[text()='Continue shopping']")
	public static WebElement ContSHop;

	@FindBy(xpath="//span[text()='Added to cart']")
	public static WebElement Added;
	

	@FindBy(xpath="//span[text()='Cart']")
	public static WebElement CartPage;
	
	@FindBy (xpath="//button[@class='c-button c-button-outline c-button-lg btn-secondary my-bby-total-footer__no-thanks']")
	public static WebElement NOthanks;
	
	@FindBy(xpath="//button[text()='Checkout']")
	public static WebElement Checkout ;
	
	@FindBy(xpath="//span[text()='Order Status']")
	public static WebElement OrderStatus;	
	@FindBy(xpath="//a[text()='Continue']")
	public static WebElement ConAsGuest;
	@FindBy(xpath="//button[text()='Continue']")
	public static WebElement GuestOrder;
	
	public void canada() throws InterruptedException {
		Thread.sleep(5000);
		Canada.click();
		Thread.sleep(5000);
	}
	
	public void usa() throws InterruptedException {
		try{
			USA.click();
			String HomePageURL = driver.getCurrentUrl();
			System.out.println("Home Page URL = "+HomePageURL);
		}
		catch(Exception e){
			NoThanks.click();
		}
	}
	
	public void search(String item) throws InterruptedException, IOException {
			System.out.println("search Method Initiated.");
			search.sendKeys(item);
			submit.click();
			MagSafeBatteryPack.click();
			appPBaddItem.click();
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15000));
			wait.until(ExpectedConditions.visibilityOf(ContSHop));
			HomePage HP1 = new HomePage(driver);
			HP1.SSTC006();
			if(Added.isDisplayed()){
				System.out.println();
				System.out.println("TESTCASE-6 RESULT : PASS : successfully searched an item and added to the Cart.");	
				System.out.println();
			}
			else{
				System.out.println("TESTCASE-6 RESULT : FAIL : Unable to search an item and added to the Cart.");	
				System.out.println();
			}
			ContSHop.click();		
	}
	
	public void OrderStatus() throws InterruptedException {
		System.out.println();
		System.out.println("OrderStatus Method Initiated.");
		driver.navigate().to(HomePage);
		try {
			OrderStatus.click();
			System.out.println("Orders");
		}
		catch(Exception e) {
			NoThanks.click();
			OrderStatus.click();
			System.out.println("Orders");
		}
		ConAsGuest.click();
		System.out.println("ConAsGuest");
		GuestOrder.click();
		System.out.println("GuestOrder");
	}
	
	public void SSTC001() throws IOException{
		String Path11 = "C:\\Users\\godwi\\eclipse-workspace\\MavenBB\\Screenshots\\SSTC001_";
		int Num = (int)(Math.random()*9999);
		if( Num <= 1000 ) { Num = Num + 1000;
		
		}
		String SSPath = Path11+Num+".png";
		System.out.println(SSPath);
		TakesScreenshot Scrshot = (TakesScreenshot)driver;
		File Sourcefile = Scrshot.getScreenshotAs(OutputType.FILE);
		File fileDest = new File(SSPath);
		FileHandler.copy(Sourcefile, fileDest);
	}

	public void SSTC002() throws IOException{
		String Path11 = "C:\\Users\\godwi\\eclipse-workspace\\MavenBB\\Screenshots\\SSTC002_";
		int Num = (int)(Math.random()*9999);
		if( Num <= 1000 ) { Num = Num + 1000;
		
		}
		String SSPath = Path11+Num+".png";
		System.out.println(SSPath);
		TakesScreenshot Scrshot = (TakesScreenshot)driver;
		File Sourcefile = Scrshot.getScreenshotAs(OutputType.FILE);
		File fileDest = new File(SSPath);
		FileHandler.copy(Sourcefile, fileDest);
	}

	public void SSTC006() throws IOException{
		String Path11 = "C:\\Users\\godwi\\eclipse-workspace\\MavenBB\\Screenshots\\SSTC006_";
		int Num = (int)(Math.random()*9999);
		if( Num <= 1000 ) { Num = Num + 1000;
		
		}
		String SSPath = Path11+Num+".png";
		System.out.println(SSPath);
		TakesScreenshot Scrshot = (TakesScreenshot)driver;
		File Sourcefile = Scrshot.getScreenshotAs(OutputType.FILE);
		File fileDest = new File(SSPath);
		FileHandler.copy(Sourcefile, fileDest);
	}

}
