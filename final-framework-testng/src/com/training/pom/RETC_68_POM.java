package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RETC_68_POM {
	private WebDriver driver; 
	
	public RETC_68_POM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	
     public void mouseOverAppartmentMenu() {

		WebElement element = driver.findElement(By.linkText("APARTMENTS"));

		Actions action = new Actions(driver);

		action.moveToElement(element).build().perform();

		driver.findElement(By.linkText("prestige")).click();

	}
	
    @FindBy(id = "amount")
 	private WebElement sendAmount1;

 	public void sendAmt(String amount) {
 		this.sendAmount1.clear();
 		this.sendAmount1.sendKeys(amount);
 	}

 	@FindBy(xpath = "//*[@id=\"downpayment\"]")   
 	private WebElement dpayment;

 	public void sendDownPayment(String dp) {
 		this.dpayment.clear();
 		this.dpayment.sendKeys(dp);
 	}

 	@FindBy(xpath = "//*[@id=\"years\"]")  
 	private WebElement nyear;

 	public void sendYears(String y) {
 		this.nyear.clear();
 		this.nyear.sendKeys(y);
 	}

 	@FindBy(xpath = "//*[@id=\"interest\"]")
 	private WebElement interest_rate;

 	public void sendInterest_rate(String ir) {
 		this.interest_rate.clear();
 		this.interest_rate.sendKeys(ir);
 	}

 	@FindBy(xpath = "//*[@id=\"widget_mortgage_calc_properties-4\"]/form/button")
 	
 	private WebElement click_calcuate;

 	public void sendCalculate() {

 		this.click_calcuate.click();
 	}

	
	
}