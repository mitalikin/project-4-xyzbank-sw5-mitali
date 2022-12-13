package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OpenAccountPage extends Utility {

    @FindBy
            (xpath = "//button[@ng-click='openAccount()']")
    WebElement openAccount;

@FindBy
        (xpath = "//select[@id='userSelect']")
WebElement searchCustomer;

@FindBy
        (id= "currency")
WebElement searchCurrency;
@FindBy
        (xpath = "//button[contains(text(),'Process')]")
WebElement clickOnProcessButton;




    public void setOpenAccount() {
        clickOnElement(openAccount);
    }
    public void setSearchCustomer(String text) {
        //  clickOnElement(clickOnDropDown);
        selectByVisibleTextFromDropDown(searchCustomer, text);
    }
    public void setSearchCurrency(String text) {
        //  clickOnElement(clickOnDropDown);
        selectByVisibleTextFromDropDown(searchCurrency, text);
    }
    public void clickOnProcess() {
        clickOnElement(clickOnProcessButton);

    }
    public String verifyGetText1(){
        return getTextFromAlert();

    }
    public  void alertAccept1(){
        driver.switchTo().alert().getText();


    }




}
