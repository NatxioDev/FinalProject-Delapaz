package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LateralMenu extends BasePage {

    protected By PayServicesButton = By.xpath("/html/body/app-root/app-layout/div/mat-sidenav-container/mat-sidenav/div/app-side-nav/mat-nav-list/a[2]");
    protected By RegisterServicesButton = By.xpath("/html/body/app-root/app-layout/div/mat-sidenav-container/mat-sidenav/div/app-side-nav/mat-nav-list/a[3]");
    protected By RemoveServicesButton = By.xpath("/html/body/app-root/app-layout/div/mat-sidenav-container/mat-sidenav/div/app-side-nav/mat-nav-list/a[4]");


    public LateralMenu(WebDriver driver) {
        super(driver);
    }


    public void clickOnPayServicesButton() {
        driver.findElement(PayServicesButton).click();
    }

    public void clickOnRegisterServicesButton() {
        driver.findElement(RegisterServicesButton).click();
    }

    public void clickOnRemoveServicesButton() {
        driver.findElement(RemoveServicesButton).click();
    }
}
