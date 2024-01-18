package StepDefinition;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import PageObjects.landingPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.TestContextSetup;

public class landingpageStepDefinition {
	public WebDriver driver;
	public String Productname;
	public String OfferPageProductname;
	TestContextSetup TestContextSetup;
	landingPage LP;

	public landingpageStepDefinition(TestContextSetup TestContextSetup) {
		this.TestContextSetup = TestContextSetup;
		this.LP = TestContextSetup.PageObjectManager.getLandingPage();

	}

	@Given("User is on GreenCart Landing page")
	public void user_is_on_green_cart_landing_page() {
		LP.gettitle();
		Assert.assertTrue(LP.gettitle().contains("Green"));

	}

	@When("^User searched for the product with shortname (.+) Extract actual name of product$")
	public void user_searched_for_the_product_with_short_name_extract_actual_name_of_product(String shortname)
			throws InterruptedException {

		LP.SearchItem(shortname);

		Thread.sleep(1000);
		LP.click();

		String Productname = LP.GetProductname().split("-")[0].trim();
		System.out.println("Product name is extracted from home page :" + Productname);
	}

	@When("User added {string} selected producted to cart")
	public void Added_item_product_to_cart(String quantity) {
		LP.IncrementQuantity(Integer.parseInt(quantity));
		LP.Addtocart();
	}
	

}
