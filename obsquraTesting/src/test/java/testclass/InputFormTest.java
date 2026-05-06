package testclass;

import org.testng.annotations.Test;

import obsqurabase.Base;
import pageclass.InputFormPage;

public class InputFormTest extends Base{
	@Test
	public void verifyInputForm()
	{
		InputFormPage inputFormPage=new InputFormPage(driver);
		inputFormPage.formsubmit();
		inputFormPage.details();
		inputFormPage.clickSubmitButton();
	}

}
