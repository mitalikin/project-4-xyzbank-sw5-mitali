package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class BankManagerLoginPage extends Utility {
    @FindBy
            (xpath = "//div[@class='borderM box padT20']/child::div[2]/button")
    WebElement clickOnBankManagerLoginTab;
@FindBy
        (xpath = "//div[@class='center']/button[1]")
WebElement clickOnAddCustomer;





    public void clickOnBankManagerLoginTab(){
        Reporter.log("Click On Bank Manager Login Tab:"+clickOnBankManagerLoginTab);
        clickOnElement(clickOnBankManagerLoginTab);
    }

    public void clickOnAddCustomer(){
        clickOnElement(clickOnAddCustomer);
    }
    public void contextRightClickAction(By by){
        WebElement button =driver.findElement(by);
        Actions act = new Actions(driver);
        // act.contextClick(button).build().perform();
        act.contextClick(button).perform();
    }


}
