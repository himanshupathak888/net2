package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.ExcelReader;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class CaseManagementAppXpaths {

    WebDriver driver;

    // Constructor to initialize WebDriver
    public CaseManagementAppXpaths(WebDriver driver) {
        this.driver = driver;
    }

    // XPath for Side Menu Bar element
    private By analyticsSideMenuBar = By.xpath("//em[contains(@class, 'custom-icon root-modules icon icomoon Case-Management_Dashboard white ng-star-inserted')]");
    private By casesSideMenuBar = By.xpath("//em[starts-with(@class, 'custom-icon') and contains(@class, 'Case-Management_Cases')]");

    // Click on Analytics Side Menu Bar element
    public void clickAnalyticsSideMenuBar() throws InterruptedException {
        System.out.println("clicking on analyticsSideMenuBar ");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement analyticsMenuElement = wait.until(ExpectedConditions.elementToBeClickable(analyticsSideMenuBar));
        Thread.sleep(2000);
        analyticsMenuElement.click();
        
    }

    // Click on Cases Side Menu Bar element
    public void clickCasesSideMenuBar() throws InterruptedException {
       
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement casesMenuElement = wait.until(ExpectedConditions.elementToBeClickable(casesSideMenuBar));
        Thread.sleep(2000);
       
        casesMenuElement.click();
        
    }

    // XPath for Dash board elements
    private By analyticsText = By.xpath("//div[contains(@class, 'text-ellipsis') and contains(text(), 'Analytics')]");
    private By completedCaseIconOnDashboard = By.xpath("(//span[contains(@class, 'mat-mdc-button-touch-target')])[15]");
    private By gisIconDashboard = By.xpath("(//span[contains(@class, 'mat-mdc-button-touch-target')])[16]");
    private By casesListIconDashboard = By.xpath("(//span[contains(@class, 'mat-mdc-button-touch-target')])[17]");
    private By activeCasesText = By.xpath("//div[contains(@style, 'font-size') and contains(text(), 'Active cases')]");
    
    
    ////div[contains(@style, 'font-size') and contains(text(), 'Active cases')]
    
    
 // Methods for Dash board elements
    public String getAnalyticsTextonDashboard() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement analyticsTextElement = wait.until(ExpectedConditions.visibilityOfElementLocated(analyticsText));
        
        return analyticsTextElement.getText();
        
    }
    
    public String getActiveCasesTextonDashboard() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement ActiveCasesTextElement = wait.until(ExpectedConditions.visibilityOfElementLocated(activeCasesText));
        
        return ActiveCasesTextElement.getText();
        
    }

    public void clickCompletedCaseIconOnDashboard() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement completedCaseIconElement = wait.until(ExpectedConditions.elementToBeClickable(completedCaseIconOnDashboard));
     
        completedCaseIconElement.click();
      
        
    }

    public void clickGisIconDashboard() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement gisIconElement = wait.until(ExpectedConditions.elementToBeClickable(gisIconDashboard));
        gisIconElement.click();
    }

    public void clickCasesListIconDashboard() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement casesListIconElement = wait.until(ExpectedConditions.elementToBeClickable(casesListIconDashboard));
        casesListIconElement.click();
    }

    
    
    
    
   
    
    // XPath for Case Module elements
    private By casesText = By.xpath("//div[contains(@class, 'max-width') and contains(text(), 'Cases')]");
    private By searchTextBar = By.xpath("//input[contains(@class, 'mat-mdc-input-element') and contains(@class, 'mat-mdc-form-field-input-control') and contains(@id, 'mat-input')]");
    private By viewDetailsButton = By.xpath("//button[contains(@class, 'mat-badge') and contains(@class, 'mat-mdc-outlined-button')]");
    private By caseListIconCasesPage = By.xpath("(//span[contains(@class, 'mat-mdc-button-touch-target')])[3]");
    private By getListOfCardsOnCasesPage = By.xpath("//span[@class='db_cardheading header-title']");
    
  
    
    

    
 // methods for Case Module elements
    public String getCasesTextonCasesPage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement casesTextElement = wait.until(ExpectedConditions.visibilityOfElementLocated(casesText));
       
        return casesTextElement.getText();
        
        
    }

    public void enterSearchTextCasesPage(String searchText) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement searchTextBarElement = wait.until(ExpectedConditions.visibilityOfElementLocated(searchTextBar));
        searchTextBarElement.sendKeys(searchText);
    }

    public void clickViewDetailsButtonCasesPage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement viewDetailsButtonElement = wait.until(ExpectedConditions.elementToBeClickable(viewDetailsButton));
        viewDetailsButtonElement.click();
    }

    public void clickCaseListIconCasesPage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement caseListIconElement = wait.until(ExpectedConditions.elementToBeClickable(caseListIconCasesPage));
       
        caseListIconElement.click();
       
    }
    
//    public void matchElementsCasePagecards() {
//    	
//    	 String excelFilePath = "C:\\Users\\HP\\Desktop\\CaseManagement.xlsx";
// 		int colNum = 0;
//
// 		List<String> expectedList = new ArrayList<>();
// 		try {
// 			expectedList = ExcelReader.readColumnData(excelFilePath, colNum);
// 			
// 		} catch (IOException e) {
// 			e.printStackTrace();
// 		}
//
// 		List<String> actualList = new ArrayList<>();
// 		for (WebElement item : getListOfCardsOnCasesPage) {
// 			actualList.add(item.getText());
// 		}
// 		System.out.println("actualList : " + actualList);
// 		System.out.println("expectedList : " + expectedList);
// 		if (actualList.equals(expectedList)) {
// 			System.out.println("Dashboard items match the expected list.");
// 		} else {
// 			System.out.println("Dashboard items do not match the expected list.");
// 		}
//    	
//    	
//    	
//      
//    }

  
    
    
 // XPath for Case List Page elements
    private By casesListText = By.xpath("//div[contains(@class, 'text-ellipsis') and contains(@class, 'max-width-very-large') and contains(text(), 'Cases')]");
    private By dashboardIconXpathOnCaseListPage = By.xpath("(//span[contains(@class, 'mat-mdc-button-touch-target')])[3]");
    private By createButtonXpathCaseListPage = By.xpath("(//span[contains(@class, 'mat-mdc-button-touch-target')])[4]");
    
    //***************************************************************************************************
 
    
    
    
    
    // Locators using By
    private By filterButton = By.xpath("(//span[contains(@class, 'mat-mdc-button-touch-target')])[5]");
    private By searchFilterButton = By.id("mat-select-value-151");
    private By priorityButton = By.xpath("//span[contains(@class, 'ng-star-inserted') and contains(text(), 'Priority')]");
    private By priorityHighButton = By.xpath("//span[contains(@class, 'mdc-list-item__primary-text')]//span[contains(@class, 'ng-star-inserted') and text()='High']");
    private By selectButton = By.xpath("//span[@class='margin ng-star-inserted' and text()='Apply']");

    // Methods to interact with elements
    public void clickFilterButton() {
        driver.findElement(filterButton).click();
    }

    public void clickSearchFilterButton() {
        driver.findElement(searchFilterButton).click();
    }

    public void clickPriorityButton() {
        driver.findElement(priorityButton).click();
    }

    public void clickPriorityHighButton() {
        driver.findElement(priorityHighButton).click();
    }

    public void clickSelectButton() {
        driver.findElement(selectButton).click();
    }

    // Method to perform all clicks in sequence (Search filter flow)
    public void searchFilter() throws InterruptedException {
        Thread.sleep(3000);
        clickFilterButton();
        System.out.println("Clicked on filter");
        
//        Thread.sleep(3000);
//        clickSearchFilterButton();
//        System.out.println("Clicked on search filter");
//
//        Thread.sleep(3000);
//        clickPriorityButton();
//        System.out.println("Clicked on priority");
//
//        Thread.sleep(3000);
//        clickPriorityHighButton();
//        System.out.println("Clicked on priority High");
//
//        Thread.sleep(3000);
 clickSelectButton();
        System.out.println("Clicked on select button");
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    /*   

 // Locate the filter element
     @FindBy(xpath = "(//span[@class='mat-mdc-button-touch-target'])[5]")
     private WebElement filterButton;

     // Locate the search filter element
     @FindBy(xpath = "//div[@id='mat-select-value-151']")
     private WebElement searchFilterButton;

     // Locate the priority element
     @FindBy(xpath = "//span[contains(@class, 'ng-star-inserted') and contains(text(), 'Priority')]")
     private WebElement priorityButton;

     // Locate the priority High element
     @FindBy(xpath = "//span[contains(@class, 'mdc-list-item__primary-text')]//span[contains(@class, 'ng-star-inserted') and text()='High']")
     private WebElement priorityHighButton;

     // Locate the select button element
     @FindBy(xpath = "(//span[@class='mat-mdc-button-touch-target'])[55]")
     private WebElement selectButton;



     // Method to click on the filter
     public void clickFilterButton() {
         filterButton.click();
     }

     // Method to click on the search filter
     public void clickSearchFilterButton() {
         searchFilterButton.click();
     }

     // Method to click on the priority filter
     public void clickPriorityButton() {
         priorityButton.click();
     }

     // Method to click on the priority High filter
     public void clickPriorityHighButton() {
         priorityHighButton.click();
     }

     // Method to click on the select button
     public void clickSelectButton() {
         selectButton.click();
     }

     // Method to perform all clicks in sequence (Search filter flow)
     public void searchFilter() throws InterruptedException {
    	 Thread.sleep(3000);
         clickFilterButton();
         System.out.println("Click on filter ");
         Thread.sleep(3000);
         clickSearchFilterButton();
         System.out.println("Click on search filter filter ");
       
         Thread.sleep(3000);
         clickPriorityButton();
         Thread.sleep(3000);
         clickPriorityHighButton();
         Thread.sleep(3000);
         clickSelectButton();
     }

    */
    
    //********************************************************************************************
    
    
    
    
    
    
    
    
    

    // Methods for Case List Page elements
    public String getCasesListTextonCaseListPage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement casesListElement = wait.until(ExpectedConditions.visibilityOfElementLocated(casesListText));
        
        return casesListElement.getText();
        
        
    }

    public void clickDashboardIconOnCaseListPage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement dashboardIconElement = wait.until(ExpectedConditions.elementToBeClickable(dashboardIconXpathOnCaseListPage));
       
        dashboardIconElement.click();
        
    }

    public void clickCreateButtonOnCaseListPage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement createButtonElement = wait.until(ExpectedConditions.elementToBeClickable(createButtonXpathCaseListPage));
       
        
        createButtonElement.click();
      
    }

    
    
    
    // XPath for Case Detail Page elements
    private By caseIdText = By.xpath("//span[@class='common-lavender-chip']");
 // methods for Case Detail Page elements
    public String getCaseIdTextOnCaseDetailPage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement caseIdElement = wait.until(ExpectedConditions.elementToBeClickable(caseIdText));
        return caseIdElement.getText();
    }

    
    
    
    // XPath for Completed Case Page elements
    private By completedCaseIText = By.xpath("//div[contains(@style, 'font-size') and contains(text(), 'Completed cases')]");
    private By GISIconOnCompletedCasePage = By.xpath("(//span[contains(@class, 'mat-mdc-button-touch-target')])[4]");
    private By CaseListIconOnCompletedCasePage = By.xpath("(//span[contains(@class, 'mat-mdc-button-touch-target')])[5]");
    private By DashboardIconOnCompletedCasePage = By.xpath("(//span[contains(@class, 'mat-mdc-button-touch-target')])[3]");
    
 // methods for Completed Case Page elements
    public String getCompletedCaseTextOnCompletedCasePage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement completedCaseElement = wait.until(ExpectedConditions.visibilityOfElementLocated(completedCaseIText));
        return completedCaseElement.getText();
    }

    public void clickGisIconOnCompletedCasePage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement createButtonElement = wait.until(ExpectedConditions.elementToBeClickable(GISIconOnCompletedCasePage));
       
        
        createButtonElement.click();
      
    }
    
    
    public void clickCaseListIconOnCompletedCasePage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement createButtonElement = wait.until(ExpectedConditions.elementToBeClickable(CaseListIconOnCompletedCasePage));
       
        
        createButtonElement.click();
      
    }
    
    
    public void clickDashboardIconOnCompletedCasePage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement createButtonElement = wait.until(ExpectedConditions.elementToBeClickable(DashboardIconOnCompletedCasePage));
       
        
        createButtonElement.click();
      
    }
    
    
    
    
    
    
    
    // XPath for GIS Page elements
    private By gisActiveCasesText = By.xpath("//div[contains(text(), 'GIS (Active cases)')]");
    private By caseListIcon = By.xpath("(//span[contains(@class, 'mat-mdc-button-touch-target')])[7]");
    private By completedCaseIcon = By.xpath("(//span[contains(@class, 'mat-mdc-button-touch-target')])[6]");
    private By activeCaseIcon = By.xpath("(//span[contains(@class, 'mat-mdc-button-touch-target')])[8]");
    private By searchBoxonGIS = By.xpath("//input[@placeholder='Search geography']");
    private By ClickSearchonGis = By.xpath("(//span[@class='mat-mdc-button-touch-target'])[3]");
    
    
    
    
    
    // methods for GIS Page elements
    public String getGisActiveCasesTextOnGISPage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement gisActiveCasesTextElement = wait.until(ExpectedConditions.visibilityOfElementLocated(gisActiveCasesText));
        return gisActiveCasesTextElement.getText();
    }
    
    
    
    public void searchRegion() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement SearchboxElement = wait.until(ExpectedConditions.elementToBeClickable(searchBoxonGIS));
        WebElement serachiconElement = wait.until(ExpectedConditions.elementToBeClickable(ClickSearchonGis));
        
        Thread.sleep(3000);
        SearchboxElement.sendKeys("Indore");
        Thread.sleep(3000);
        serachiconElement.click();
        
    }
    
    
    
    
    
    

    public void clickCaseListIconOnGISPage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement caseListIconElement = wait.until(ExpectedConditions.elementToBeClickable(caseListIcon));
        caseListIconElement.click();
    }

    public void clickCompletedCaseIconOnGISPage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement completedCaseIconElement = wait.until(ExpectedConditions.elementToBeClickable(completedCaseIcon));
        completedCaseIconElement.click();
    }

    public void clickActiveCaseIconOnGISPage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement activeCaseIconElement = wait.until(ExpectedConditions.elementToBeClickable(activeCaseIcon));
        activeCaseIconElement.click();
    }
}
