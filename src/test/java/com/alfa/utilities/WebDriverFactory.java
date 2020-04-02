package com.alfa.utilities;

// Utility class --> this class is not have test, it will have
// reusable pieces of code that is frequently used by  tests
// Utilities--> package we store utility classes

// factory -- > calss tha returns certain type of object based on inputs.


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverFactory {

    // write a static method that takes a strong parameter
    // based on a vlue of parameter
    // that method must return chromedriver or firefoxdriver object
    //name: getDriver.

    public static WebDriver getDriver(String browserType){
        WebDriver driver =null;

        switch (browserType.toLowerCase()){

            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver=new ChromeDriver();
                break;
            case  "firefox":
                WebDriverManager.firefoxdriver().setup();

        }


        return driver;

    }


}
