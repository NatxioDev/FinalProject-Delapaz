package removeService;

import conf.BaseTest;
import org.example.pages.LateralMenu;
import org.example.pages.LoginPage;
import org.example.pages.RemoveServicePage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RemoveServiceTest extends BaseTest {

    @BeforeMethod
    public void setUpRemoveService() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginWithCredentials(getUser(), getPassword());

        LateralMenu lateralMenu = new LateralMenu(driver);
        lateralMenu.clickOnRemoveServicesButton();
    }

    @Test(description = "Remove a service", enabled = true)
    public void removeService() {
        RemoveServicePage removeServicePage = new RemoveServicePage(driver);

        removeServicePage.clickOnRemoveServiceButton();
        removeServicePage.clickOnConfirmRemoveServiceButton();

        Assert.assertEquals(removeServicePage.getTextAlert(), "El servicio se ha desvinculado correctamente");

    }

    @AfterMethod
    public void afterRemoveService() {
        RemoveServicePage removeServicePage = new RemoveServicePage(driver);
        removeServicePage.clickOnOkButton();
    }
}
