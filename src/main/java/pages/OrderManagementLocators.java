package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.Status;

import utils.ExtentListener;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

public class OrderManagementLocators {

    WebDriver driver;
    WebDriverWait wait;

    // Constructor to initialize elements using PageFactory
    public OrderManagementLocators(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30)); // Initialize WebDriverWait with 30 seconds
        PageFactory.initElements(driver, this); // Initialize PageFactory elements
    }

    // *********************Side menu bar xpaths******************************************
    @FindBy(xpath = "//em[contains(@class, 'Case-Management_Dashboard')]")
    private WebElement DashboardIconSideMenu;
    
    @FindBy(xpath = "//em[contains(@class, 'Work-order-Management-_Work-order')]")
    private WebElement ordersIconSideMenu;
    
    @FindBy(xpath = "//em[contains(@class, 'Procurement_Purchase-order')]")
    private WebElement orderitemsIconSideMenu;
    
    @FindBy(xpath = "//em[contains(@class, 'Order-management_Orders')]")
    private WebElement orderTypesIconSideMenu;

    // ************************Dashboard page xpaths******************************************
    @FindBy(xpath = "//h2[contains(@class, 'app-name') and contains(text(), 'Order Management')]")
    private WebElement getOrderManagementText;

    @FindBy(xpath = "//div[contains(text(), 'Analytics') and contains(@style, 'font-size')]")
    private WebElement gettextanalyticsText;
    
    @FindBy(xpath = "(//span[contains(@class, 'mat-mdc-button-touch-target')])[2]")
    private WebElement notificationIconOnDashboard;
    
    @FindBy(xpath = "(//span[contains(@class, 'mat-mdc-button-touch-target')])[3]")
    private WebElement closedOrdersiconOnDashboard;
    
    @FindBy(xpath = "(//span[contains(@class, 'mat-mdc-button-touch-target')])[4]")
    private WebElement ordersIconOnDashboard;
    
    @FindBy(xpath = "(//span[contains(@class, 'mat-mdc-button-touch-target')])[5]")
    private WebElement GisiconOnDashboard;

    // **********************************Orders page xpaths******************************************
    @FindBy(xpath = "//div[contains(@class, 'text-ellipsis') and contains(text(), 'Orders')]")
    private WebElement OrdersPageGetText;

    // *******************************Order items page xpaths****************************************
    @FindBy(xpath = "//div[contains(@class, 'text-ellipsis') and contains(text(), 'Order items')]")
    private WebElement orderItemsText;

    // *******************************Order type page xpaths****************************************
    @FindBy(xpath = "//div[contains(@class, 'text-ellipsis') and contains(text(), 'Order types')]")
    private WebElement GettextOrderType;
    
    @FindBy(xpath = "(//span[contains(@class, 'mat-mdc-button-touch-target')])[3]")
    private WebElement createOrderType;
    
  
    
    @FindBy(xpath = "//span[contains(@class, 'filter-label') and contains(text(), 'Filters')]")
    private WebElement FilterNameGetTextOrderTypePage;
    
    @FindBy(xpath = "//div[contains(@class, 'text-ellipsis') and contains(text(), 'Create')]")
    private WebElement GettextcreateOrderType;
    
   
    
 // *******************************Order type page filter xpaths****************************************
    
    @FindBy(xpath = "(//span[contains(@class, 'mat-mdc-button-touch-target')])[4]")
    private WebElement filterIconOrderTypePage;
    
    @FindBy(xpath = "//span[contains(@class, 'mat-mdc-select-placeholder') and contains(text(), 'Select filter')]")
    WebElement clickOnSelectFilter;
    
//    @FindBy(xpath = "//div[@class='mat-mdc-select-value ng-tns-c2643520907-307' and @id='mat-select-value-45']")
//    private WebElement SearchinFilter;
    
    @FindBy(xpath = "//span[contains(@class, 'ng-star-inserted') and text()='Name']")
    WebElement selectFilterValueName;
    
    
//    @FindBy(xpath = "(//span[contains(@class, 'ng-star-inserted') and text()='Order type Id'])[2]")
//    private WebElement OrderTypeid;
    
    @FindBy(xpath = "//input[contains(@class, 'mat-mdc-input-element') and @placeholder='Name']")
    WebElement insertName;
    
    @FindBy(xpath = "//input[@placeholder='Order type Id']")
    private WebElement EnterOrderTypeid;
    
    @FindBy(xpath = "(//span[contains(@class, 'mat-mdc-button-touch-target')])[36]")
    private WebElement clickapplyIcon;
    
   

    // ***********************************Closed orders page xpaths**********************************
    @FindBy(xpath = "//div[contains(@class, 'db_cardheading') and contains(text(), 'Closed orders')]")
    private WebElement GetTextClosedOrdersPageOnClosedOrdersPage;
    
    @FindBy(xpath = "(//span[contains(@class, 'mat-mdc-button-touch-target')])[3]")
    private WebElement ActiveOrdersIconOnClosedOrdersPage;
    
    @FindBy(xpath = "(//span[contains(@class, 'mat-mdc-button-touch-target')])[4]")
    private WebElement OrdersIconOnClosedOrdersPage;
    
    @FindBy(xpath = "(//span[contains(@class, 'mat-mdc-button-touch-target')])[5]")
    private WebElement GisIconOnClosedOrdersPage;

    // **************************************Gis page xpaths*************************************************
    @FindBy(xpath = "//input[contains(@class, 'mat-mdc-input-element') and contains(@placeholder, 'Search geography')]")
    private WebElement SearchGeography;

    // **************************************Methods*************************************************

    // **********************Side menu bar Methods****************************************************
    public void clickDashboardIconSideMenu() throws InterruptedException {
        Thread.sleep(3000);
        wait.until(ExpectedConditions.elementToBeClickable(DashboardIconSideMenu)).click();
    }

    public void clickOrdersIconSideMenu() {
        wait.until(ExpectedConditions.elementToBeClickable(ordersIconSideMenu)).click();
    }

    public void clickOrderItemsIconSideMenu() {
        wait.until(ExpectedConditions.elementToBeClickable(orderitemsIconSideMenu)).click();
    }

    public void clickOrderTypesIconSideMenu() {
        wait.until(ExpectedConditions.elementToBeClickable(orderTypesIconSideMenu)).click();
    }

    // *******************************Dashboard page Methods***************************
    public String gettextOrderManagement() throws InterruptedException {
        Thread.sleep(3000);
        wait.until(ExpectedConditions.visibilityOf(getOrderManagementText));
        return getOrderManagementText.getText();
    }

    public String gettextAnalyticsText() {
        wait.until(ExpectedConditions.visibilityOf(gettextanalyticsText));
        return gettextanalyticsText.getText();
    }

    public void clickNotificationIconOnDashboard() {
        wait.until(ExpectedConditions.elementToBeClickable(notificationIconOnDashboard)).click();
    }

    public void clickClosedOrdersIconOnDashboard() {
        wait.until(ExpectedConditions.elementToBeClickable(closedOrdersiconOnDashboard)).click();
    }

    public void clickOrdersIconOnDashboard() {
        wait.until(ExpectedConditions.elementToBeClickable(ordersIconOnDashboard)).click();
    }

    public void clickGisIconOnDashboard() {
        wait.until(ExpectedConditions.elementToBeClickable(GisiconOnDashboard)).click();
    }

    // *********************************Orders page Methods*******************************
    public String getOrdersPageText() {
        wait.until(ExpectedConditions.visibilityOf(OrdersPageGetText));
        return OrdersPageGetText.getText();
    }

    // *********************************Order items page Methods**************************************
    public String getOrderItemsText() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOf(orderItemsText));
        Thread.sleep(3000);
        return orderItemsText.getText();
    }

    // *********************************Order type page Methods****************************************
    public String getOrderTypeText() {
        wait.until(ExpectedConditions.visibilityOf(GettextOrderType));
        return GettextOrderType.getText();
    }

    public void clickCreateOrderType() {
        wait.until(ExpectedConditions.elementToBeClickable(createOrderType)).click();
    }

    public void clickFilterIconOrderTypePage() {
        wait.until(ExpectedConditions.elementToBeClickable(filterIconOrderTypePage)).click();
    }

    public String getFilterNameTextOrderTypePage() {
        wait.until(ExpectedConditions.visibilityOf(FilterNameGetTextOrderTypePage));
        return FilterNameGetTextOrderTypePage.getText();
    }

    public String getCreateOrderTypeText() {
        wait.until(ExpectedConditions.visibilityOf(GettextcreateOrderType));
        return GettextcreateOrderType.getText();
    }
    
    
    public void CheckFilterIconOrderTypePage() throws InterruptedException {
        wait.until(ExpectedConditions.elementToBeClickable(filterIconOrderTypePage)).click();
        System.out.println("Clicked on filter");
        ExtentListener.test.log(Status.INFO, "Clicked on filter");
        Thread.sleep(3000);
        wait.until(ExpectedConditions.elementToBeClickable(clickOnSelectFilter)).click();
        System.out.println("Clicked on  search filter");
        ExtentListener.test.log(Status.INFO, "Clicked on search");
        Thread.sleep(3000);
        wait.until(ExpectedConditions.elementToBeClickable(selectFilterValueName)).click();
        System.out.println("selected ordertype id");
        ExtentListener.test.log(Status.INFO, "selected ordertype id");
        Thread.sleep(3000);
        wait.until(ExpectedConditions.elementToBeClickable(insertName)).sendKeys("offer");
        System.out.println("enteered 55");
        ExtentListener.test.log(Status.INFO, "entered order id");
        
        Thread.sleep(3000);
        wait.until(ExpectedConditions.elementToBeClickable(clickapplyIcon)).click();
        System.out.println("clicked on apply button");
        ExtentListener.test.log(Status.INFO, "clicked on apply button");
        
        
        
        ExtentListener.test.log(Status.INFO, "Clicked on filter");
      
        
        
        
        
    }
    
    

    // ********************************Closed orders page*****************************
    public String getTextClosedOrdersPage() {
        wait.until(ExpectedConditions.visibilityOf(GetTextClosedOrdersPageOnClosedOrdersPage));
        return GetTextClosedOrdersPageOnClosedOrdersPage.getText();
    }

    public void clickActiveOrdersIconOnClosedOrdersPage() {
        wait.until(ExpectedConditions.elementToBeClickable(ActiveOrdersIconOnClosedOrdersPage)).click();
    }

    public void clickOrdersIconOnClosedOrdersPage() {
        wait.until(ExpectedConditions.elementToBeClickable(OrdersIconOnClosedOrdersPage)).click();
    }

    public void clickGisIconOnClosedOrdersPage() {
        wait.until(ExpectedConditions.elementToBeClickable(GisIconOnClosedOrdersPage)).click();
    }

    // ********************************Gis page Methods*************************************
    public String getSearchGeographyText() {
        wait.until(ExpectedConditions.visibilityOf(SearchGeography));
        return SearchGeography.getAttribute("value");
    }

    public void sendKeysToSearchGeography(String keys) {
        wait.until(ExpectedConditions.elementToBeClickable(SearchGeography)).sendKeys(keys);
    }
}
