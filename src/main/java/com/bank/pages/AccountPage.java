package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class AccountPage extends Utility {
    @CacheLookup
    @FindBy

            (xpath = "//button[@ng-class='btnClass2']")
    WebElement clickOnDeposit;
    @CacheLookup
    @FindBy
            (xpath = "//input[@ng-model='amount']")

    WebElement enterAmount;
    @CacheLookup
    @FindBy
            (xpath = "//button[@type='submit']")
    WebElement deposit;
    @CacheLookup
    @FindBy
            (xpath = "//button[@ng-class='btnClass3']")
    WebElement withdraw;
    @CacheLookup
    @FindBy
            (xpath = "//input[@ng-model='amount']")
    WebElement enterAmount1;
    @CacheLookup
    @FindBy
            (xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[4]/div[1]/form[1]/button[1]")
    WebElement getWithdraw;
    @CacheLookup
    @FindBy
            (xpath = "//body[1]/div[3]/div[1]/div[2]/div[1]/div[4]/div[1]/span[contains(text(),'Transaction successful')]")
    WebElement verifyTransactionSuccessful;

    public void setClickOnDeposit() {
        Reporter.log("Click On Deposit Tab:"+clickOnDeposit);
        clickOnElement(clickOnDeposit);
    }

    public void enterAmount(String text) {
        Reporter.log("Enter Amount:"+text+"to"+enterAmount.toString());
        sendTextToElement(enterAmount, text);
    }

    public void setDeposit() {
        Reporter.log("Click On Deposit Tab:"+deposit);
        clickOnElement(deposit);
    }

    public void setWithdraw() {
        Reporter.log("Click On withdraw Tab:"+withdraw);
        clickOnElement(withdraw);
    }

    public void enterAmount1(String text) {
        Reporter.log("Enter Amount:"+text+"to"+enterAmount1.toString());
        sendTextToElement(enterAmount1, text);
    }

    public void setWithdraw1() {
        Reporter.log("Click On withdraw Tab:"+getWithdraw);
        clickOnElement(getWithdraw);
    }

    public String verifyTransaction() {
        Reporter.log("Getting Message : " + verifyTransactionSuccessful.toString());
        return getTextFromElement(verifyTransactionSuccessful);
    }
}
