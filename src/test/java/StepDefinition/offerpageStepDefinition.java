package StepDefinition;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import PageObjects.PageObjectManager;
import PageObjects.landingPage;
import PageObjects.offerpage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.TestContextSetup;

public class offerpageStepDefinition {
	public WebDriver driver;
	public String Productname;
	public String OfferPageProductname;
	TestContextSetup TestContextSetup;
	PageObjectManager pageobjectmanager;

	public offerpageStepDefinition(TestContextSetup TestContextSetup) {
		this.TestContextSetup = TestContextSetup;
	}

	@Then("^User go and search with same shortname (.+) is offers page$")
	public void user_go_and_search_with_same_short_name_is_offers_page(String shortname) throws InterruptedException {
		
		SwitchToOfferPage();
		
		offerpage OP = TestContextSetup.PageObjectManager.getofferpage();
		OP.SearchItem(shortname);

		
		
		
		Thread.sleep(2000);

		

		String OfferPageProductname = OP.OfferProductName();
		Thread.sleep(2000);
	}

	
	  public void SwitchToOfferPage() {
	  
	  
	  TestContextSetup.PageObjectManager.getLandingPage(); 
	  landingPage landing=TestContextSetup.PageObjectManager.getLandingPage();
	  landing.TopDeal();
	  TestContextSetup.GenericUtils.SwitchWindow();
	  
	  
	  }
	 

	@And("validate the product is retrive in offer page")
	public void product_validation() throws InterruptedException {
		Assert.assertEquals(Productname, TestContextSetup.OfferPageProductname);
		Thread.sleep(2000);

	}
}
