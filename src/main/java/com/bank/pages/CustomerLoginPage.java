package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class CustomerLoginPage extends Utility {
    @FindBy
            (xpath = "//button[contains(text(),'Customer Login')]")
    WebElement customerLogin;



    @FindBy
            (xpath = "//select[@id='userSelect']")
    WebElement searchCustomer1;

@FindBy
        (xpath = "//button[contains(text(),'Login')]")
WebElement getCustomerLogin;
@FindBy
        (xpath = "//button[@class='btn logout']")
WebElement logout;
@FindBy
        (xpath = "//button[contains(text(),'Logout')]")
WebElement logout1;
@FindBy
        (xpath = "//label[text()='Your Name :']")
WebElement verifyYourName;



    public void customerLogin1(){
        Reporter.log("Clicking on Customer Login Tab : " + customerLogin.toString());
        clickOnElement(customerLogin);
    }

    public void setSearchCustomer1(String text) {
        Reporter.log("Sending text to Search field : "+text+" to " + searchCustomer1.toString());
        selectByVisibleTextFromDropDown(searchCustomer1, text);
    }
    public void setCustomerLogin(){
        Reporter.log("Clicking on Customer Login Tab : " + getCustomerLogin.toString());
        clickOnElement(getCustomerLogin);
    }

    public String verifyLogout(){
        Reporter.log("Verify Text Logout : " + logout.toString());
        return getTextFromElement(logout);

    }
    public void logout1(){
        Reporter.log("Clicking on Logout Tab : " + logout1.toString());
        clickOnElement(logout1);
    }
    public String verifyYourName(){
        Reporter.log("Verify Text Your Name : " + verifyYourName.toString());
        return getTextFromElement(verifyYourName);
    }

}
