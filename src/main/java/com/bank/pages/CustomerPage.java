package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class CustomerPage extends Utility {
    @FindBy
            (xpath = "//input[@placeholder='First Name']")
    WebElement enterFirstName;
@FindBy
        (xpath = "//input[@placeholder='Last Name']")
WebElement enterLastName;
@FindBy
        (xpath = "//input[@placeholder='Post Code']")
WebElement enterPostCode;
@FindBy
        (xpath = "//button[@class='btn btn-default']")
WebElement clickOnAddCustomer;


    public void enterFirstName(String firstname){
        Reporter.log("Sending text to Firstname : "+firstname+" to " + enterFirstName.toString());
        sendTextToElement(enterFirstName,firstname);
    }
    public void enterLastName(String lastname){
        Reporter.log("Sending text to Firstname : "+lastname+" to " + enterLastName.toString());
        sendTextToElement(enterLastName,lastname);
    }
    public void enterPostCode(String postcode){
        Reporter.log("Sending text to Firstname : "+postcode+" to " + enterPostCode.toString());
        sendTextToElement(enterPostCode,postcode);
    }
    public void clickOnAddCustomer(){
        Reporter.log("Clicking on Add Customer Tab : " + clickOnAddCustomer.toString());
        clickOnElement(clickOnAddCustomer);
    }
    public String verifyGetText(){
        return getTextFromAlert();

    }
    public  void alertAccept1(){
        driver.switchTo().alert().accept();

    }
}
