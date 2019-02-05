package com.training.regression.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.RETC_070_Property_POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class RETC_070_PropertyTest {

	private WebDriver driver;
	private String baseUrl;
	private RETC_070_Property_POM rETC_070_Property_POM;
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
		rETC_070_Property_POM = new RETC_070_Property_POM(driver);
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver);
		// open the browser
		driver.get(baseUrl);
	}

	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}

	@Test
	public void validLoginTest() throws InterruptedException {
		rETC_070_Property_POM.clickLogin_resgister_Btn();
		rETC_070_Property_POM.sendUserName("admin");
		rETC_070_Property_POM.sendPassword("admin@123");
		rETC_070_Property_POM.click_signin_Btn();
		rETC_070_Property_POM.click_property_link();
		rETC_070_Property_POM.click_feature_link();
		
		rETC_070_Property_POM.sendTagName("New Launches11");
		rETC_070_Property_POM.sendTag_slug("launch1");
		rETC_070_Property_POM.sendTag_description("New Launches of villas, apartments, flats");
		rETC_070_Property_POM.clickAddNew();
		rETC_070_Property_POM.clickAddNew_link();
		rETC_070_Property_POM.sendTitle("prestige");
		rETC_070_Property_POM.sendContent("home town");
		rETC_070_Property_POM.click_newlaunch_checkbox();
		rETC_070_Property_POM.click_public_btn();
		rETC_070_Property_POM.click_logout();
		Thread.sleep(5000);
		rETC_070_Property_POM.click_alert();

		screenShot.captureScreenShot("First");
	}
}
