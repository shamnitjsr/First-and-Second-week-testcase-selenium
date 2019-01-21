package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RETC_038_POM {
	private WebDriver driver;

	public RETC_038_POM(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickBlogTab() {

		WebElement element = driver.findElement(By.linkText("BLOG"));
		element.click();
	}

	@FindBy(xpath = "//*[@id=\"ajaxsearchlite1\"]/div/div[3]/form/input[1]")
	private WebElement searchValue;

	public void sendSearchTesxt(String searchText) {
		this.searchValue.clear();
		this.searchValue.sendKeys(searchText);
	}

	@FindBy(xpath = "//*[@id=\"mCSBap_1_container\"]/div/div[1]/div[1]/h3/a/span")
	private WebElement searched;

	public void clickSearchedElement() throws InterruptedException {
		Thread.sleep(5000);
		this.searched.click();
	}

	@FindBy(xpath = "//*[@id=\"text-4\"]/div/div/p[2]/a")
	private WebElement clickDropLink;

	public void clickDropLink() throws InterruptedException {

		this.clickDropLink.click();
	}

	@FindBy(xpath = "//*[@id=\"wpcf7-f119-p134-o1\"]/form/div[2]/div[1]/div/span/input")
	private WebElement yourName;

	public void sendYourName(String userName) {
		this.yourName.clear();
		this.yourName.sendKeys(userName);
	}

	@FindBy(xpath = "//*[@id=\"wpcf7-f119-p134-o1\"]/form/div[2]/div[2]/div/span/input")
	private WebElement email;

	public void sendEmail(String email_id) {
		this.email.clear();
		this.email.sendKeys(email_id);
	}

	@FindBy(xpath = "//*[@id=\"wpcf7-f119-p134-o1\"]/form/div[2]/div[3]/div/span/input")
	private WebElement subject;

	public void sendSubject(String sub) {
		this.subject.clear();
		this.subject.sendKeys(sub);
	}

	@FindBy(xpath = "//*[@id=\"wpcf7-f119-p134-o1\"]/form/div[3]/span/textarea")
	private WebElement msg;

	public void sendMessage(String message) {
		this.msg.clear();
		this.msg.sendKeys(message);
	}

	@FindBy(xpath = "//*[@id=\"wpcf7-f119-p134-o1\"]/form/p/input")
	private WebElement clickSend;

	public void clickSendBtn() {
		this.clickSend.click();
	}

}
