package pages;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import common.SeleniumAction;
import utils.ExcelReader;
import utils.WaitTime;

public class TrialManagement extends SeleniumAction {

	protected WebDriver driver;
	WebDriverWait wait;

	// Constructor to initialize elements using the provided WebDriver
	public TrialManagement(WebDriver driver) {
		super(driver); // Explicitly call the parent class constructor
		this.driver = driver;
		PageFactory.initElements(driver, this); // Initialize PageFactory
	}

	@FindBy(xpath = "//span[@class='db_minicard_heading']")
	List<WebElement> getHomePageComponentList;

	public void printHomePageComponentList() {
		// Wait for all elements in the list to be visible
		waitForVisibilityOfAllElements(getHomePageComponentList);

		String excelFilePath = "D:\\Automation Excel\\TrialManagement.xlsx";
		int colNum = 0;

		List<String> expectedList = new ArrayList<>();
		try {
			expectedList = ExcelReader.readColumnData(excelFilePath, colNum);
		} catch (IOException e) {
			e.printStackTrace();
		}

		List<String> actualList = new ArrayList<>();

		for (WebElement element : getHomePageComponentList) {
			actualList.add(element.getText().trim());
			System.out.println("Home Page Component: " + element.getText());
		}

		System.out.println("actualList : " + actualList);
		System.out.println("expectedList : " + expectedList);

		if (actualList.equals(expectedList)) {
			System.out.println("Dashboard items match the expected list.");
		} else {
			System.out.println("Dashboard items do not match the expected list.");
		}
	}

	@FindBy(xpath = "//em[contains(@class, 'po-workorder-create') and contains(@class, 'custom-icon')]")
	WebElement clickOnWorkOrderPage;

	public void clickOnWorkOrderPage() throws InterruptedException {
		waitForElementToBeClickable(clickOnWorkOrderPage);
		clickOnWorkOrderPage.click();
	}

	@FindBy(xpath = "(//span[@class='mat-mdc-button-touch-target'])[3]")
	WebElement clickOnRefreshButton;

	public void clickOnRefreshButton() throws InterruptedException {
		waitForElementToBeClickable(clickOnRefreshButton);
		clickOnRefreshButton.click();
		System.out.println("refresh button");
	}

	@FindBy(xpath = "(//span[@class='mat-mdc-button-touch-target'])[6]")
	WebElement clickOnTrialWorkorderFilterIcon;

	@FindBy(xpath = "(//div[contains(@id,'mat-select-value')])[1]")
	WebElement clickOnSelectFilter;

	@FindBy(xpath = "//span[contains(@class, 'ng-star-inserted') and text()='Domain']")
	WebElement selectFilterValue;

	@FindBy(xpath = "(//span[contains(text(),'Domain')])[2]")
	WebElement clickOnStatus;

	@FindBy(xpath = "//span[contains(@class, 'ng-star-inserted') and text()='RAN']")
	WebElement selectStatusValue;

	@FindBy(xpath = "(//span[@class='mat-mdc-button-touch-target'])[22]")
	WebElement clickOnFilterSubmit;

	public void checkTrialWorkorderFilter() throws InterruptedException {
		waitForElementToBeClickable(clickOnTrialWorkorderFilterIcon);
		clickOnTrialWorkorderFilterIcon.click();
		waitForElementToBeClickable(clickOnSelectFilter);
		clickOnSelectFilter.click();
		waitForElementToBeClickable(selectFilterValue);
		selectFilterValue.click();
		waitForElementToBeClickable(clickOnStatus);
		clickOnStatus.click();
		waitForElementToBeClickable(selectStatusValue);
		selectStatusValue.click();
		waitForElementToBeClickable(clickOnFilterSubmit);
		clickOnFilterSubmit.click();
	}
	
	@FindBy(xpath = "(//span[@class='mat-mdc-button-touch-target'])[7]")
	WebElement clickOnTableOption;
	
	@FindBy(xpath = "(//span[@class='mat-mdc-button-touch-target'])[28]")
	WebElement clickOnTableOptionSaveButton;
	
	public void validateTableOption() {
		waitForElementToBeClickable(clickOnTableOption);
		clickOnTableOption.click();
		waitForElementToBeClickable(clickOnTableOptionSaveButton);
		clickOnTableOptionSaveButton.click();
	}

}
