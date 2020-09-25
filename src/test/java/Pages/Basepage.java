package Pages;

import DriverPkg.DriverWrapper;
import org.openqa.selenium.By;

public class Basepage {

    public void type(By locator, String data) {
        DriverWrapper.getDriver().findElement(locator).sendKeys(data);
    }

    public void clickThis(By locator) {
        DriverWrapper.getDriver().findElement(locator).click();
    }

    public boolean isElementDisplayed(By locator) {
        return DriverWrapper.getDriver().findElement(locator).isDisplayed();
    }

    // isSelected

    // isEnabled

    // getText

    // getAttribute

    // getTitle

    // getCurrentUrl

    // 


}
