package org.example.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PayServicePage extends BasePage {

    protected By ServiceSelect = By.xpath("//*[@id=\"mat-select-0\"]");
    protected By ServiceSelectOption = By.xpath("//*[@id=\"mat-option-0\"]Ini");
    protected By QrOption = By.id("mat-radio-3");

    protected By PayButton = By.xpath("/html/body/app-root/app-layout/div/mat-sidenav-container/mat-sidenav-content/main/app-debt-payment/div/div/form/div[3]/mat-card[2]/mat-card-content/div/div/div/div/div[2]/button");

    protected By QRImage = By.xpath("/html/body/div[3]/div[2]/div/mat-dialog-container/app-qr-payment/div[1]/div[2]/div/img");

    protected By DownloadButton = By.xpath("//*[@id=\"mat-dialog-0\"]/app-qr-payment/div[2]/div/button");

    protected By CloseButton = By.xpath("//*[@id=\"mat-dialog-0\"]/app-qr-payment/div[2]/div/input");

    public PayServicePage(WebDriver driver) {
        super(driver);
    }

    public void clickOnServiceSelect() throws InterruptedException {

        System.out.println("Click on ServiceSelect 1");
        Thread.sleep(4000);

        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(ServiceSelect));
        driver.findElement(ServiceSelect).click();

        System.out.println("Click on ServiceSelect 2");
        Thread.sleep(4000);
        System.out.println("Click on ServiceSelect 3");
    }

    public void clickOnServiceSelectOption() {
        System.out.println("Click on ServiceSelectOption 1");
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(ServiceSelectOption));
        driver.findElement(ServiceSelectOption).click();
        System.out.println("Click on ServiceSelectOption 2");

    }

    public void clickOnQrOption() {
        driver.findElement(QrOption).click();
    }

    public void clickOnPayButton() {
        driver.findElement(PayButton).click();
    }

    public void clickOnDownloadButton() {
        driver.findElement(DownloadButton).click();
    }

    public void clickOnCloseButton() {
        driver.findElement(CloseButton).click();
    }

    public boolean QRImageIsDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(QRImage));
        return driver.findElement(QRImage).isDisplayed();
    }


}
