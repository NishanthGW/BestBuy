package pages;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HPBottomlinksNew {
	WebDriver driver;
	public HPBottomlinksNew(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);	
	}

	String HomePage = "https://www.bestbuy.com/?intl=nosplash";
	@FindBy(xpath="//button[text()='No, Thanks']")
	public static WebElement NoThanks;
	
	//Order & Purchases
	@FindBy(xpath="//a[text()='Check Order Status']")
	public static WebElement CheckOrderStatus;
	@FindBy(xpath="//a[text()='Shipping, Delivery & Pickup']")
	public static WebElement ShippingDeliveryPickup;
	@FindBy(xpath="//a[text()='Returns & Exchanges']")
	public static WebElement ReturnsExchanges;
	@FindBy(xpath="//a[text()='Price Match Guarantee']")
	public static WebElement PriceMatchGuarantee;
	@FindBy(xpath="//a[text()='Product Recalls']")
	public static WebElement ProductRecalls;
	@FindBy(xpath="//a[text()='Trade-In Program']")
	public static WebElement TradeInProgram;
	@FindBy(xpath="//a[@data-lid='ft_op_gift_cards']")
	public static WebElement GiftCards;
	
	//Support & Services
	@FindBy(xpath="//a[text()='Visit our Support Center']")
	public static WebElement VisitourSupportCenter;
	@FindBy(xpath="//a[@data-lid='ft_support_shop_with_expert']")
	public static WebElement ShopwithanExpert;
	@FindBy(xpath="//a[text()='Schedule a Service']")
	public static WebElement ScheduleaService;
	@FindBy(xpath="//a[text()='Manage an Appointment']")
	public static WebElement ManageanAppointmen;
	@FindBy(xpath="//a[text()='Protection & Support Plans']")
	public static WebElement ProtectionSupportPlans;
	@FindBy(xpath="//a[text()='Haul Away & Recycling']")
	public static WebElement HaulAwayRecycling;
	@FindBy(xpath="//a[text()='Contact Us']")
	public static WebElement ContactUs;
	
	//Partnerships
	@FindBy(xpath="//a[text()='Affiliate Program']")
	public static WebElement AffiliateProgram;
	@FindBy(xpath="//a[text()='Advertise with Us']")
	public static WebElement AdvertisewithUs;
	@FindBy(xpath="//a[text()='Developers']")
	public static WebElement Developers;
	@FindBy(xpath="//a[text()='Best Buy Health']")
	public static WebElement BestBuyHealth;
	@FindBy(xpath="//a[text()='Best Buy Education']")
	public static WebElement BestBuyEducation;
	@FindBy(xpath="//a[@data-lid='ft_partner_best_buy_business']")
	public static WebElement BestBuyBusiness;
	
	//Payment Options
	@FindBy(xpath="//a[text()='My Best Buy® Credit Card']")
	public static WebElement CreditCard;
	@FindBy(xpath="//a[text()='Pay Your Bill at Citibank']")
	public static WebElement Citibank;
	@FindBy(xpath="//a[text()='Lease to Own']")
	public static WebElement LeasetoOwn;
	
	//Rewards & Membership
	@FindBy(xpath="//a[@data-lid='ft_member_best_buy_membership']")
	public static WebElement Memberships;
	@FindBy(xpath="//a[text()='View Points & Certificates']")
	public static WebElement ViewPointsCertificates;
	@FindBy(xpath="//a[text()='Member Offers']")
	public static WebElement MemberOffers;
	
	//About Best Buy
	@FindBy(xpath="//a[text()='Corporate Information']")
	public static WebElement CorporateInformation;
	@FindBy(xpath="//a[text()='Careers']")
	public static WebElement Careers;
	@FindBy(xpath="//a[text()='Corporate Responsibility']")
	public static WebElement CorporateResponsibility;
	@FindBy(xpath="//a[text()='Sustainability']")
	public static WebElement Sustainability;
	
	
	public void OrderPurchases() throws InterruptedException {
		System.out.println("OrderPurchases Method Initiated.");
		driver.navigate().to(HomePage);
		try {
			JavascriptExecutor JSE1 = (JavascriptExecutor) driver;
			JSE1.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		CheckOrderStatus.click();
		driver.navigate().back();
		}
		catch(Exception e) {
			NoThanks.click();
			JavascriptExecutor JSE1 = (JavascriptExecutor) driver;
			JSE1.executeScript("window.scrollBy(0,document.body.scrollHeight)");
			CheckOrderStatus.click();
			driver.navigate().back();
		}
		
		try{
			ShippingDeliveryPickup.click();
			driver.navigate().back();
		}
		catch(Exception e){
				NoThanks.click();
				ShippingDeliveryPickup.click();
				driver.navigate().back();
		}
		
		try{
		ReturnsExchanges.click();
		driver.navigate().back();
		}
		catch(Exception e){
			NoThanks.click();
			ReturnsExchanges.click();
			driver.navigate().back();
		}
		
		try {
			PriceMatchGuarantee.click();
			driver.navigate().back();			
		}
		catch(Exception e) {
			NoThanks.click();
			PriceMatchGuarantee.click();
			driver.navigate().back();			
		}
		
		try{
			ProductRecalls.click();
			driver.navigate().back();

		}
		catch(Exception e){
				NoThanks.click();
				ProductRecalls.click();
				driver.navigate().back();
		}
		
		try{
			TradeInProgram.click();
			driver.navigate().back();

		}
		catch(Exception e){
				NoThanks.click();
				TradeInProgram.click();
				driver.navigate().back();
		}
		
		try{
		GiftCards.click();
		}
		catch(Exception e) {
			NoThanks.click();
			GiftCards.click();
			driver.navigate().back();
		}
		System.out.println("OrderPurchases Links are working as expected");
		System.out.println();
	}
	
	public void SupportServices() throws InterruptedException {
		System.out.println("SupportServices Method Initiated.");
		driver.navigate().to(HomePage);
		try {
			JavascriptExecutor JSE1 = (JavascriptExecutor) driver;
			JSE1.executeScript("window.scrollBy(0,document.body.scrollHeight)");
			VisitourSupportCenter.click();
			driver.navigate().back();
		}
		catch(Exception e) {
			NoThanks.click();
			JavascriptExecutor JSE1 = (JavascriptExecutor) driver;
			JSE1.executeScript("window.scrollBy(0,document.body.scrollHeight)");
			VisitourSupportCenter.click();
			driver.navigate().back();
		}
		try{
			ShopwithanExpert.click();
			driver.navigate().back();
		}
		catch(Exception e){
				NoThanks.click();
				ShopwithanExpert.click();
				driver.navigate().back();
		}
		
		try{
			ScheduleaService.click();
			driver.navigate().back();
		}
		catch(Exception e){
				NoThanks.click();
				ScheduleaService.click();
				driver.navigate().back();
		}
		
		try{
			ManageanAppointmen.click();
			driver.navigate().back();
		}
		catch(Exception e){
				NoThanks.click();
				ManageanAppointmen.click();
				driver.navigate().back();
		}
		
		try{
			ProtectionSupportPlans.click();
			driver.navigate().back();
		}
		catch(Exception e){
				NoThanks.click();
				ProtectionSupportPlans.click();
				driver.navigate().back();
		}
		
		try{
			HaulAwayRecycling.click();
			driver.navigate().back();
		}
		catch(Exception e){
				NoThanks.click();
				HaulAwayRecycling.click();
				driver.navigate().back();
		}
		
		try{
			ContactUs.click();
			driver.navigate().back();

		}
		catch(Exception e){
				NoThanks.click();
				ContactUs.click();
				driver.navigate().back();
		}
			System.out.println("Support Services Links are working as expected");
			System.out.println();
	}
	
	public void Partnerships() throws InterruptedException {
		System.out.println("Partnerships Method Initiated.");
		driver.navigate().to(HomePage);
		try {
			JavascriptExecutor JSE1 = (JavascriptExecutor) driver;
			JSE1.executeScript("window.scrollBy(0,document.body.scrollHeight)");
			AffiliateProgram.click();
			driver.navigate().back();
		}
		catch(Exception e) {
			NoThanks.click();
			JavascriptExecutor JSE1 = (JavascriptExecutor) driver;
			JSE1.executeScript("window.scrollBy(0,document.body.scrollHeight)");
			AffiliateProgram.click();
			driver.navigate().back();
		}
		try{
			AdvertisewithUs.click();
			Thread.sleep(3000);
			JavascriptExecutor JSE = (JavascriptExecutor) driver;
			JSE.executeScript("history.go(0)");
			JSE.executeScript("history.go(0)");
			driver.navigate().back();
		}
		catch(Exception e){
				NoThanks.click();
				AdvertisewithUs.click();
				driver.navigate().back();
		}
		
		try{
			Developers.click();
			driver.navigate().back();
		}
		catch(Exception e){
				NoThanks.click();
				Developers.click();
				driver.navigate().back();
		}
		
		try{
			BestBuyHealth.click();
			driver.navigate().back();
		}
		catch(Exception e){
				NoThanks.click();
				BestBuyHealth.click();
				driver.navigate().back();
		}
		
		try{
			BestBuyEducation.click();
			driver.navigate().back();
		}
		catch(Exception e){
				NoThanks.click();
				BestBuyEducation.click();
				driver.navigate().back();
		}
		
		try{
			BestBuyBusiness.click();
			driver.navigate().back();
		}
		catch(Exception e){
				NoThanks.click();
				BestBuyBusiness.click();
				driver.navigate().back();
		}
		System.out.println("Partnerships Links are working as expected");
		System.out.println();
	}
	
	public void PaymentOptions() throws InterruptedException {
		System.out.println("PaymentOptions Method Initiated.");
		driver.navigate().to(HomePage);
		try {
			JavascriptExecutor JSE1 = (JavascriptExecutor) driver;
			JSE1.executeScript("window.scrollBy(0,document.body.scrollHeight)");
			CreditCard.click();
			driver.navigate().back();
		}
		catch(Exception e) {
			NoThanks.click();
			JavascriptExecutor JSE1 = (JavascriptExecutor) driver;
			JSE1.executeScript("window.scrollBy(0,document.body.scrollHeight)");
			CreditCard.click();
			driver.navigate().back();
		}
		
		try{
			Citibank.click();
			driver.navigate().back();
		}
		catch(Exception e){
				NoThanks.click();
				Citibank.click();
				driver.navigate().back();
		}
		
		try{
			LeasetoOwn.click();
			driver.navigate().back();

		}
		catch(Exception e){
				NoThanks.click();
				LeasetoOwn.click();
				driver.navigate().back();
		}
		System.out.println("PaymentOptions Links are working as expected");	
		System.out.println();
	}
	
	public void RewardsMembership() throws InterruptedException {
		System.out.println("RewardsMembership Method Initiated.");
		driver.navigate().to(HomePage);
		try {
			JavascriptExecutor JSE1 = (JavascriptExecutor) driver;
			JSE1.executeScript("window.scrollBy(0,document.body.scrollHeight)");
			Memberships.click();
			driver.navigate().back();
		}
		catch(Exception e) {
			NoThanks.click();
			JavascriptExecutor JSE1 = (JavascriptExecutor) driver;
			JSE1.executeScript("window.scrollBy(0,document.body.scrollHeight)");
			Memberships.click();
			driver.navigate().back();
		}
		try{
			ViewPointsCertificates.click();
			driver.navigate().back();
		}
		catch(Exception e){
				NoThanks.click();
				ViewPointsCertificates.click();
				driver.navigate().back();
		}
		
		try{
			MemberOffers.click();
			driver.navigate().back();
		}
		catch(Exception e){
				NoThanks.click();
				MemberOffers.click();
				driver.navigate().back();
		}
		System.out.println("RewardsMembership Links are working as expected");
		System.out.println();
	}
	
	public void AboutBestBuy() throws InterruptedException {
		System.out.println("AboutBestBuy Method Initiated.");
		driver.navigate().to(HomePage);
		try {
			JavascriptExecutor JSE1 = (JavascriptExecutor) driver;
			JSE1.executeScript("window.scrollBy(0,document.body.scrollHeight)");
			CorporateInformation.click();
			driver.navigate().back();
		}
		catch(Exception e) {
			NoThanks.click();
			JavascriptExecutor JSE1 = (JavascriptExecutor) driver;
			JSE1.executeScript("window.scrollBy(0,document.body.scrollHeight)");
			CorporateInformation.click();
			driver.navigate().back();
		}
		
		try{
			Careers.click();
			driver.navigate().back();

		}
		catch(Exception e){
				NoThanks.click();
				Careers.click();
				driver.navigate().back();
		}
		
		try{
			CorporateResponsibility.click();
			driver.navigate().back();

		}
		catch(Exception e){
				NoThanks.click();
				CorporateResponsibility.click();
				driver.navigate().back();
		}
		
		try{
			Sustainability.click();
			driver.navigate().back();
		}
		catch(Exception e){
				NoThanks.click();
				Sustainability.click();
				driver.navigate().back();
		}
			System.out.println("AboutBestBuy Links are worked as expected");
			System.out.println();
	}
	
	String Path = "C:\\Users\\godwi\\OneDrive\\Desktop\\Software Testing\\ScreenShots\\BestBuy\\SShot1.png";

	public void SSTC005() throws IOException{
		String Path11 = "C:\\Users\\godwi\\eclipse-workspace\\MavenBB\\Screenshots\\SSTC005_";
		int Num = (int)(Math.random()*9999);
		if(Num <= 1000){
			Num = Num + 1000;
		}
		String SSPath = Path11+Num+".png";
		System.out.println("Screenshot Taken : "+SSPath);
		TakesScreenshot Scrshot = (TakesScreenshot)driver;
		File Sourcefile = Scrshot.getScreenshotAs(OutputType.FILE);
		File fileDest = new File(SSPath);
		FileHandler.copy(Sourcefile, fileDest);
	}

}
