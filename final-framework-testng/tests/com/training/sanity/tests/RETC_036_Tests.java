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

import com.training.pom.RETC_036_POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class RETC_036_Tests {

	private WebDriver driver;
	private String baseUrl;
	private RETC_036_POM rETC_036_POM;
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
		rETC_036_POM = new RETC_036_POM(driver);
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
		rETC_036_POM.clickVillasTab();
		rETC_036_POM.sendSearchTesxt("Nullam hendrerit apartment");
		Thread.sleep(5000);
		rETC_036_POM.clickSearchedElement();
		Thread.sleep(5000);
		rETC_036_POM.clickDropLink();
		Thread.sleep(5000);
		rETC_036_POM.sendYourName("selenium");
		rETC_036_POM.sendEmail("selenium@gmail.com");
		rETC_036_POM.sendSubject("apartment");
		rETC_036_POM.sendMessage("looking for apartment");
		rETC_036_POM.clickSendBtn();

		screenShot.captureScreenShot("First");
	}
}
