package payService;

import conf.BaseTest;
import org.example.pages.LateralMenu;
import org.example.pages.LoginPage;
import org.example.pages.PayServicePage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class PayServiceTest extends BaseTest {

    @BeforeMethod
    public void setUpPayService() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginWithCredentials(getUser(), getPassword());
        LateralMenu lateralMenu = new LateralMenu(driver);
        lateralMenu.clickOnPayServicesButton();
    }

    @Test(description = "Select and pay a service", enabled = true)
    public void payService() throws InterruptedException {
        PayServicePage payServicePage = new PayServicePage(driver);
        payServicePage.clickOnServiceSelect();
        payServicePage.clickOnServiceSelectOption();
        payServicePage.clickOnQrOption();
        payServicePage.clickOnPayButton();
        Assert.assertTrue(payServicePage.QRImageIsDisplayed());

    }

    @AfterMethod
    public void afterPayService() {
        PayServicePage payServicePage = new PayServicePage(driver);
        payServicePage.clickOnDownloadButton();
        payServicePage.clickOnCloseButton();
    }
}
