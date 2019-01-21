package com.training.pom;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RETC_009_POM {
	private WebDriver driver;

	public RETC_009_POM(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickAppartmentMenu() {

		WebElement element = driver.findElement(By.linkText("APARTMENTS"));
		element.click();

	}

	public void sendAddressclicklistedbelow() throws InterruptedException {

		driver.findElement(By.xpath("//*[@id='keyword_search']")).sendKeys("manayatha tech park");
		Thread.sleep(5000);

		WebElement s = driver.findElement(By.xpath("//div[@class='pac-item'][1]"));
		Actions action = new Actions(driver);
		action.moveToElement(s).click().perform();
		Thread.sleep(5000);

	}

	public void selectPropertyType() throws InterruptedException {

		driver.findElement(By.xpath("//*[@id='_property_type_chosen']/a")).click();
		Thread.sleep(5000);
		WebElement a = driver.findElement(By.xpath("//*[@id='_property_type']/option[4]"));
		a.click();
		Thread.sleep(5000);

	}

	public void selectRegions() throws InterruptedException {

		driver.findElement(By.xpath("//*[@id=\"realteo-search-form\"]/div[2]/div[2]/div/a")).click();
		Thread.sleep(5000);
		WebElement a = driver.findElement(By.xpath("//*[@id=\"realteo-search-form\"]/div[2]/div[2]/div/a/span"));
		a.click();
		Thread.sleep(5000);

	}

	@FindBy(xpath = "//*[@id=\"realteo-search-form\"]/div[3]/div/button")
	private WebElement clicksearch;

	public void clickSearchbtn() {
		this.clicksearch.click();
	}
}


