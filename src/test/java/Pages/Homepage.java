package Pages;

import DriverPkg.DriverWrapper;
import org.openqa.selenium.By;

public class Homepage extends Basepage {

    // Locators
    By salutation = By.xpath("//span[@class='teacher-name-with-salutation' and starts-with(text(), 'Hi,')]");


    // Method
    public boolean isSalutationDisplayed() {
        return isElementDisplayed(salutation);
    }
        /**
         * current use: isDisplayed()
         *  returns true if something is displayed
         *  else false
         *
         * new usage: isDisplayed(true)
         *  returns true if something is displayed
         *  else false
         *
         * new usage: isDisplayed(false)
         *  returns true if something is NOT displayed
         *  else false
         */








}
