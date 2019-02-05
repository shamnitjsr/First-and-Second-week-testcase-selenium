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
import com.training.pom.RETC_68_POM;
//import com.training.pom.LoginPOM;
//import com.training.pom.RETC_066_POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class RETC_068_Mortgage {
	private WebDriver driver;
	private String baseUrl;
	private RETC_68_POM rETC_68_POM;
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
		rETC_68_POM = new RETC_68_POM(driver);
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver);
		// open the browser
		driver.get(baseUrl);
	}

	@AfterMethod
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test(dataProvider = "excel-inputs68", dataProviderClass = LoginDataProviders.class)
	public void loginDBTest(String amount, String downpayment,String years,String interestrate) throws InterruptedException {
		
		rETC_68_POM.mouseOverAppartmentMenu();
		
		rETC_68_POM.sendAmt(amount);
		rETC_68_POM.sendDownPayment(downpayment);
		rETC_68_POM.sendYears(years);
		rETC_68_POM.sendInterest_rate(interestrate);
		
		rETC_68_POM.sendCalculate();
		
		Thread.sleep(10000);
		
		//screenShot.captureScreenShot(userName);

	}

}