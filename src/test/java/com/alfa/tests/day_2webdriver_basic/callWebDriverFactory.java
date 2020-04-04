package com.alfa.tests.day_2webdriver_basic;

import com.alfa.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class callWebDriverFactory {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.finn.no");

        Thread.sleep(3000);

        String title = driver.getTitle();
        System.out.println("title = " + title);

        String currenturl=driver.getCurrentUrl();
        System.out.println("currenturl = " + currenturl);

        String PageSource = driver.getPageSource();
        System.out.println("PageSource = " + PageSource);

        Thread.sleep(4000);
        driver.close();






    }
}
