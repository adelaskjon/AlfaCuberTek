package com.alfa.tests.day3_webelement_intro;

import com.alfa.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * open borswr
 * go to webpage
 * enterany enmail
 *verify this emial is display in the input box
 * click on Tertirve passoword
 * Veridy that URL changed to
 * veryfy that confirmation messsage says " your emial been sent"
 */
public class VerifyConfirmationMessage {
    public static void main(String[] args) throws InterruptedException {

        //open broswer
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        //go to the webpage
        driver.get("http://practice.cybertekschool.com/forgot_password");

        //enter any emial
        WebElement emialInptu=driver.findElement(By.name("email"));

        String expectedEmial="email@gmial.com";

        //send emial
        emialInptu.sendKeys(expectedEmial);

        //verify that emial is display in the input box
        //get test from webelemts
        //1.one is get tex from web selemt
        //2 use getAtrubute()
        //String accutalEmail=emialInptu.getText();
        String accutalEmail=emialInptu.getAttribute("value");

        if(expectedEmial.equals(accutalEmail)){
            System.out.println("pass"  );
        }else{
            System.out.println("Fail") ;
            System.out.println("expectedEmial = " + expectedEmial);
            System.out.println("accutalEmail = " + accutalEmail);

        }

        WebElement retwenPasword=driver.findElement(By.id("form_submit"));
        retwenPasword.click();

        // * veryfy that confirmation messsage says " your emial been sent"
        String expectedMessahe="Your e-mail's been sent!";

        WebElement messheElemt=driver.findElement(By.name("confirmation_message"));

        Thread.sleep(3000);

        String accutMessage=messheElemt.getText();

        if(expectedMessahe.equals(accutMessage)){
            System.out.println("Pass");

        }else{
            System.out.println("Fail");
            System.out.println("actualEMail = " + expectedMessahe );


        }

       driver.quit();



    }



}
