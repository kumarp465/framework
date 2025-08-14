package automationtetsing.tests;

import org.testng.annotations.Test;

import automationtetsing.base.BaseTest;
import automationtetsing.pages.LoginPage;

public class LoginTest extends BaseTest {
	
	@Test
	public void loginTest() {
		LoginPage loginPage = new LoginPage(getDriver());
		getDriver().get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		loginPage.verifyLogin();
	}

}














