package org.example.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactory {

    public static WebDriver createWebDriver(String os, String browser) throws Exception {
        WebDriver driver;
        if (os.equals("windows 10")) {
            driver = createDriverForWindows(browser);
        } else {
            throw new Exception("El sistema operativo " + os + " no es soportado");
        }
        return driver;
    }

    private static WebDriver createDriverForWindows(String browser) throws Exception {
        if (browser.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", "resources/Windows/chromedriver.exe");
            return new ChromeDriver();
        }
        throw new Exception("El navegador " + browser + " no es soportado");
    }


}
