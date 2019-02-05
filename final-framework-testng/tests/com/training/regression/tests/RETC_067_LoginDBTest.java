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
import com.training.generics.GenericMethods;
import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;

import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class RETC_067_LoginDBTest {
	private WebDriver driver;
	private String baseUrl;
	//private RETC_067_POM rETC_067_POM;
	private LoginPOM loginPOM;
	private static Properties properties;
	private ScreenShot screenShot;
	private GenericMethods genericMethods; 
	
	
	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		loginPOM = new LoginPOM(driver);
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver);
		genericMethods = new GenericMethods(driver); 
		// open the browser
		driver.get(baseUrl);
	}

	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}


	@Test(dataProvider = "db-inputs", dataProviderClass = LoginDataProviders.class)
	public void loginDBTest(String yName, String email,String subject,String msg) throws InterruptedException {
		

		loginPOM.clickVillasTab();
		loginPOM.clickDrop_us_a_line();
		Thread.sleep(5000);
		loginPOM.sendYourName(yName);
		Thread.sleep(5000);
		loginPOM.sendEmail(email);
		Thread.sleep(5000);
		loginPOM.sendSubject(subject);
		Thread.sleep(5000);
		loginPOM.sendMesssage(msg);
		Thread.sleep(5000);
		
		loginPOM.clickSendbtn();
		// for demonstration 
//		genericMethods.getElement("login", "id"); 
		//rETC_067_POM.clickLoginregisterBtn();		
		//rETC_067_POM.sendUserName(userName);
		
		//rETC_067_POM.sendPassword(password);
		// rETC_067_POM.clickLoginBtn();
		
		//screenShot.captureScreenShot(userName);

	}

}