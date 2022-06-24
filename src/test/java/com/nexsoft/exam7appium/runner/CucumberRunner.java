package com.nexsoft.exam7appium.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "",
				features = "src/test/resources/1List.feature",
				glue = "com.nexsoft.exam7appium.definitions")
public class CucumberRunner extends AbstractTestNGCucumberTests {
	
}

/*
 *   Scenario Outline: Add Item List String
    Given User berada di Main Page
    When User memasukkan item List yang ingin diinput"barangg"
    Then User kembali ke halaman Main dan Item List yang diinput muncul pada List"barangg"

	Scenario Outline: Add Item List Angka
    Given User berada di Main Page
    When User memasukkan item List yang ingin diinput"1234"
    Then User kembali ke halaman Main dan Item List yang diinput muncul pada List"1234"

	Scenario Outline: Add Item List SpecChar
    Given User berada di Main Page
    When User memasukkan item List yang ingin diinput"!+-,."
    Then User kembali ke halaman Main dan Item List yang diinput muncul pada List"!+-,."
    
  Scenario Outline: Add Item List Field Kosong
    Given User berada di Main Page
    When User memasukkan item List yang ingin diinput""
    Then User kembali ke halaman Main dan Item List yang diinput tidak muncul pada List
 */
