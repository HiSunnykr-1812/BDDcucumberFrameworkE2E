package PageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	public landingPage LandingPage;
	public offerpage offerspage;
	public WebDriver driver;
	public checkoutpage checkoutpage;
	
	public PageObjectManager(WebDriver driver) {
		this.driver=driver;
	}
	
	
	public landingPage getLandingPage() {
	LandingPage=new landingPage(driver);
	return LandingPage;
	}
	
	
	public offerpage getofferpage() {
		offerspage=new offerpage(driver);
		return offerspage;
		}
	
	public checkoutpage getcheckoutpage() {
		return checkoutpage=new checkoutpage(driver);
		
	}

}
