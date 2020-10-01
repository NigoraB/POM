package DriverPkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class DriverWrapper {

    private static WebDriver driver;

    public void initDriver() {
        System.setProperty("webdriver.chrome.driver", "./driverExec/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // driver.get("https://clubs3qa1.scholastic.com/");
        driver.get("https://www.hotels.com/");

    }

    public void quitDriver() {
        driver.quit();
    }

    public static WebDriver getDriver() {
        return driver;
    }


}
