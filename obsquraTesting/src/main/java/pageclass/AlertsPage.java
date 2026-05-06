package pageclass;


import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class AlertsPage  {
	public WebDriver driver;
	public AlertsPage(WebDriver driver) 
	{
		this.driver=driver;
	PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//button[@class='btn btn-success']")private WebElement singleAlert;
	@FindBy(xpath="//button[@class='btn btn-warning']")private WebElement confimationAlert;
	@FindBy(xpath="//button[@class='btn btn-danger']")private WebElement promptAlert;
	

public void javascriptAlertclick()
{
	driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
	}
public void singleAlertclick()
{
	singleAlert.click();
	
	}
public void switchToAlertAndAccept()
{
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    Alert alert = wait.until(ExpectedConditions.alertIsPresent());
	//Alert alert = driver.switchTo().alert();
    alert.accept();
}
public void clickconfimationAlert()
{
	confimationAlert.click();
	}
public void dismissconfimationAlert()
{
	Alert alert=driver.switchTo().alert();
	alert.dismiss();
	}
public void clickPromptAlert()
{
	promptAlert.click();
	}
public void acceptpromptAlert()
{Alert alert=driver.switchTo().alert();
alert.sendKeys("five");
alert.accept();
	}
}

