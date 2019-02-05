package com.training.regression.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.training.bean.LoginBean;
import com.training.dao.ELearningDAO;
import com.training.dataproviders.LoginDataProviders;
import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.pom.RETC_066_POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class RETC_066_LoginExcelTest {
	private WebDriver driver;
	private String baseUrl;
	private RETC_066_POM rETC_066_POM;
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
		rETC_066_POM = new RETC_066_POM(driver);
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver);
		// open the browser
		driver.get(baseUrl);
	}

	@AfterMethod
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test(dataProvider = "excel-inputs66", dataProviderClass = LoginDataProviders.class)
	public void loginDBTest(String yName, String email,String subject,String msg) throws InterruptedException {
		
		rETC_066_POM.clickVillasTab();
		rETC_066_POM.clickDrop_us_a_line();
		Thread.sleep(5000);
		rETC_066_POM.sendYourName(yName);
		Thread.sleep(5000);
		rETC_066_POM.sendEmail(email);
		Thread.sleep(5000);
		rETC_066_POM.sendSubject(subject);
		Thread.sleep(5000);
		rETC_066_POM.sendMesssage(msg);
		Thread.sleep(5000);
		
		rETC_066_POM.clickSendbtn();


		
		/*loginPOM.sendUserName(userName);
		loginPOM.sendPassword(password);
		loginPOM.clickLoginBtn(); */
		//screenShot.captureScreenShot(userName);

	}

}