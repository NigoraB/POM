package DriverPkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverWrapper {

    private static WebDriver driver;

    public void initDriver() {
        System.setProperty("webdriver.chrome.driver", "./driverExec/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://clubs3qa1.scholastic.com/");
    }

    public void quitDriver() {
        driver.quit();
    }

    public static WebDriver getDriver() {
        return driver;
    }


}
