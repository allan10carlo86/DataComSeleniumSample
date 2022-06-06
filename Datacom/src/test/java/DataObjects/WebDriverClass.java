package DataObjects;

import java.io.IOException;
import org.apache.poi.ss.usermodel.Sheet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import FileReader.FileReader2;

public class WebDriverClass {

		public WebDriver initializeWebDriver(WebDriver driver) {
			System.setProperty("webdriver.chrome.driver", "files/101/chromedriver");
			driver = new ChromeDriver();
			return driver;
		}
		
		public WebDriverWait initializeWebDriverWait(WebDriver driver) {
			return new WebDriverWait(driver, 10000);	
		}
		
		public Actions initializeActions(WebDriver driver) {
			return new Actions(driver);	
		}
		
		public void closeWindow(WebDriver driver) {
			driver.close();
		}
		
		public void openWindow(WebDriver driver, String url) {
			driver.get(url);
		}
		
		public String getValueFromExcel(String sheetOfValue, String column, String testCase) throws IOException {
			FileReader2 fileReader = new FileReader2();
			Sheet sheet = fileReader.readExcel("datafile/", "datafile.xlsx", sheetOfValue);
			int intColumn = fileReader.getColumnNum(sheet, column);
			int intRow = fileReader.getRowNum(sheet, testCase);
			return fileReader.returnValue(sheet, intColumn, intRow);
		}
}
