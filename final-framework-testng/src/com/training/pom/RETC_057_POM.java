package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RETC_057_POM {
	private WebDriver driver;

	public RETC_057_POM(WebDriver driver) {
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

		this.signin_button_click.click();

	}

	@FindBy(xpath = "//*[@id=\"menu-posts-property\"]/a/div[3]")
	private WebElement click_properties;

	public void click_Properties() {

		this.click_properties.click();

	}

	@FindBy(xpath = "//*[@id=\"menu-posts-property\"]/ul/li[4]/a")
	private WebElement click_features;

	public void click_Features() {

		this.click_features.click();

	}

	@FindBy(id = "tag-name")
	private WebElement tagName;

	public void sendTagName(String tName) {
		this.tagName.clear();
		this.tagName.sendKeys(tName);
	}

	@FindBy(id = "tag-slug")
	private WebElement tagSlug;

	public void sendTag_slug(String sName) {
		this.tagSlug.clear();
		this.tagSlug.sendKeys(sName);
	}

	@FindBy(id = "tag-description")
	private WebElement tagDescription;

	public void sendTag_description(String dName) {
		this.tagDescription.clear();
		this.tagDescription.sendKeys(dName);
	}

	@FindBy(xpath = "//*[@id=\"submit\"]")
	private WebElement addNew;

	public void clickAddNew() {
		this.addNew.click();
	}

	@FindBy(xpath = "//*[@id=\"menu-posts-property\"]/ul/li[3]/a")
	private WebElement addNewofpropertiessection;

	public void clickAddNewOfPropertiesSection() {
		this.addNewofpropertiessection.click();
	}

	@FindBy(xpath = "//*[@id=\"title\"]")
	private WebElement entertitle;

	public void sendTitle(String title) {
		this.entertitle.clear();
		this.entertitle.sendKeys(title);
	}

	@FindBy(xpath = " //*[@id=\"content\"]")
	private WebElement entertext;

	public void sendText(String text) {
		this.entertext.clear();
		this.entertext.sendKeys(text);
	}

	@FindBy(xpath = "//*[@id=\"in-property_feature-259\"]")
	private WebElement click_Shantiniketan_checkbok;

	public void click_Shantiniketan_Checkbox() {
		this.click_Shantiniketan_checkbok.click();
	}

	@FindBy(xpath = "//*[@id=\"publish\"]")
	private WebElement click_publish;

	public void click_Publish_btn() {

		this.click_publish.click();

	}

}
