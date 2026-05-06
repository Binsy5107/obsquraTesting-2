package testclass;

import org.testng.annotations.Test;

import obsqurabase.Base;
import pageclass.AlertsPage;

public class AlertsTest extends Base{
	@Test
public void verifySimpleAlert()
{
	AlertsPage alertsPage= new AlertsPage(driver);
	alertsPage.javascriptAlertclick();
	alertsPage.singleAlertclick();
	alertsPage.switchToAlertAndAccept();
}
	@Test
	public void verifyConfirmationAlertDismiss()
	{
		AlertsPage alertsPage= new AlertsPage(driver);
		alertsPage.javascriptAlertclick();
		alertsPage.clickconfimationAlert();
		alertsPage.dismissconfimationAlert();
	}
	@Test
	public void verifyPromptAlert()
	{
		AlertsPage alertsPage= new AlertsPage(driver);
		alertsPage.javascriptAlertclick();
		alertsPage.clickPromptAlert();
		alertsPage.acceptpromptAlert();
	}
}
