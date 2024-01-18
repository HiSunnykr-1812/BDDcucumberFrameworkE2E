package StepDefinition;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import PageObjects.checkoutpage;
import PageObjects.landingPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.TestContextSetup;

public class checkoutpagestepdefinition {
	public WebDriver driver;
	public String Productname;
	public String OfferPageProductname;
	public checkoutpage Checkoutpage; 
	TestContextSetup TestContextSetup;
	
	public checkoutpagestepdefinition(TestContextSetup TestContextSetup ) {
		this.TestContextSetup=TestContextSetup;
		Checkoutpage=TestContextSetup.PageObjectManager.getcheckoutpage();	
	}
	@And("verify the user have promocode to enter")
	public void verify_the_user_have_promocode_to_enter() {
		
		Assert.assertTrue(Checkoutpage.verifypromo());
		Assert.assertTrue(Checkoutpage.verifyplorder());
		
	}
	
	@Then("^User Proceeded to checkout and validate the (.+) is checkout page$")
	public void User_Proceeded_to_checkoute(String name) throws InterruptedException{
		Checkoutpage.CheckoutItems();
		//Thread.sleep(2000);
		//Assertion to extract name from screen and campare
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
