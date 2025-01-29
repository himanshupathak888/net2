package orderManagementTestcases;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import base.BaseSetup;
import base.NavigateToApplication;

import pages.OrderManagementPage2;
import utils.ExtentListener;

public class OrdermanagementTestcases extends BaseSetup {
	
	public OrderManagementPage2 ordermanagement;
	NavigateToApplication navigateToApplication;
	
	@Test(priority = 1)
	public void navigateToNetSingularity() throws InterruptedException {
		navigateToApplication = new NavigateToApplication(driver);
		navigateToApplication.navigateToApplication("order");
		
		ExtentListener.test.log(Status.INFO, "Navigated to order management");
	}
	
	
	
	@Test(priority = 1)
	public void clicksearchGeographyOngisapge() throws InterruptedException {
		ordermanagement = new OrderManagementPage2(driver);
		ordermanagement.ClickGisIconOnDashboard();
		ordermanagement.EnterTextINGisSearchbox();
		ordermanagement.clickGisSearchIcon();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
