package addService;

import conf.BaseTest;
import org.example.pages.AddServicePage;
import org.example.pages.LateralMenu;
import org.example.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddServiceTest extends BaseTest {

    @BeforeMethod
    public void setUpAddService() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginWithCredentials(getUser(), getPassword());

        LateralMenu lateralMenu = new LateralMenu(driver);
        lateralMenu.clickOnRegisterServicesButton();
    }

    @Test(description = "Register a service", enabled = true)
    public void addService() throws InterruptedException {
        System.out.println("Remove a service");

    }

    @AfterMethod
    public void afterAddService() {
        AddServicePage addServicePage = new AddServicePage(driver);
        addServicePage.clickOnOkButton();
    }
}
