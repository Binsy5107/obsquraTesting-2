package pageclass;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TablePage {
	public  WebDriver driver;
	public TablePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//table[@id='dtBasicExample']/tbody/tr/td[1]")private List<WebElement> nameColumn;
	public void table()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
	}
	
	public void getAllNames() {
		 
	        for (WebElement name : nameColumn) {
	            System.out.println(name.getText());
	        }
	    
        }
    }


