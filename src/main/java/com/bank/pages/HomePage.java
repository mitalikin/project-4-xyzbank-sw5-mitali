package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class HomePage extends Utility {

    @FindBy
            (xpath = "//button[contains(text(),'Home')]")
    WebElement clickOnHomePage;


    public void clickOnHomePage() {
        Reporter.log("Clicking on Home Tab : " + clickOnHomePage.toString());
        clickOnElement(clickOnHomePage);


    }



}
