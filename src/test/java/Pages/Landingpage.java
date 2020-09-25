package Pages;

import DriverPkg.DriverWrapper;
import com.sun.xml.internal.rngom.parse.host.Base;
import org.openqa.selenium.By;

public class Landingpage extends Basepage {

    // Locators for element on Homepage
    By headerSignIn = By.xpath("//div[@class='menu-nav']//a[@class='signin']");




    // Method to perform specific action of webelement (to find it, we use above locators)
    // present on homepage
    public void clickHeaderSignIn() {
        clickThis(headerSignIn);
    }




}
