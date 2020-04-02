package com.alfa.tests.day_2webdriver_basic;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getUrlTitle {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.finn.no");

        //get title
        String title = driver.getTitle();
        System.out.println("e = " + title);

        //get title with system.out method.
        // System.out.println(driver.getTitle());

        //get currentUrl
        String currentUrl=driver.getCurrentUrl();
        System.out.println("currentUrl = " + currentUrl);

        //get pageSource
        String pageSource=driver.getPageSource();
        System.out.println("pageSource = " + pageSource);



        //clese webpage
        driver.quit();





    }
}
