package coden_box_automation_test.coden_box_automation_test;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AppTest {

	WebDriver driver = new ChromeDriver();
	String URL = "https://codenboxautomationlab.com/practice/";
	Random rand = new Random();
	String[] countryPrefixes = { "US", "JO", "FR", "DE", "IT", "ES", "JP", "CN", "IN", "BR" };

	@BeforeTest
	public void My_SetUp() {
		driver.get(URL);
		driver.manage().window().maximize();
	}

	@Test(priority = 1)
	public void Radio_Button() {

		List<WebElement> All_Radio_Button = driver.findElements(By.className("radioButton"));

		int Total_Radio_Button = driver.findElements(By.className("radioButton")).size();

		System.out.println(Total_Radio_Button);

		// to select random Radio Button
		int Random_Radio_Button_index = rand.nextInt(Total_Radio_Button);
		All_Radio_Button.get(Random_Radio_Button_index).click();

	}
	@Test (priority = 2)
public void Dynamic_Dropdown() throws InterruptedException {
	
	WebElement  Dropdown_country= driver.findElement(By.id("autocomplete")); 
	int randomIndex = rand.nextInt(countryPrefixes.length);

	Dropdown_country.sendKeys(countryPrefixes[randomIndex]);
	Thread.sleep(1000);
	Dropdown_country.sendKeys(Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))
;	
	
	}}

//
//	package codenboxautomationlab1.codenboxautomationlab1;
//
//	import java.awt.im.InputContext;
//	import java.util.List;
//	import java.util.Random;
//
//	import org.openqa.selenium.By;
//	import org.openqa.selenium.Keys;
//	import org.openqa.selenium.WebDriver;
//	import org.openqa.selenium.WebElement;
//	import org.openqa.selenium.chrome.ChromeDriver;
//	import org.testng.annotations.BeforeTest;
//	import org.testng.annotations.Test;
//
//	public class AppTest {
//
//		WebDriver driver = new ChromeDriver();
//		Random rand = new Random();
//
//		@BeforeTest
//		public void mySetup() {
//
//			driver.get("https://codenboxautomationlab.com/practice/");
//
//			driver.manage().window().maximize();
//		}
//
//		@Test(priority = 1, enabled = false)
//		public void RadioButton() {
//
//			List<WebElement> AllRadioButton = driver.findElements(By.className("radioButton"));
//
//			int totalRadioButtons = driver.findElements(By.className("radioButton")).size();
//
//			// this is to select random radio button
//			int RandomRadioButtonIndex = rand.nextInt(totalRadioButtons);
//
//			AllRadioButton.get(RandomRadioButtonIndex).click();
//
//			/*
//			 * __ if you need to select spcific raido button to be clicked __
//			 * 
//			 * AllRadioButton.get(0).click(); AllRadioButton.get(1).click();
//			 * AllRadioButton.get(2).click();
//			 * 
//			 */
//		}
//
//		@Test
//		public void Dynamic_Dropdown() throws InterruptedException {
//			String[] countryPrefixes = { "Un", "Ca", "Ge", "Fr", "It", "Sp", "In", "Br", "Ch", "Au" };
//
//			WebElement InputField = driver.findElement(By.id("autocomplete"));
//			int RandomCountryIndex = rand.nextInt(countryPrefixes.length);
//
//			InputField.sendKeys(countryPrefixes[RandomCountryIndex]);
//			Thread.sleep(2000);
//			InputField.sendKeys(Keys.chord(Keys.ARROW_DOWN,Keys.ENTER));
//
//		}
//	}
//}
