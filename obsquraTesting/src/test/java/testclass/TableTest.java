package testclass;

import org.testng.annotations.Test;

import obsqurabase.Base;
import pageclass.TablePage;

public class TableTest extends Base{
	@Test
	public void verifyTableRow()
	{
		TablePage tablepage=new TablePage(driver);
		tablepage.table();
		tablepage.getAllNames();
	}

}
