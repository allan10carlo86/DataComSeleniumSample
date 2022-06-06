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
import DataObjects.PageObject_Payments;
import DataObjects.WebDriverClass;

public class TESTCASE5_Payments extends WebDriverClass{

	WebDriver driver;
	WebDriverWait wait;
	Actions actions;
	PageObject_Home homePage;
	PageObject_Payments paymentsPage;
	
	@Before
	public void before() throws IOException {
		this.driver = super.initializeWebDriver(this.driver);
		this.wait = super.initializeWebDriverWait(this.driver);
		this.actions = super.initializeActions(this.driver);
		super.openWindow(this.driver, super.getValueFromExcel("01_URL", "URL", "login"));
		homePage = new PageObject_Home();
		paymentsPage = new PageObject_Payments();
	}
	
	@Test
	public void main() throws InterruptedException, IOException {
		this.homePage.navigateToPayments(this.driver, this.wait);
		double dbl_amount = Double.parseDouble(getValueFromExcel("03_AMOUNT", "AMOUNT", "TEST_CASE_5"));
		this.paymentsPage.payOrTransfer(this.driver, this.wait, dbl_amount);
	}
	
	@After
	public void close() 
	{
		super.closeWindow(this.driver);
	}
}

