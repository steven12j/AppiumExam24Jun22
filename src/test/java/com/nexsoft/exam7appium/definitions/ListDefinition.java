package com.nexsoft.exam7appium.definitions;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import com.nexsoft.exam7appium.pom.MainListPage;
import com.nexsoft.exam7appium.pom.OtherFunctionalities;

import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ListDefinition {

	private AndroidDriver driver;
	public MainListPage listMain;
	public OtherFunctionalities listOther;
	
	@Before
	public void init() throws MalformedURLException {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("appPackage", "com.lolo.io.onelist");
		capabilities.setCapability("appActivity", "com.lolo.io.onelist.MainActivity");

		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		listMain = new MainListPage(driver);
		listOther = new OtherFunctionalities(driver);
	}
	
	@Given("User berada di Main Page")
	public void gotoMainPage() throws Throwable {

		System.out.println("User di Main Page");
	}
	
	@When("User memasukkan item List yang ingin diinput{string}")
	public void inputItemListTeks(String itemList) throws Throwable {
		System.out.println("User memasukkan item List : " + itemList);
		listMain.inputItemListAdd(itemList);
		listMain.klikItemListAddSave();
	}
	
	@When("User menekan tombol add List")
	public void keNewList() throws Throwable {
		listMain.klikNewList();;
	}
	
	@And("User memasukkan nama List baru {string}")
	public void inputNewList(String newList) {
		listMain.inputNewListAdd(newList);
		listMain.saveNewList();
	}
	
	@And("User memasukkan item List yang ingin diinput1{string}")
	public void inputItemListTeks1(String itemList) throws Throwable {
		System.out.println("User memasukkan item List : " + itemList);
		listMain.inputItemListAdd(itemList);
		listMain.klikItemListAddSave();
	}
	
	@And("User memasukkan item List yang ingin diinput2{string}")
	public void inputItemListTeks2(String itemList) throws Throwable {
		System.out.println("User memasukkan item List : " + itemList);
		listMain.inputItemListAdd(itemList);
		listMain.klikItemListAddSave();
	}
	
	@And("User memasukkan item List yang ingin diinput3{string}")
	public void inputItemListTeks3(String itemList) throws Throwable {
		System.out.println("User memasukkan item List : " + itemList);
		listMain.inputItemListAdd(itemList);
		listMain.klikItemListAddSave();
	}
	
	@And("User memasukkan item List yang ingin diinput4{string}")
	public void inputItemListTeks4(String itemList) throws Throwable {
		System.out.println("User memasukkan item List : " + itemList);
		listMain.inputItemListAdd(itemList);
		listMain.klikItemListAddSave();
	}
	
	@And("User memasukkan item List yang ingin diinput5{string}")
	public void inputItemListTeks5(String itemList) throws Throwable {
		System.out.println("User memasukkan item List : " + itemList);
		listMain.inputItemListAdd(itemList);
		listMain.klikItemListAddSave();
	}
	
	@Then("User kembali ke halaman Main dan Item List yang diinput muncul pada List{string}")
	public void AssertBackToMain(String itemList) throws Throwable {
		System.out.println("User kembali ke halaman Main");
		listOther.verifAdaTidak("//android.widget.TextView[@resource-id='com.lolo.io.onelist:id/text']", itemList);
	}
	
	@Then("User kembali ke halaman Main dan Item List yang diinput tidak muncul pada List")
	public void AssertBackToMainKosong() throws Throwable {
		System.out.println("User kembali ke halaman Main tanpa tambahan");
		listOther.doScreenshoot();
		listOther.verifTidakAda("//android.widget.TextView[@resource-id='com.lolo.io.onelist:id/text']", "");
	}
	
	@Then("User berpindah ke Main Page List lain dan Item List yang diinput muncul pada List")
	public void AssertBackToMainBanyak(String input1, String input2, String input3, String input4, String input5) throws Throwable {
		System.out.println("User kembali ke halaman Main List Banyak");
		listOther.doScreenshoot();
		listOther.verifBanyak("//android.widget.TextView[@resource-id='com.lolo.io.onelist:id/text']", input1, input2, input3, input4, input5);
	}
}
