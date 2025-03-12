package pages;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class verification_page extends StartupPage {

//	TC-1 to 4 Locators
	public By getUsernameTextfieldLocator = null;
	public By getUsernameTextboxLocator = null;
	public By getPasswordTextboxLocator = null;
	public By getSignInButtonLocator = null;
	public By getVerificationLocator = null;
//	TC-5 Locators
	public By getPageBarFixedLocator = null;
	public By getSubNavTabLocator = null;
//	TC-6 Locators
	public By getActualRequestedOnDates = null;
//	TC-7 Locators
	public By favouriteOrStarIcon = null;
//	TC-8 LOcators
	public By calendarFromDropdown = null;
	public By calendarToDropdown = null;
	public By getOkButtonLocator = null;
	public By getStarIconLocator = null;

	public verification_page(WebDriver driver) {
		super(driver);
	}

	/**
	 * @Test1.1 about this method loginTohealthAppByGivenValidCredetial()
	 * 
	 * @param : Map<String, String>
	 * @description : fill usernameTextbox & passwordTextbox and click on sign in
	 *              button
	 * @return : Boolean
	 * @author : Yaksha
	 */
	public boolean loginToHealthAppByGivenValidCredetial(Map<String, String> expectedData) throws Exception {
		
		return false;
	}

	/**
	 * @Test1.2 about this method scrollDownAndClickVerificationTab()
	 * 
	 * @param : null
	 * @description : verify the pharmacy tab, scroll to it, and click it
	 * @return : String
	 * @author : YAKSHA
	 */
	public void scrollDownAndClickVerificationTab() throws Exception {
		
	}

	/**
	 * @Test1.3 about this method verifyVerificationPageUrl()
	 * 
	 * @param : null
	 * @description : verify verification page url
	 * @return : String
	 * @author : YAKSHA
	 */
	public String verifyVerificationPageUrl() throws Exception {
		return null;
	}

	/**
	 * @Test2 about this method highlightAndVerifyWhetherElementIsDisplayed
	 * 
	 * @param element : By - Locator of the element to be highlighted and verified
	 * @description : This method verifies whether an element is displayed on the
	 *              page, highlights it if displayed, and returns true if displayed.
	 * @return : boolean - true if the element is displayed, otherwise false
	 * @author : YAKSHA
	 */
	public boolean verifyVerificationSubModules(By element) {
		
		return false;
	}

	/**
	 * @Test3 about this method highlightAndClickOnElement
	 * 
	 * @param element     : By - Locator of the element to be highlighted and
	 *                    clicked
	 * @param elementName : String - Name of the element to be clicked (used for
	 *                    logging purposes)
	 * @description : This method highlights the element and clicks on it. It
	 *              returns true if the element is clicked successfully.
	 * @return : boolean - true if the element is clicked successfully, otherwise
	 *         false
	 * @author : YAKSHA
	 */
	public boolean verifyInventoryTabsAndButtonsAreDisplayed(By element) {
		
		
		return false;
	}

	/**
	 * @Test4 about this method verifySelectedTabIsActiveOrNot()
	 * @param : element - the locator of the tab to be verified
	 * @description : This method verifies if the specified tab is displayed, clicks
	 *              it, and returns whether its "class" attribute contains "active".
	 *              This can be used to determine if the tab is active based on its
	 *              class attributes.
	 * @return : boolean - true if the "class" attribute of the tab contains
	 *         "active", false otherwise
	 * @throws : Exception - if there is an issue locating, highlighting, clicking
	 *           the tab, or getting its attribute
	 * @author : YAKSHA
	 */
	public boolean verifyPharmacyTabIsActiveOrNot(By element) throws Exception {
		
		return false;
	}

	/**
	 * @Test5 about this method verifyNavigationOfTabs()
	 * @param : element - the locator of the tab to be verified
	 * @description : This method verifies if the specified tab is displayed, clicks
	 *              it, and returns whether its "class" attribute contains "active".
	 *              This can be used to determine if the tab is active based on its
	 *              class attributes. It also navigates through "Inventory" and
	 *              "Requisition" tabs before verifying the "Purchase Request" tab.
	 * @return : boolean - true if the "class" attribute of the tab contains
	 *         "active", false otherwise
	 * @throws : Exception - if there is an issue locating, highlighting, clicking
	 *           the tab, or getting its attribute
	 * @author : YAKSHA
	 */
	public boolean verifyNavigationOfTabs() throws Exception {
				return false;
	}

	/**
	 * @Test6 about this method
	 *        verifyTheResultsDateRangeIsWithinTheSelectedRange()
	 * 
	 * @param : String, String - from date - to date
	 * @description : This method verifies whether the "Requested On" dates for all
	 *              the result requisitions are within the specified date range.
	 * @return : boolean - true if the actual dates fall within the specified date
	 *         and false if they don't.
	 * @throws : Exception - if there is an issue finding the actual data
	 * @author : YAKSHA
	 */
	public boolean verifyTheResultsDateRangeIsWithinTheSelectedRange(String fromDate, String toDate) throws Exception {
					return false;

		
	}

	/**
	 * @Test7 about this method verifyToolTipText()
	 * @param : null
	 * @description : Verify the text of the tooltip
	 * @return : String
	 * @throws : Exception - if there is an issue finding the text
	 * @author : YAKSHA
	 */
	public String verifyToolTipText() {
		
		return null;
	}

	/**
	 * @Test8 about this method verifyDatesAreRememberedCorrectly()
	 * 
	 * @param fromDate - the expected "from" date in the format "dd-MM-yyyy"
	 * @param toDate   - the expected "to" date in the format "dd-MM-yyyy"
	 * @description : This method selects the "from" and "to" dates in the calendar,
	 *              clicks the OK button, navigates away to another tab, returns to
	 *              the original tab, and verifies if the dates are remembered
	 *              correctly.
	 * @return : boolean - true if the dates are remembered correctly, false
	 *         otherwise
	 * @throws : Exception - if there is an issue locating, highlighting, or
	 *           clicking elements, or if there is an issue with date selection or
	 *           verification
	 * @author : YAKSHA
	 * @throws Exception
	 */
	public boolean verifyDatesAreRememberedCorrectly(String fromDate, String toDate) throws Exception {
		
		return false;
	}


}
