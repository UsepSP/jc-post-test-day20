package com.juaracoding;


import com.juaracoding.page.CatatanKeuangan;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Main {

        public static void main(String[] args) throws MalformedURLException {


            //DesiredCapabilities
            DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
            desiredCapabilities.setCapability("deviceName", "SM_M236B");
            desiredCapabilities.setCapability("udid", "RRCT303G9VB");
            desiredCapabilities.setCapability("platforName", "android");
            desiredCapabilities.setCapability("appPackage", "com.chad.financialrecord");
            desiredCapabilities.setCapability("appActivity", "com.rookie.catatankeuangan.feature.splash.SplashActivity");
            desiredCapabilities.setCapability("noreset", true);

            //URL
            URL url = new URL("http://127.0.0.1:4723/wd/hub");

            CatatanKeuangan Catatan = new CatatanKeuangan();


            //instance Android driver
            AndroidDriver driver = new AndroidDriver<>(url, desiredCapabilities);

            //add
            Catatan.delay(3);
            Catatan.addIncome("10000","Input Income");
            System.out.println("Inpus Berhasil");




        }
}