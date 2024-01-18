package org.example.pages;

import org.openqa.selenium.By;

public class AddServicePage extends BasePage {

    protected By ServiceNumberInput = By.xpath("//*[@id=\"mat-input-10\"]");

    protected By SearchButton = By.xpath("/html/body/app-root/app-layout/div/mat-sidenav-container/mat-sidenav-content/main/app-register-service/div/div/div/form/mat-card/mat-card-content/div[1]/div[3]/button");

    protected By AliasInput = By.xpath("//*[@id=\"mat-input-19\"]");

    protected By AddButton = By.xpath("/html/body/app-root/app-layout/div/mat-sidenav-container/mat-sidenav-content/main/app-register-service/div/div/div/form/mat-card/mat-card-actions/div[2]/div[1]/button");

    protected By ConfirmButton = By.xpath("/html/body/app-root/app-layout/div/mat-sidenav-container/mat-sidenav-content/main/app-register-service/div/div/div/form/mat-card/mat-card-actions/div[2]/div[1]/button");

    protected By TextAlert = By.xpath("//*[@id=\"swal2-title\"]");

    protected By OkButton = By.xpath("/html/body/div/div/div[3]/button[1]");

    public AddServicePage(org.openqa.selenium.WebDriver driver) {
        super(driver);
    }

    public void clickOnServiceNumberInput() {
        driver.findElement(ServiceNumberInput).click();
    }

    public void clickOnSearchButton() {
        driver.findElement(SearchButton).click();
    }

    public void clickOnAliasInput() {
        driver.findElement(AliasInput).click();
    }

    public void clickOnAddButton() {
        driver.findElement(AddButton).click();
    }

    public void clickOnConfirmButton() {
        driver.findElement(ConfirmButton).click();
    }

    public void clickOnOkButton() {
        driver.findElement(OkButton).click();
    }

    public String getTextAlert() {
        return driver.findElement(TextAlert).getText();
    }

    public void     fillServiceNumberInput(String serviceNumber) {
        driver.findElement(ServiceNumberInput).sendKeys(serviceNumber);
    }

    public void fillAliasInput(String alias) {
        driver.findElement(AliasInput).sendKeys(alias);
    }

    public void addService(String serviceNumber, String alias) throws InterruptedException {
        Thread.sleep(2000);
        clickOnServiceNumberInput();
        Thread.sleep(2000);
        fillServiceNumberInput(serviceNumber);
        Thread.sleep(2000);
        clickOnSearchButton();
        Thread.sleep(2000);
        fillAliasInput(alias);
        Thread.sleep(2000);
        clickOnAddButton();
        Thread.sleep(2000);
        clickOnConfirmButton();
        Thread.sleep(2000);

    }
}
