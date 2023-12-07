package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	
	WebDriver driver;
	
	public Homepage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
		}
	
	@FindBy(name="q")
	WebElement searchbox;
	
	public void entersearch(String string) {
		searchbox.sendKeys(string);
		
	}
	

	@FindBy(name="btnK")
	WebElement searchbutton;
	
	public void clicksearch() {
		searchbutton.click();
		
	}
	
	@FindBy(id="result-stats")
	WebElement result;
	
	public void searchresult() {
		String resultdisplay = result.getText();
		System.out.println("*********************");
		System.out.println(resultdisplay);
		System.out.println("**********************");
	}
	
	
	
	
}
