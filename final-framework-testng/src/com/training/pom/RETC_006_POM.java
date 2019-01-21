package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RETC_006_POM {
	private WebDriver driver;

	public RETC_006_POM(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id=\"responsive\"]/li[8]/a")
	private WebElement loginregister_button_click;

	public void clickLogin_resgister_Btn() {
		this.loginregister_button_click.click();
	}

	@FindBy(id = "user_login")
	private WebElement userName;

	public void sendUserName(String userName) {
		this.userName.clear();
		this.userName.sendKeys(userName);
	}

	@FindBy(id = "user_pass")
	private WebElement password;

	public void sendPassword(String password) {
		this.password.clear();
		this.password.sendKeys(password);
	}

	@FindBy(name = "login")
	private WebElement signin_button_click;

	public void click_signin_Btn() {
		// TODO Auto-generated method stub
		this.signin_button_click.click();

	}

	@FindBy(xpath = "//*[@id=\"post-133\"]/div[1]/div/div/ul[2]/li[2]/a")
	private WebElement usermenu_button_click;

	public void click_usermenu_Btn() {
		// TODO Auto-generated method stub
		this.usermenu_button_click.click();

	}

}
