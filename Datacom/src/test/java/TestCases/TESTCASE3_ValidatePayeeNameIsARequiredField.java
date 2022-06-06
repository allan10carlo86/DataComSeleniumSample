package TestCases;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import DataObjects.PageObject_Home;
import DataObjects.PageObject_Payees;
import DataObjects.WebDriverClass;

public class TESTCASE3_ValidatePayeeNameIsARequiredField extends WebDriverClass{

	WebDriver driver;
	WebDriverWait wait;
	Actions actions;
	PageObject_Home homePage;
	PageObject_Payees payeesPage;
	
	@Before
	public void before() throws IOException {
		this.driver = super.initializeWebDriver(this.driver);
		this.wait = super.initializeWebDriverWait(this.driver);
		this.actions = super.initializeActions(this.driver);
		super.openWindow(this.driver, super.getValueFromExcel("01_URL", "URL", "login"));
		homePage = new PageObject_Home();
		payeesPage = new PageObject_Payees();
	}
	
	@Test
	public void main() throws InterruptedException, IOException {
		homePage.navigateToPayees(this.driver, this.wait);
		payeesPage.validatePayeesPage(this.driver, this.wait);
		String STR_NAME = getValueFromExcel("02_PAYEE", "NAME","TEST_CASE_3");
		payeesPage.validatePayeeTextBox(this.driver,this.wait,this.actions, STR_NAME);
	}
	
	@After
	public void close() 
	{
		super.closeWindow(this.driver);
	}
}

