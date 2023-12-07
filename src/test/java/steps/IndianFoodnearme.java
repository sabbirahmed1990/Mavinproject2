package steps;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import common.Baseclass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.Homepage;

public class IndianFoodnearme extends Baseclass  {
	
	//WebDriver driver;
	Homepage armyqa;
	
	@Given("I am on google homepage")
	public void i_am_on_google_homepage() {
		
		launchbrowser();


	}

	@When("I write indian food near me on search box")
	public void i_write_indian_food_near_me_on_search_box() {

		//WebElement searchbox = driver.findElement(By.name("q"));
		//searchbox.sendKeys("indian food near me");
		
		armyqa = new Homepage(driver);
		armyqa.entersearch("indian food near me");

	}

	@When("I click on search button")
	public void i_click_on_search_button() {
		
		//WebElement searchbutton = driver.findElement(By.name("btnK"));
		//searchbutton.click();
		
		armyqa.clicksearch();
		


	}

	@Then("I find relevant result")
	public void i_find_relevant_result() {
		
		//WebElement searchresulttest = driver.findElement(By.id("result-stats"));
		//String result = searchresulttest.getText();
		//System.out.println("**********************");
		//System.out.println(result);
		//System.out.println("***********************");
		
		armyqa.searchresult();
		
		
		String title = driver.getTitle();
		System.out.println("***********************");
		System.out.println(title);
		System.out.println("************************");
		
		Assert.assertEquals(title, "indian food near me - Google Search");
		
		closebrowser();


	}
	

}
