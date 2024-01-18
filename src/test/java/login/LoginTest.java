package login;

import com.aventstack.extentreports.Status;
import conf.BaseTest;
import org.example.helpers.ScreenShotHelper;
import org.example.pages.LoginPage;
import org.example.pages.MyServicesPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class LoginTest extends BaseTest {

    @Test(description = "Login with valid credentials")
    public void LoginCorrect() throws IOException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginWithCredentials(getUser(), getPassword());

        MyServicesPage myServicesPage = new MyServicesPage(driver);

        Assert.assertTrue(myServicesPage.logOutBtnIsDisplayed());
        ScreenShotHelper.takeScreenShotAndAdToHTMLReport(driver, Status.INFO, "Login correct");
    }

    @Test(description = "Login with bad credentials")
    public void LoginIncorrect() throws IOException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginWithCredentials("badUser", "badPassword");

        Assert.assertEquals(loginPage.getErrorText(), "El usuario y/o contraseña no son correctos");
        ScreenShotHelper.takeScreenShotAndAdToHTMLReport(driver, Status.INFO, "Login incorrect");
    }


}
