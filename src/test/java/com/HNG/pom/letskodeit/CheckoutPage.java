package com.HNG.pom.letskodeit;

import com.basepage.AbstractBasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;

public class CheckoutPage extends AbstractBasePage {
    public CheckoutPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    /***
     * Element Locators
     * */
    @FindBy(xpath = "//*[@name='email']")
    private WebElement txbx_email;

    @FindBy(xpath = "//*[@name='username']")
    private WebElement txbx_name;

    @FindBy(xpath = "//*[@name='emailReceive']")
    private WebElement chkbx_emailReceive;

    @FindBy(xpath = "//*[@class='dropbtn minimal']")
    private WebElement dropbtn_paymentMethod;

    @FindBy(xpath = "//*[@data-payment-method='paypal']")
    private WebElement paymentPaypal;

//    @FindBy(xpath = "//*[@aria-label='Credit or debit card number']")
//    private WebElement txbx_cardNum;

    @FindBy(xpath = "//input[@name = 'cardnumber']/parent::span[@class = 'InputContainer']/input")
    private WebElement txbx_cardNum;

    @FindBy(xpath = "//*[@name='exp-date']")
    private WebElement txbx_ExpDate;

    @FindBy(xpath = "//*[@name='cvc']")
    private WebElement txbx_CVC;

    @FindBy(xpath = "//*[@id='country_code_credit_card-cc']")
    private WebElement drpdwn_CountryCredit;

    @FindBy(xpath = "//*[@id='country_code_credit_card-paypal']")
    private WebElement drpdwn_CountryPaypal;

    @FindBy(xpath = "//*[@name='postal']")
    private WebElement txbx_postal;

    @FindBy(xpath = "//*[@id='save-payment-details']")
    private WebElement chkbx_savePayment;

    @FindBy(xpath = "//*[@id = 'agreed_to_terms_checkbox']")
    private WebElement chkbx_agreedToTerms;

    @FindBy(xpath = "//*[@for='spc-primary-submit']")
    private WebElement btn_confirmedPurchase;

    @FindBy(xpath = "//*[@class='payment-error-box']")
    private WebElement mgs_error;

    /***
     * Methods
     * */

    public void enterEmail(String email){
        sendKeyToTextBox(txbx_email,email);
    }

    public void enterName(String name){
        sendKeyToTextBox(txbx_name, name);
    }

    public void clickPayment(){
        clickButton(dropbtn_paymentMethod);
    }

    public void selectpaymentPaypal(){
        clickButton(paymentPaypal);
    }

    public void enterCardNum (String cardNum) throws InterruptedException {
        int lengthCardNum = cardNum.length();
        char[] charCardNum = cardNum.toCharArray();
        for (int i =0; i< lengthCardNum; i++){
            txbx_cardNum.sendKeys(String.valueOf(charCardNum[i]));
            Thread.sleep(500);
            //sendKeyToTextBox(txbx_cardNum, String.valueOf(charCardNum[i]));
        }
    }

    public void enterExpDate(String expDate) throws InterruptedException {
        int lengthexpDate = expDate.length();
        char[] charexpDate = expDate.toCharArray();
        for (int i =0; i< lengthexpDate; i++){
            txbx_ExpDate.sendKeys(String.valueOf(charexpDate[i]));
            Thread.sleep(500);
            //sendKeyToTextBox(txbx_cardNum, String.valueOf(charCardNum[i]));
        }
    }
    public void enterCVC(String CVC) throws InterruptedException {
        int lengthCVC = CVC.length();
        char[] charCVC = CVC.toCharArray();
        for (int i =0; i< lengthCVC; i++){
            txbx_CVC.sendKeys(String.valueOf(charCVC[i]));
            Thread.sleep(500);
            //sendKeyToTextBox(txbx_cardNum, String.valueOf(charCardNum[i]));
        }
    }

    public void enterPostal(String postal) throws InterruptedException {
        int lengthpostal = postal.length();
        char[] charpostal = postal.toCharArray();
        for (int i =0; i< lengthpostal; i++){
            txbx_postal.sendKeys(String.valueOf(charpostal[i]));
            Thread.sleep(500);
            //sendKeyToTextBox(txbx_cardNum, String.valueOf(charCardNum[i]));
        }
    }

    public void selectCountryCredit(String countryName){
        Select selectCountry  = new Select(drpdwn_CountryCredit);
        waitForElementToBeVisible(drpdwn_CountryCredit);
        selectCountry.selectByVisibleText(countryName);
    }

    public void selectCountryPaypal(String countryName){
        Select selectCountry  = new Select(drpdwn_CountryPaypal);
        waitForElementToBeVisible(drpdwn_CountryPaypal);
        selectCountry.selectByVisibleText(countryName);
    }

    public void checkAgreedToTerms(){
            clickButton(chkbx_agreedToTerms);
    }

    public void checkSavePayment(boolean value){
        if (value)
            clickButton(chkbx_savePayment);


    }

    public void confirmPurchase(){
        clickButton(btn_confirmedPurchase);
    }

    public String getErrormgs(){
        return getTextInElement(mgs_error);

    }

}
