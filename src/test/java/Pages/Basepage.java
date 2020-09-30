package Pages;

import DriverPkg.DriverWrapper;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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

    public Alert switchToAlert() {
        return DriverWrapper.getDriver().switchTo().alert();
    }

    public String getAlertText(Alert alert) {
        return alert.getText();
    }

    public void dismissAlert(Alert alert) {
        alert.dismiss();
    }

    public void acceptAlert(Alert alert) {
        alert.accept();
    }

    public void writeOnAlert(Alert alert, String data) {
        alert.sendKeys(data);
    }

    public void mouseHoverOnElement(By locator) {
        WebElement element = findWebElement(locator);
        Actions act = new Actions(DriverWrapper.getDriver());
        act.moveToElement(element);
    }

    public void mouseHoverOnElement(WebElement element) {
        Actions act = new Actions(DriverWrapper.getDriver());
        act.moveToElement(element);
    }

    public void selectFromAutoSuggestion(By locator, String selectThis) {
        List<WebElement> suggestions = findWebElements(locator);
        for (WebElement suggestion : suggestions) {
            if (suggestion.getText().equalsIgnoreCase(selectThis)) {
                suggestion.click();
                break;
            }
        }
    }




}
