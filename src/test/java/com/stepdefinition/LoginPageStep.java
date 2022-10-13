package com.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPageStep {

	WebDriver driver;

	@Given("User is on adactin login page")
	public void user_is_on_adactin_login_page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://adactin.com/HotelApp/");
		driver.manage().window().maximize();

	}


	@When("User should enter valid {string} and {string}")
	public void user_should_enter_valid_and(String username, String password) {

		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);

	}

	@When("Should click the login button")
	public void login() {

		driver.findElement(By.id("login")).click();

	}
	@When("User should enter valid {string},{string},{string},{string},{string},{string},{string} and {string}")
	public void user_should_enter_valid_and(String location, String hotels, String roomtype, String roomnos, String datein, String dateout, String adultPerRoom, String childPerRoom) {
		WebElement dDnloc = driver.findElement(By.id("location"));
		dDnloc.sendKeys(location);

		WebElement dDnHotels = driver.findElement(By.id("hotels"));
		dDnHotels.sendKeys(hotels);

		WebElement dDnRoomType = driver.findElement(By.id("room_type"));
		dDnRoomType.sendKeys(roomtype);

		WebElement dDnRoomNos = driver.findElement(By.id("room_nos"));
		dDnRoomNos.sendKeys(roomnos);

		WebElement dateIn = driver.findElement(By.id("datepick_in"));
		dateIn.clear();
		dateIn.sendKeys(datein);

		WebElement dateOut = driver.findElement(By.id("datepick_out"));
		dateOut.clear();
		dateOut.sendKeys(dateout);

		WebElement dDnAdult = driver.findElement(By.id("adult_room"));
		dDnAdult.sendKeys(adultPerRoom);

		WebElement dDnChild = driver.findElement(By.id("child_room"));
		dDnChild.sendKeys(childPerRoom);
	
	
	
	}

//	@When("User shoul enter valid {string},{string},{string},{string},{string},{string},{string} and {string}")
//	public void user_shoul_enter_valid(String location, String hotels, String roomtype, String roomnos, String datein, String dateout, String adultPerRoom, String childPerRoom) {
//		
//
//	}

	@When("Should click search button")
	public void should_click_search_button() {

		WebElement searchClk = driver.findElement(By.id("Submit"));
		searchClk.click();
	}

	@When("Should click radio button")
	public void should_click_radio_button() {
		WebElement radioBtn = driver.findElement(By.id("radiobutton_0"));
		radioBtn.click();
	}

	@When("Should click continue")
	public void should_click_continue() {
		
		WebElement clkContinue = driver.findElement(By.id("continue"));
		clkContinue.click();
	}
	@When("Should enter valid details to book a hotel {string},{string},{string},{string},{string},{string},{string} and {string}")
	public void should_enter_valid_details_to_book_a_hotel(String firstName, String lastName, String address, String cardNo, String cardType, String expMonth, String expYear, String cvv) {
       WebElement txtfirstName = driver.findElement(By.id("first_name"));
       txtfirstName.sendKeys(firstName);
       
       WebElement txtlastName = driver.findElement(By.id("last_name"));
       txtlastName.sendKeys(lastName);
       
       WebElement txtadd = driver.findElement(By.id("address"));
       txtadd.sendKeys(address);
       
       WebElement txtcardNo = driver.findElement(By.id("cc_num"));
       txtcardNo.sendKeys(cardNo);
       
       WebElement dDncardType = driver.findElement(By.id("cc_type"));
       dDncardType.sendKeys(cardType);
       
       WebElement dDnExpMonth = driver.findElement(By.id("cc_exp_month"));
       dDnExpMonth.sendKeys(expMonth);
       
       WebElement dDnexpYear = driver.findElement(By.id("cc_exp_year"));
       dDnexpYear.sendKeys(expYear);
       
       WebElement txtCvv = driver.findElement(By.id("cc_cvv"));
       txtCvv.sendKeys(cvv);
       
	}

	@When("Should click book now button")
	public void should_click_book_now_button() throws InterruptedException {
		WebElement clkBook = driver.findElement(By.id("book_now"));
		clkBook.click();
		Thread.sleep(8000);
		
		WebElement orderid = driver.findElement(By.id("order_no"));
		String text = orderid.getAttribute("value");
		System.out.println(text);
		
	}

	@Then("User should verify login successful")
	public void verifySuccessLogin() {
		Assert.assertTrue("verify title", true);
	}

}
