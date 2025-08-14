package automationtetsing.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import automationtetsing.base.BasePage;
import automationtetsing.exception.VerificationFailedException;

public class LoginPage extends BasePage{

	public LoginPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "username")
	public WebElement usernameTextBx;

	@FindBy(name = "password")
	public WebElement passwordTextBx;
	
	//@FindBy(className="oranehrm-login-button")
	@FindBy(xpath = "//button[@type='submit']")
	public WebElement loginBtn;
	
	public void verifyLogin() {
        try {
            enterText(usernameTextBx, "Admin");
            enterText(passwordTextBx, "admin123");
        	click(loginBtn);
        } catch (Exception e) {
            System.out.println("Login failed: " + e.getMessage());
        
            throw new VerificationFailedException("Login failed: " + e.getMessage());
        }
		
		 
		}
	}
































