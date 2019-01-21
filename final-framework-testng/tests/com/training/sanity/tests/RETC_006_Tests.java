package com.training.sanity.tests;

import static org.testng.Assert.assertEquals;

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
import com.training.pom.RETC_006_POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class RETC_006_Tests {

	private WebDriver driver;
	private String baseUrl;
	private RETC_006_POM loginPOM_user_realstate;
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
		loginPOM_user_realstate = new RETC_006_POM(driver);
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver);
		// open the browser
		driver.get(baseUrl);
	}

	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(5000);
		driver.quit();
	}

	@Test
	public void validLoginTest() {

		loginPOM_user_realstate.clickLogin_resgister_Btn();

		String actaulUrl = driver.getCurrentUrl();

		System.out.println(actaulUrl);

		loginPOM_user_realstate.sendUserName("shambhuk260@gmail.com");
		loginPOM_user_realstate.sendPassword("LLuFh6EAO7m0");
		loginPOM_user_realstate.click_signin_Btn();

		loginPOM_user_realstate.click_usermenu_Btn();

		String expectedUrl = "http://realestate.hommelle.com/my-profile/";

		if (actaulUrl.equals(expectedUrl)) {
			System.out.println("login successfull");
		} else {
			System.out.println("login failed");
		}

		assertEquals(actaulUrl, expectedUrl);

		screenShot.captureScreenShot("First");
	}
}