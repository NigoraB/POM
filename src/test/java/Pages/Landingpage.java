package Pages;

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
