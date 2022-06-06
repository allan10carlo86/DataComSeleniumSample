package DataObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageObject_Home{
	By menu_hamburger = By.xpath("//button//span[contains(text(),'Menu')]");
	By menu_payees = By.xpath("//a//span[contains(text(), 'Payees')]");
	By menu_payOrTransfer = By.xpath("//button//span[text()='Pay or transfer']");
	
	public void navigateToPayees(WebDriver driver, WebDriverWait wait) {
		wait.until(ExpectedConditions.elementToBeClickable(menu_hamburger));
		driver.findElement(menu_hamburger).click();
		wait.until(ExpectedConditions.elementToBeClickable(menu_payees));
		driver.findElement(menu_payees).click();

	}
	
	public void navigateToPayments(WebDriver driver, WebDriverWait wait) {
		wait.until(ExpectedConditions.elementToBeClickable(menu_hamburger));
		driver.findElement(menu_hamburger).click();
		wait.until(ExpectedConditions.elementToBeClickable(menu_payOrTransfer));
		driver.findElement(menu_payOrTransfer).click();
	}
}
