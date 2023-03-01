package commons;

import org.openqa.selenium.WebDriver;
import pageObjects.DemoPageObject;

public class PageGenerateManager {
	private static DemoPageObject demoPage;


	private PageGenerateManager(){

	}

	public static DemoPageObject getDemoPage(WebDriver driver){
		return demoPage = new DemoPageObject();
	}
}
