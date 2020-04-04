package com.alfa.tests.day3_webelement_intro;

import com.alfa.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VerifyURLchanged {
    public static void main(String[] args) {

        /**
         * open borswr
         * go to webpage
         * enterany enmail
         * click on Tertirve passoword
         * Veridy that URL changed to
         */

        // open browser
        WebDriver driver= WebDriverFactory.getDriver("chrome");

        // go to webpabe http://practice.cybertekschool.com/forgot_password")
        driver.get("http://practice.cybertekschool.com/forgot_password");

        //enter anyemailname="email"
        WebElement emailInput = driver.findElement(By.name("email"));
        emailInput.sendKeys("email@gmail.com");

        //click on password
        WebElement clikPasword =driver.findElement(By.id("form_submit"));
        clikPasword.click();

        String expectedUrl= "http://practice.cybertekschool.com/email_sent";
        String actualUrl= driver.getCurrentUrl();

        if(expectedUrl.equals(actualUrl)){

            System.out.println("Pass");
        }else{
            System.out.println("FAIL");
            System.out.println("actualUrl=" + actualUrl );
            System.out.println("expectedUrl = " + expectedUrl);
        }



        //driver.close();
        driver.quit();










    }
}
