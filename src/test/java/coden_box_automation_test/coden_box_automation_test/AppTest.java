package coden_box_automation_test.coden_box_automation_test;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
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

	@Test(priority = 2)
	public void Dynamic_Dropdown() throws InterruptedException {

		WebElement Dropdown_country = driver.findElement(By.id("autocomplete"));
		int randomIndex = rand.nextInt(countryPrefixes.length);

		Dropdown_country.sendKeys(countryPrefixes[randomIndex]);
		Thread.sleep(1000);
		Dropdown_country.sendKeys(Keys.chord(Keys.ARROW_DOWN, Keys.ENTER));

	}

	@Test(priority = 3)
	
	public void Static_Dropdown () {

WebElement Static_Dropdown_Element = driver.findElement(By.id("dropdown-class-example")); 
Select Static_Dropdown = new Select(Static_Dropdown_Element); 


List<WebElement> options = Static_Dropdown.getOptions();

 Random rand = new Random();

int randomIndex = rand.nextInt(options.size() - 1) + 1;


Static_Dropdown.selectByIndex(randomIndex);

System.out.println("Selected option: " + options.get(randomIndex).getText()); 
		
	}
	
	
	
}
