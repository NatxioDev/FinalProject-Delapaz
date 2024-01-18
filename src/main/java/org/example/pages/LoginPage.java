package org.example.pages;

import lombok.Getter;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage {

    private By usernameField = By.id("mat-input-0");
    private By passwordField = By.id("mat-input-1");
    private By loginButton = By.xpath("/html/body/app-root/app-login/body/div/div/div/div[1]/div[2]/div/form/button[1]");

    private By alertText = By.xpath("/html/body/div[2]/div/div[2]/div");

    private By alertButton = By.xpath("/html/body/div[2]/div/div[3]/button[1]");

    @Getter
    public String errorText;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void fillUsername(String username) {
        driver.findElement(usernameField).sendKeys(username);
    }

    public void fillPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickOnLoginButton() {
        driver.findElement(loginButton).click();
    }

    public void clickOnAlertButton() {
        driver.findElement(alertButton).click();
    }



    public void loginWithCredentials(String username, String password) {
        fillUsername(username);
        fillPassword(password);
        clickOnLoginButton();

        try {
            WebDriverWait wait = new WebDriverWait(driver, 1);
            wait.until(ExpectedConditions.visibilityOfElementLocated(alertText));

            errorText = driver.findElement(alertText).getText();

            System.out.println("Texto del alerta: " + errorText);

            clickOnAlertButton();


        } catch (NoAlertPresentException e) {
            System.out.println("No se detectó un alerta en la página.");
        } catch (TimeoutException e) {
            System.out.println("No se detectó un alerta en la página");
        }
    }

}
