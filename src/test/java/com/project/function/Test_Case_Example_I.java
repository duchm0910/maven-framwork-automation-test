package com.project.function;

import commons.BasePage;
import commons.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pageUis.SelectMenuPageUI;

public class Test_Case_Example_I extends BaseTest {
	WebDriver driver;

	@Parameters({"browser", "url"})
	@BeforeClass
	public void initBrowser(String browser, String url) {
		log.info("Pre condition: Open Browser: " + browser + "and navigate to url:" + url);
		driver = getBrowserDriver(browser, url);
		driver.manage().window().maximize();
	}
	@Test
	public void TC_Example(){
		log.info("This is an example testscript");
		System.out.println("showAllDropdownOption");
	}

	@AfterClass
	public void cleanBrowser(){
		cleanBrowserAndDriver();
	}
}
