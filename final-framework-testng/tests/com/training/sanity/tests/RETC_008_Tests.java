package com.training.sanity.tests;

import static org.testng.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.pom.RETC_008_POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class RETC_008_Tests {

	private WebDriver driver;
	private String baseUrl;
	private RETC_008_POM mortgagePOM;
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
		mortgagePOM = new RETC_008_POM(driver);
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
		mortgagePOM.clickAppartmentMenu();
		mortgagePOM.sendAmt("400000");
		mortgagePOM.sendDownPayment("20000");
		mortgagePOM.sendYears("20");
		mortgagePOM.sendInterest_rate("7.25");

		mortgagePOM.sendCalculate();

		String actual_msg = driver
				.findElement(By.xpath("//*[@id=\"widget_mortgage_calc_properties-4\"]/form/div[5]/div")).getText();

		System.out.println(actual_msg);
		String expectedmsg = "Monthly Payment: 3003.43 Rs.";

		if (actual_msg.equals(expectedmsg)) {
			System.out.println("sended successfull");
		} else {
			System.out.println("sended failed");
		}

		assertEquals(actual_msg, expectedmsg);

	}
}
