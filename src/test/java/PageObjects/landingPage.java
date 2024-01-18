package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.TestContextSetup;

public class landingPage {
	public WebDriver driver;
	public landingPage(WebDriver driver){
		this.driver=driver;
	}
	By Top_Deal=By.linkText("Top Deals");
	By search =By.xpath("//input[@type='search']");
	By GetProductName=By.cssSelector("h4.product-name");
	By submit=By.xpath("//button[@type='submit']");
	By increment=By.cssSelector("a.Increment");
	By Addtocart=By.cssSelector(".product-action button");
	
	
	
	
	//Xpath class ******************************************************************************//
	public void SearchItem(String name) {
		driver.findElement(search).sendKeys(name);
	}
	
	public String GetProductname() {
		return driver.findElement(GetProductName).getText();
	}
	
	public void click() {
		driver.findElement(submit).click();
	}
	
	public void TopDeal() {
		driver.findElement(Top_Deal).click();
	}
	
	public String gettitle() {
		return driver.getTitle();
	}
	public void IncrementQuantity(int quantity) {
		int i=quantity-1;
		while(i>0) {
			driver.findElement(increment).click();
			i--;
		}
		
		
	}
	
	public void Addtocart() {
		driver.findElement(Addtocart).click();
	}
	
	

}
