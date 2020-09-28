package Pages;

import DriverPkg.DriverWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.sql.Driver;
import java.util.List;
import java.util.Set;

public class Basepage {

    public List<WebElement> findWebElements(By locator) {
        return DriverWrapper.getDriver().findElements(locator);
    }

    public WebElement findWebElement(By locator) {
        return DriverWrapper.getDriver().findElement(locator);
    }

    public void type(By locator, String data) {
        findWebElement(locator).sendKeys(data);
    }

    public void clickThis(By locator) {
        findWebElement(locator).click();
    }

    public boolean isElementDisplayed(By locator) {
        return findWebElement(locator).isDisplayed();
    }

    // isSelected

    // isEnabled

    // getText

    // getAttribute

    // getTitle

    // getCurrentUrl

    // method to select any value (using text) in any dropdown
    public void selectUsingText(By locator, String text) { ;
        WebElement dropdownElement = findWebElement(locator);
        Select dropdown = new Select(dropdownElement);
        dropdown.selectByVisibleText(text);
    }

    public void selectUsingValueAttr(By locator, String value) { ;
        WebElement dropdownElement = findWebElement(locator);
        Select dropdown = new Select(dropdownElement);
        dropdown.selectByValue(value);
    }

    public void selectUsingOptionIndex(By locator, int index) { ;
        WebElement dropdownElement = findWebElement(locator);
        Select dropdown = new Select(dropdownElement);
        dropdown.selectByIndex(index);
    }

    public String getCurrentWindowHandle() {
        return DriverWrapper.getDriver().getWindowHandle();
    }

    public Set<String> getAllWindowHandles() {
        return DriverWrapper.getDriver().getWindowHandles();
    }

    public void switchToNewWindow(String handle) {
        DriverWrapper.getDriver().switchTo().window(handle);
    }

    public void switchToFrame(String id) {
        DriverWrapper.getDriver().switchTo().frame(id);
    }

    public void switchToFrame(By locator) {
        WebElement frame = findWebElement(locator);
        DriverWrapper.getDriver().switchTo().frame(frame);
    }



}
