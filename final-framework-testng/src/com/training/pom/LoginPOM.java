package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOM {
	private WebDriver driver; 
	
	public LoginPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="VILLAS")
	private WebElement click_villas; 
	
	public void clickVillasTab() {
		this.click_villas.click(); 
	}
	
	@FindBy(linkText="Drop Us a Line")
	private WebElement click_drop_us_a_line; 
	
	public void clickDrop_us_a_line() {
		this.click_drop_us_a_line.click(); 
	}
	
	
	

	@FindBy(xpath="//*[@id=\"wpcf7-f119-p134-o1\"]/form/div[2]/div[1]/div/span/input")
	private WebElement yourName;
	
	public void sendYourName(String yName) {
		this.yourName.clear();
		this.yourName.sendKeys(yName);
	}
	
	
	@FindBy(xpath="//*[@id=\"wpcf7-f119-p134-o1\"]/form/div[2]/div[2]/div/span/input")
	private WebElement Email;
	
	public void sendEmail(String email) {
		this.Email.clear();
		this.Email.sendKeys(email);
	}
	
	@FindBy(xpath="//*[@id=\"wpcf7-f119-p134-o1\"]/form/div[2]/div[3]/div/span/input")
	private WebElement Subject;
	
	public void sendSubject(String subject) {
		this.Subject.clear();
		this.Subject.sendKeys(subject);
	}
	
	@FindBy(name="id:comments")
	private WebElement Message;
	
	public void sendMesssage(String subject) {
		this.Message.clear();
		this.Message.sendKeys(subject);
	}
	
	@FindBy(xpath="//*[@id=\"wpcf7-f119-p134-o1\"]/form/p/input")
	private WebElement click_send_btn; 
	
	public void clickSendbtn() {
		this.click_send_btn.click(); 
	}
}
