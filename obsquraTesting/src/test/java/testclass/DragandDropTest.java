package testclass;



import org.testng.annotations.Test;

import obsqurabase.Base;
import pageclass.DragandDropPage;

public class DragandDropTest extends Base{
	@Test
	public void verifyDragAndDrop()
	{
		DragandDropPage draganddroppage=new DragandDropPage(driver);
		draganddroppage.dragAndDrop();
		
	}
	@Test
	public void verifyrightClick()
	{
		DragandDropPage draganddroppage=new DragandDropPage(driver);
		draganddroppage.rightClick();
	}
}
