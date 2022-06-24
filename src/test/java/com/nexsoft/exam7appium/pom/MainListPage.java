package com.nexsoft.exam7appium.pom;

import io.appium.java_client.android.AndroidDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class MainListPage {

	private AndroidDriver driver;
	OtherFunctionalities listOther = new OtherFunctionalities(driver);
	
	@AndroidFindBy(id = "com.lolo.io.onelist:id/addItemEditText")
	private WebElement itemListAdd;
	@AndroidFindBy(id = "com.lolo.io.onelist:id/validate")
	private WebElement itemListAddSave;
	@AndroidFindBy(id = "com.lolo.io.onelist:id/listTitle")
	private WebElement newListAdd;
	@AndroidFindBy(id = "com.lolo.io.onelist:id/buttonAddList")
	private WebElement btnNewList;
	
	public MainListPage(AndroidDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	public void inputItemListAdd(String itemList) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		itemListAdd.sendKeys(itemList);
	}
	
	public void klikItemListAddSave() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		itemListAddSave.click();
	}
	
	public void klikListLain() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		TouchAction touchNewEvent = new TouchAction(driver);
		touchNewEvent.tap(PointOption.point(727, 217)).perform();
	}
	
	public void klikNewList() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		btnNewList.click();
	}
	
	public void inputNewListAdd(String newList) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		newListAdd.sendKeys(newList);
	}
	
	public void saveNewList() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		TouchAction touchNewEvent = new TouchAction(driver);
		touchNewEvent.tap(PointOption.point(1000, 1700)).perform();
	}
	
}
