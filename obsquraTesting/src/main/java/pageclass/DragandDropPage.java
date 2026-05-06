package pageclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DragandDropPage {
	public  WebDriver driver;
	public DragandDropPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//span[text()='Draggable n°3']")private WebElement drag;
	@FindBy(xpath="//div[@id='mydropzone']")private WebElement drop;
	@FindBy(xpath="//span[text()='Draggable n°4']")private WebElement rightClick;
	
	
public void others()
{
		driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
		}

public void dragAndDrop()
{
	Actions action=new Actions(driver);
	action.dragAndDrop(drop, drag).perform();
	}
public void rightClick()
{
	Actions action=new Actions(driver);
	action.contextClick(rightClick).perform();
}
}
