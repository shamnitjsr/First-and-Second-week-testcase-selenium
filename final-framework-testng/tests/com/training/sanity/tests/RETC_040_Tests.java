package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.RETC_040_POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class RETC_040_Tests {

	private WebDriver driver;
	private String baseUrl;
	private RETC_040_POM rETC_040_POM;
	private static Properties properties;
	private ScreenShot screenShot;

	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		rETC_040_POM = new RETC_040_POM(driver);
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver);
		// open the browser
		driver.get(baseUrl);
	}

	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		//driver.quit();
	}

	@Test
	public void validLoginTest() throws InterruptedException {

		rETC_040_POM.clickLogin_resgister_Btn();
		rETC_040_POM.sendUserName("admin");
		rETC_040_POM.sendPassword("admin@123");
		rETC_040_POM.click_signin_Btn();
		rETC_040_POM.click_Posts();
		rETC_040_POM.click_Catagories();
		rETC_040_POM.sendTagName("New Launches");
		rETC_040_POM.sendTag_slug("launch");
		rETC_040_POM.sendTag_description("New Launches of villas, apartments, flats");
		rETC_040_POM.clickAddNew();
		rETC_040_POM.click_All_Posts();
		rETC_040_POM.click_Add_New_btn();
		rETC_040_POM.sendTitle("New Launches");
		rETC_040_POM.sendText("New Launch in Home");
		rETC_040_POM.click_New_Launches_btn();
		rETC_040_POM.click_Publish_btn();
		Thread.sleep(5000);
		rETC_040_POM.click_Parmalink_btn();
		screenShot.captureScreenShot("First");
	}
}
