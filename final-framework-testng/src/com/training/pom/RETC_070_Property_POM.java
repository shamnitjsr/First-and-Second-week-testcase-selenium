package com.training.pom;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RETC_070_Property_POM {
	private WebDriver driver;

	public RETC_070_Property_POM(WebDriver driver) {

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
	private WebElement click_property_Link;

	public void click_property_link() {

		this.click_property_Link.click();

	}
	
	@FindBy(xpath = "//*[@id=\"menu-posts-property\"]/ul/li[4]/a")
	private WebElement click_Feature_Link;

	public void click_feature_link() {

		this.click_Feature_Link.click();

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
	private WebElement click_Add_new_link;

	public void clickAddNew_link() {
		this.click_Add_new_link.click();
	}
	
	
	@FindBy(xpath= "//*[@id=\"title\"]")
	private WebElement title;

	public void sendTitle(String t) {
		this.title.clear();
		this.title.sendKeys(t);
	}
	
	@FindBy(xpath= "//*[@id=\"content\"]")
	private WebElement content;

	public void sendContent(String c) {
		this.content.clear();
		this.content.sendKeys(c);
	}
	
	@FindBy(xpath = "//*[@id=\"in-property_feature-178\"]")
	private WebElement clickcheckboxnewlaunch1;

	public void click_newlaunch_checkbox() {

		this.clickcheckboxnewlaunch1.click();

	}
	@FindBy(xpath = "//*[@id=\"publish\"]")
	private WebElement click_publish_btn;

	public void click_public_btn() {

		this.click_publish_btn.click();

	}
	
	
	public void click_logout() {
		WebElement element = driver.findElement(By.linkText("Howdy, admin"));
		Actions action = new Actions(driver);
		action.moveToElement(element).build().perform();
		driver.findElement(By.linkText("Log Out")).click();
		}
	
	public void click_alert() {
	 Alert alert=driver.switchTo().alert();
     alert.accept();
	}
	
	
	


	/*
	@FindBy(xpath = "//*[@id=\"menu-posts\"]/a/div[3]")
	private WebElement clickposts;

	public void click_Posts() {

		this.clickposts.click();

	}

	@FindBy(xpath = "//*[@id=\"menu-posts\"]/ul/li[4]/a")
	private WebElement clickcatagories;

	public void click_Catagories() {

		this.clickcatagories.click();

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

	@FindBy(xpath = "//*[@id=\"menu-posts\"]/a/div[3]")
	private WebElement aclickposts;

	public void again_click_Posts() {

		this.aclickposts.click();

	}

	@FindBy(xpath = "//*[@id=\"menu-posts\"]/ul/li[2]/a")
	private WebElement clickallposts;

	public void click_All_Posts() {

		this.clickallposts.click();

	}

	@FindBy(xpath = "//*[@id=\"wpbody-content\"]/div[3]/a")
	private WebElement click_add_new_btn;

	public void click_Add_New_btn() {

		this.click_add_new_btn.click();

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

	@FindBy(xpath = "//*[@id=\"in-category-533\"]")
	private WebElement click_new_launches;

	public void click_New_Launches_btn() {

		this.click_new_launches.click();

	}

	@FindBy(xpath = "//*[@id=\"publish\"]")
	private WebElement click_publish;

	public void click_Publish_btn() {

		this.click_publish.click();

	}
	*/

}
