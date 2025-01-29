package TrialManagement;

import org.testng.annotations.Test;

import base.BaseSetup;
import base.NavigateToApplication;
import pages.TrialManagement;
import utils.RetryAnalyzer;

public class VerifyTrialManagement extends BaseSetup {

	public TrialManagement trialManagement;
	NavigateToApplication navigateToApplication;

	@Test(priority = 1)
	public void navigateToNetSingularity() throws InterruptedException {
		trialManagement = new TrialManagement(driver);
		navigateToApplication = new NavigateToApplication(driver);
		navigateToApplication.navigateToApplication("trial man");
	}

	@Test(priority = 2)
	public void verifyHomePageComponents() {
		trialManagement = new TrialManagement(driver);
		navigateToApplication = new NavigateToApplication(driver);
		trialManagement.printHomePageComponentList();
	}

	@Test(priority = 3, retryAnalyzer = RetryAnalyzer.class)
	public void navigateToDashboardFromWorkOrderPage() throws InterruptedException {
		trialManagement = new TrialManagement(driver);
		trialManagement.clickOnWorkOrderPage();
		trialManagement.clickOnRefreshButton();
	}
	
	@Test(priority = 5, retryAnalyzer = RetryAnalyzer.class)
	public void verifyTrialWorkorderFilter() throws InterruptedException {
		trialManagement = new TrialManagement(driver);
		trialManagement.checkTrialWorkorderFilter();
	}
	
	@Test(priority = 4)
	public void verifyTrialWorkorderTableOption() {
		trialManagement = new TrialManagement(driver);
		trialManagement.validateTableOption();
	}

}
