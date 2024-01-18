 package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.TestContextSetup;

public class checkoutpage {
	public WebDriver driver;
	public checkoutpage(WebDriver driver){
		this.driver=driver;
	}
	
	By CartBag =By.cssSelector("[alt='cart']");
	By checkoutbutton=By.xpath("//button[conatins(text(),'PROCEED TO CHECKOUT')]");
	By Promo=By.cssSelector(".promoBtn");
	By Placeorder=By.xpath("//button[conatins(text(),'Place order')]");
	
	
	
	
	//Xpath class ******************************************************************************//
	
	
	public void CheckoutItems() {
		 driver.findElement(CartBag).click();
		 driver.findElement(checkoutbutton).click();
	}
	
	public boolean verifypromo() {
		return driver.findElement(Promo).isDisplayed();
	}
	
	public boolean verifyplorder() {
		return driver.findElement(Placeorder).isDisplayed();
	}

}
