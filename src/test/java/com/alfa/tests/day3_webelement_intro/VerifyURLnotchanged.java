package com.alfa.tests.day3_webelement_intro;

import com.alfa.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class VerifyURLnotchanged {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.finn.no");

        Thread.sleep(3000);

        String title= driver.getTitle();
        System.out.println("title = " + title);

        String currenURL=driver.getCurrentUrl();
        System.out.println("currenURL = " + currenURL);

        String pageSources=driver.getPageSource();
        System.out.println("pageSources = " + pageSources);

        driver.close();

    }
}
