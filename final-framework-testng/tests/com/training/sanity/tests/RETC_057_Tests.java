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
import com.training.pom.LoginPOM;
import com.training.pom.RETC_057_POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class RETC_057_Tests {

	private WebDriver driver;
	private String baseUrl;
	private RETC_057_POM rETC_057_POM;
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
		rETC_057_POM = new RETC_057_POM(driver);
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
	public void validLoginTest() {
		rETC_057_POM.clickLogin_resgister_Btn();
		rETC_057_POM.sendUserName("admin");
		rETC_057_POM.sendPassword("admin@123");
		rETC_057_POM.click_signin_Btn();
		rETC_057_POM.click_Properties();
		rETC_057_POM.click_Features();
		rETC_057_POM.sendTagName("Shantiniketan");
		rETC_057_POM.sendTag_slug("Prestige");
		rETC_057_POM.sendTag_description("New Launches of Apartments");
		rETC_057_POM.clickAddNew();
		rETC_057_POM.clickAddNewOfPropertiesSection();
		rETC_057_POM.sendTitle("prestige");
		rETC_057_POM.sendText("home town");
		rETC_057_POM.click_Shantiniketan_Checkbox();
		rETC_057_POM.click_Publish_btn();

		screenShot.captureScreenShot("First");
	}
}
