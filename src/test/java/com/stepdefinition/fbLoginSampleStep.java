package com.stepdefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class fbLoginSampleStep {
	WebDriver driver;

	@Given("User should in fb login page")
	public void user_should_in_fb_login_page() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
	}

	@When("User should enter")
	public void user_should_enter(io.cucumber.datatable.DataTable dataTable) {
		List<List<String>> s = dataTable.asLists();
		List<String> list = s.get(2);
		String s1 = list.get(0);
		String s2 = list.get(1);

		WebElement txtuser = driver.findElement(By.id("email"));
		txtuser.sendKeys(s1);

		WebElement txtpass = driver.findElement(By.id("pass"));
		txtpass.sendKeys(s2);

	}

}
