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
import com.training.pom.RETC_007_POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class RETC_007_Tests {

	private WebDriver driver;
	private String baseUrl;
	private RETC_007_POM user_question_POM;
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
		user_question_POM = new RETC_007_POM(driver);
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
	public void validLoginTest() throws InterruptedException {

		user_question_POM.clickAppartmentMenu();
		user_question_POM.sendYourName("shambhu100");
		user_question_POM.sendYourEmail("shambhuk260@gmail.com");
		user_question_POM.sendYourSubject("Regarding new flat");
		user_question_POM.sendYourMessage(
				"searching a flat in bangalore and provide me rent and how much advanced need to pay?");

		user_question_POM.sendClick();
		user_question_POM.getMailSended();
		user_question_POM.getMailSended();

		String actual_msg = driver.findElement(
				By.xpath("//DIV[@class='wpcf7-response-output wpcf7-display-none wpcf7-mail-sent-ok'][text()"
						+ "='Thank you for your message. It has been sent.']"))
				.getText();

		String expectedmsg = "Thank you for your message. It has been sent.";

		if (actual_msg.equals(expectedmsg)) {
			System.out.println("sended successfull");
		} else {
			System.out.println("sended failed");
		}

		assertEquals(actual_msg, expectedmsg);

	}
}
