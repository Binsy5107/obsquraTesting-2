package pageclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InputFormPage {
	public WebDriver driver;
	public InputFormPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
@FindBy(xpath="//input[@id='validationCustom01']")private WebElement firstname;
@FindBy(xpath="//input[@id='validationCustom02']")private WebElement lasttname;
@FindBy(xpath="//input[@id='validationCustomUsername']")private WebElement username;
@FindBy(xpath="//input[@id='validationCustom03']")private WebElement city;
@FindBy(xpath="//input[@id='validationCustom04']")private WebElement state;
@FindBy(xpath="//input[@id='validationCustom05']")private WebElement zip;
@FindBy(xpath="//input[@id=\"invalidCheck\"]")private WebElement checkIn;
@FindBy(xpath="//button[@type=\"submit\"]")private WebElement button;

	public void formsubmit()
	{
		driver.navigate().to("https://selenium.qabible.in/form-submit.php");
	}
	
	public void details()
	{
		firstname.sendKeys("arun");
		lasttname.sendKeys("babu");
		username.sendKeys("arunbabu");
		city.sendKeys("trivandrum");
		state.sendKeys("kerala");
		zip.sendKeys("695013");
	checkIn.click();
	
	}
	 public void clickSubmitButton() {
	        button.click(); 
	    }
}
