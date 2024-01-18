package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RemoveServicePage extends BasePage{

    protected By RemoveServiceButton = By.xpath("/html/body/app-root/app-layout/div/mat-sidenav-container/mat-sidenav-content/main/app-unlink-services/div/div/p-table/div/div[2]/table/tbody/tr[1]/td[4]/button");

    protected By ConfirmRemoveServiceButton = By.xpath("/html/body/div[2]/div/div[3]/button[1]");

    protected By TextAlert = By.xpath("//*[@id=\"swal2-content\"]");

    protected By OkButton = By.xpath("/html/body/div[2]/div/div[3]/button[1]");
    public RemoveServicePage(WebDriver driver) {
        super(driver);
    }

    public void clickOnRemoveServiceButton() {
        driver.findElement(RemoveServiceButton).click();
    }

    public void clickOnConfirmRemoveServiceButton() {
        driver.findElement(ConfirmRemoveServiceButton).click();
    }

    public void clickOnOkButton() {
        driver.findElement(OkButton).click();
    }
    public String getTextAlert() {
        return driver.findElement(TextAlert).getText();
    }
}
