package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utils.TestContextSetup;

public class offerpage {
	
	public WebDriver driver;
	public offerpage(WebDriver driver){
		this.driver=driver;
	}
	
	
	By Search=By.xpath("//input[@type='search']");
	By OfferProductName=By.cssSelector("tr td:nth-child(1)");
	
	//Xpath void method************************************************************************************//
	
	
	public void SearchItem(String name) {
		driver.findElement(Search).sendKeys(name);
	}
	
	public void getsearchtext() {
		driver.findElement(Search).getText();
	}
	
	public String OfferProductName() {
		return driver.findElement(OfferProductName).getText();
	}
	
}
