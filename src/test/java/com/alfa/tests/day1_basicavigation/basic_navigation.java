package com.alfa.tests.day1_basicavigation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class basic_navigation {

    public static void main(String[] args) {

        // we have to setup webdriver based on the browser that we gana use
        WebDriverManager.chromedriver().setup();

        // creating object ofr using selenium driver
        WebDriver driever = new ChromeDriver();



        //open borwser
        driever.get("https://www.finn.no");

        // get the title and print it
        System.out.println(driever.getTitle());

        driever.close();





    }
}
