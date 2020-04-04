package com.alfa.tests.day3_webelement_intro;

import com.alfa.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class VerifyURLnotchanged {

    /**
     *
     * @param args
     * @throws InterruptedException
     */

    public static void main(String[] args) throws InterruptedException {
        //open browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        // got to website
        driver.get("https://www.finn.no");

        Thread.sleep(3000);

        //get title
        String title= driver.getTitle();
        System.out.println("title = " + title);

        //get URL
        String currenURL=driver.getCurrentUrl();
        System.out.println("currenURL = " + currenURL);
        //get Sources
        String pageSources=driver.getPageSource();
        System.out.println("pageSources = " + pageSources);


        driver.close();

    }
}
