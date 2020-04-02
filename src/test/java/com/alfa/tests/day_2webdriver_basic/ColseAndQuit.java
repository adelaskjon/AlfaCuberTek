package com.alfa.tests.day_2webdriver_basic;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ColseAndQuit {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");

        Thread.sleep(3000);

        String title = driver.getTitle();
        System.out.println("title = " + title);

        String PageSource = driver.getPageSource();
        System.out.println("PageSource = " + PageSource);

        String currentUrl = driver.getCurrentUrl();
        System.out.println("currentUrl = " + currentUrl);

      driver.close(); // colse current tap

        driver = new ChromeDriver();

        driver.get("https://www.finn.no");

        Thread.sleep(5000);


        driver.quit(); // close all open windows and tabs and pop ups etc.

        // driver. colse()--> close current tab
        // driver.quit--> clese browsers everything, clear the memory.











    }
}
