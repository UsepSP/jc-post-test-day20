package com.juaracoding.page;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class CatatanKeuangan {

    public static Object addIncome;
    public AndroidDriver<MobileElement> driver;

    //Skip PopUp/ Modal

    @AndroidFindBy (id="com.android.permissioncontroller:id/permission_allow_button")
    private MobileElement akses;

    @AndroidFindBy (id="android:id/button2")
    private MobileElement popup;

    @AndroidFindBy (xpath="//android.widget.ImageButton[contains(@bounds,\"891\"")
    private MobileElement btnAdd;

    @AndroidFindBy (id="com.chad.financialrecord:id/btnIncome")
    private MobileElement btnIncome;

    @AndroidFindBy (id="com.chad.financialrecord:id/etAmount")
    private MobileElement nominal;

    @AndroidFindBy (id="com.chad.financialrecord:id/etAmount")
    private MobileElement note;

    @AndroidFindBy (id="com.chad.financialrecord:id/btSave")
    private MobileElement btnSave;

    @AndroidFindBy (id="com.chad.financialrecord:id/btnExpense")
    private MobileElement btnCost;

    @AndroidFindBy(id = "//android.widget.TextView[contains(@bounds,\"922\")]")
    private MobileElement resultIncome;

    @AndroidFindBy(id = "//android.widget.TextView[contains(@bounds,\"922\")]")
    private MobileElement resultCost;







    //Method

    public void addIncome(String nominal, String note){
        delay(7);
        akses.click();
        delay(2);
        popup.click();
        btnAdd.click();
        delay(2);
        btnIncome.click();
        this.nominal.sendKeys(nominal);
        this.note.sendKeys(note);
        btnSave.click();
        delay(2);
    }


    public void addCost(String nominal, String note){
        btnCost.click();
        btnAdd.click();
        btnIncome.click();
        this.nominal.sendKeys(nominal);
        this.note.sendKeys(note);
        btnSave.click();
    }

    public String getTxtResultIncome() {
        return resultIncome.getText();
    }

    public String getTxtResultCost() {
        return resultCost.getText();
    }


    public void delay (long detik) {
        try {
            Thread.sleep(detik * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }



}
