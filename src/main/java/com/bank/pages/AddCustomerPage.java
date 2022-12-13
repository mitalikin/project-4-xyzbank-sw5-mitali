package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class AddCustomerPage extends Utility {
    @CacheLookup
    @FindBy
            (xpath = "//button[@ng-class='btnClass1']")
    WebElement addCustomer;

    public void addCustomer() {
        Reporter.log("Click On Add customer Tab:"+addCustomer);
        clickOnElement(addCustomer);
    }

}
