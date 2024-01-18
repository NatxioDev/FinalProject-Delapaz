package org.example.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyServicesPage extends BasePage {


    private static final Logger log = LogManager.getLogger(MyServicesPage.class);

    private By LogOutButton = By.xpath("/html/body/app-root/app-layout/div/app-top-nav/mat-toolbar/button[2]");
    public MyServicesPage(WebDriver driver) {
        super(driver);
    }

    public boolean logOutBtnIsDisplayed() {


        log.info("Log out button is displayed before wait: " + driver.findElement(LogOutButton).isDisplayed());
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(LogOutButton));

        log.info("Log out button is displayed after wait: " + driver.findElement(LogOutButton).isDisplayed());

        return driver.findElement(LogOutButton).isDisplayed();
    }


}
