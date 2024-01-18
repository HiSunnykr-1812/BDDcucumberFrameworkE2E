package utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import PageObjects.PageObjectManager;

public class TestContextSetup {
	
	public static WebDriver driver;
	
	public String OfferPageProductname;
	
	public PageObjectManager PageObjectManager;
	
	public TestBase TestBase;
	
	public GenericUtils GenericUtils;
	
	
	public TestContextSetup() throws IOException {
		TestBase=new TestBase();
		PageObjectManager=new PageObjectManager(TestBase.WebDriverManager());
		GenericUtils=new GenericUtils(TestBase.WebDriverManager());
		
	}

}
