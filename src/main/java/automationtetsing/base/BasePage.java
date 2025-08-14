package automationtetsing.base;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

	private WebDriver driver;
	private WebDriverWait explictWait;
	
	public BasePage(WebDriver driver) {
		this.driver = driver;
		this.explictWait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Default wait time of 10 seconds
		PageFactory.initElements(driver, this); // Initialize PageFactory elements
	
	}
	protected WebDriver getDriver() {
		return driver;
	}
//	protected void enterText(WebElement element, String text) {
//	try {
//		explictWait.until(ExpectedConditions.visibilityOf(element));
//		element.clear();
//		element.sendKeys(text);
//	}catch (Exception e) {
//		System.out.println("Element not interactable: " + element.toString());
//		System.out.println("Element not interactable: " + e.getMessage());
//		throw  new RuntimeException("Element not interactable: " + e.getMessage());
//	}
//	}
	public void enterText(WebElement element, String text) {
	    element.clear();
	    element.sendKeys(text);
	}
	protected void enterText(By by, String text) {
		try {
		WebElement element=	explictWait.until(ExpectedConditions.visibilityOfElementLocated(by));
			element.clear();
			element.sendKeys(text);
		}catch (Exception e) {
			System.out.println("Element not interactable: " + by.toString());
			System.out.println("Element not interactable: " + e.getMessage());
			throw  new RuntimeException("Element not interactable: " + e.getMessage());
		}
	}
		protected void click(WebElement element, String text) {
			try {
				explictWait.until(ExpectedConditions.visibilityOf(element));
				element.click();
			}catch (Exception e) {
				System.out.println("Element not interactable: " + element.toString());
				System.out.println("Element not interactable: " + e.getMessage());
				throw  new RuntimeException("Element not interactable: " + e.getMessage());
			}
		}
//		protected void click(By by) {
//			try {
//				WebElement element =explictWait.until(ExpectedConditions.elementToBeClickable(by));
//				element.click();
//			}catch (Exception e) {
//				System.out.println("Element not interactable: " + by.toString());
//				System.out.println("Element not interactable: " + e.getMessage());
//				throw  new RuntimeException("Element not interactable: " + e.getMessage());
//			}
//		}
		public void click(WebElement element) {
		    element.click();
		}
}





















