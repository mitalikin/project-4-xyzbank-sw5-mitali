package com.bank.testsuite;

import com.bank.customlisteners.CustomListeners;
import com.bank.pages.*;
import com.bank.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(CustomListeners.class)
public class BankTest extends BaseTest {
AccountPage accountPage;
AddCustomerPage addCustomerPage;
BankManagerLoginPage bankManagerLoginPage;
CustomerLoginPage customerLoginPage;
CustomerPage customerPage;
HomePage homePage;
OpenAccountPage openAccountPage;

@BeforeMethod(alwaysRun = true)
    public void inIt(){
    accountPage=new AccountPage();
    addCustomerPage=new AddCustomerPage();
    bankManagerLoginPage=new BankManagerLoginPage();
    customerLoginPage=new CustomerLoginPage();
    customerPage =new CustomerPage();
    homePage=new HomePage();
    openAccountPage=new OpenAccountPage();

}

    @Test
    public void homePage() {
        homePage.clickOnHomePage();

    }

    @Test(groups = {"sanity","regression"})
    public void bankManagerShouldAddCustomerSuccessfully() {
        //click On "Bank Manager Login" Tab
        bankManagerLoginPage.clickOnBankManagerLoginTab();
        //click On "Add Customer" Tab
        addCustomerPage.addCustomer();
        //enter FirstName
        customerPage.enterFirstName("Albus");
        //enter LastName
        customerPage.enterLastName("Dumbledore");
        //enter PostCode
        customerPage.enterPostCode("wd12 2tr");
        //click On "Add Customer" Button
        customerPage.clickOnAddCustomer();
        //popup display
        //verify message "Customer added successfully"
        String expectedMessage = "Customer added successfully with customer id :6";

        Assert.assertEquals(customerPage.verifyGetText(), expectedMessage, "Message is not displayed");

        //click on "ok" button on popup.

        customerPage.alertAccept1();
    }

    @Test(groups = {"smoke","regression"})
    public void bankManagerShouldOpenAccountSuccessfully() {

        //click On "Bank Manager Login" Tab
        bankManagerLoginPage.clickOnBankManagerLoginTab();
        //click On "Open Account" Tab
        openAccountPage.setOpenAccount();
        //Search customer that created in first test
        openAccountPage.setSearchCustomer("Albus Dumbledore");
        // openAccountPage.setSearchCustomer("John Clark");
        //Select currency "Pound"
        openAccountPage.setSearchCurrency("Pound");
        // click on "process" button
        openAccountPage.clickOnProcess();
        // popup displayed
        // verify message "Account created successfully"
        String expectedMessage2 = "Account created successfully with account Number :1016";
        Assert.assertEquals(openAccountPage.verifyGetText1(), expectedMessage2, "Message is not displayed");
        openAccountPage.alertAccept1();
        // click on "ok" button on popup.
        openAccountPage.alertAccept1();

    }

    @Test(groups = {"regression"})
    public void customerShouldLoginAndLogoutSuccessfully() {
        // click on "Customer Login" Tab
        customerLoginPage.customerLogin1();
        //search customer that you created.
        customerLoginPage.setSearchCustomer1("Albus Dumbledore");
        //click on "Login" Button
        customerLoginPage.setCustomerLogin();
        //verify "Logout" Tab displayed.
        String expectedMessage3 = "Logout";
        Assert.assertEquals(customerLoginPage.verifyLogout(), expectedMessage3, "Message is not displayed");
        //click on "Logout"
        customerLoginPage.logout1();
        //verify "Your Name" text displayed.
        String expectedMessage4 = "Your Name :";
        Assert.assertEquals(customerLoginPage.verifyYourName(), expectedMessage4, "Message is not displayed");
    }

    @Test(groups = {"regression"})
    public void customerShouldDepositMoneySuccessfully() {
        //click on "Customer Login" Tab
        customerLoginPage.customerLogin1();
        //search customer that you created.
        customerLoginPage.setSearchCustomer1("Albus Dumbledore");
        //      click on "Login" Button
        customerLoginPage.setCustomerLogin();
        //click on "Deposit" Tab
        accountPage.setClickOnDeposit();
        // Enter amount 100
        accountPage.enterAmount("100");
        // click on "Deposit" Button
        accountPage.setDeposit();

    }

    @Test(groups = {"regression"})
    public void customerShouldWithdrawMoneySuccessfully() throws InterruptedException {

        // click on "Customer Login" Tab
        customerLoginPage.customerLogin1();
        //search customer that you created.
        customerLoginPage.setSearchCustomer1("Albus Dumbledore");
        //      click on "Login" Button
        customerLoginPage.setCustomerLogin();
        //click on "Withdrawl" Tab
        accountPage.setWithdraw();
        //Enter amount 50
        accountPage.enterAmount1("500");
        //click on "Withdraw" Button
        accountPage.setWithdraw1();
        //verify message "Transaction Successful"
        Thread.sleep(1000);
        String expectedMessage5 = "Transaction successful";
        Assert.assertEquals(accountPage.verifyTransaction(), expectedMessage5, "Message is not displayed");
        customerLoginPage.logout1();
    }














}
