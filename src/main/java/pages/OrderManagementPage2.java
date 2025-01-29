package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import common.SeleniumAction;

public class OrderManagementPage2 extends SeleniumAction{
	
	
	 protected WebDriver driver;

	    // Constructor to initialize elements using the provided WebDriver
	    public OrderManagementPage2(WebDriver driver) {
	        super(driver); // Call the parent class constructor
	        this.driver = driver;
	        PageFactory.initElements(driver, this); // Initialize PageFactory
	    }

	    // Dashboard page xpaths
	    @FindBy(xpath = "//div[contains(@class, 'db_cardheading') and contains(@class, 'header-title') and contains(text(), 'Active orders')]")
	    private WebElement ActiVeOrderTextOnDashboard;
	
	    @FindBy(xpath = "(//span[contains(@class, 'mat-mdc-button-touch-target')])[5]")
	    private WebElement GisIconOnDashboard;
	
	
	
	
	    // Gis page xpaths
	
	    @FindBy(xpath = "//input[contains(@class, 'mat-mdc-input-element') and contains(@class, 'mat-mdc-autocomplete-trigger') and @placeholder='Search geography']")
	    private WebElement SearchGeoIconOnGispage;
	    
	    @FindBy(xpath = "(//span[contains(@class, 'mat-mdc-button-touch-target')])[3]")
	    private WebElement ClickIconOnSearch;
	
	
	 // Dashboard page methods
	    
	    public void ClickGisIconOnDashboard() throws InterruptedException {
	        waitForElementToBeInteractable(GisIconOnDashboard);
	        GisIconOnDashboard.click();
	    }
	
	
	    
	
	
	 // Gis page methods
	    
	    public void EnterTextINGisSearchbox() throws InterruptedException {
	        waitForElementToBeClickable(SearchGeoIconOnGispage);
	        SearchGeoIconOnGispage.sendKeys("indore");;
	    }
	
	    
	    public void clickGisSearchIcon() throws InterruptedException {
	        waitForElementToBeClickable(ClickIconOnSearch);
	        ClickIconOnSearch.click();
	    }
	
	

}
