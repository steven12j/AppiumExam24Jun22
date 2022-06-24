package com.nexsoft.exam7appium.pom;

import static org.testng.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.TakesScreenshot;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class OtherFunctionalities {

	private AndroidDriver driver;

	public OtherFunctionalities(AndroidDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	public boolean verifAdaTidak(String xpathIsi, String itemList) {
		List<WebElement> lstElement = driver.findElements(By.xpath(xpathIsi));
		
		boolean checkData = false;
		for(WebElement webElement : lstElement) {
			String nama = webElement.getText();

			if (nama.equalsIgnoreCase(itemList)) {
				checkData = true;
			}

		}
		assertTrue(checkData);
		
		return checkData;
	}
	
	public boolean verifTidakAda(String xpathIsi, String itemList) {
		List<WebElement> lstElement = driver.findElements(By.xpath(xpathIsi));
		
		boolean checkData = true;
		for(WebElement webElement : lstElement) {
			String nama = webElement.getText();

			if (nama.equalsIgnoreCase(itemList)) {
				checkData = false;
			}

		}
		assertTrue(checkData);
		
		return checkData;
	}
	
	public boolean verifBanyak(String xpathIsi, String input1, String input2, String input3, String input4, String input5) {
		List<WebElement> lstElement = driver.findElements(By.xpath(xpathIsi));
		
		boolean checkData = true;
		for(WebElement webElement : lstElement) {
			String nama = webElement.getText();

			if (nama.equalsIgnoreCase(input1)) {
				checkData = false;
			}
			if (nama.equalsIgnoreCase(input2)) {
				checkData = false;
			}
			if (nama.equalsIgnoreCase(input3)) {
				checkData = false;
			}
			if (nama.equalsIgnoreCase(input4)) {
				checkData = false;
			}
			if (nama.equalsIgnoreCase(input5)) {
				checkData = false;
			}

		}
		assertTrue(checkData);
		
		return checkData;
	}
	
	public void tunggu(int waktu) {
		driver.manage().timeouts().implicitlyWait(waktu, TimeUnit.SECONDS);
	}
	
	public void doScreenshoot() {
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String waktu = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
		String namaFile = "D:\\ScreenshootExam24Jun22\\" + waktu + ".png";
		File screenshoot = new File(namaFile);
		try {
			FileUtils.copyFile(srcFile, screenshoot);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
