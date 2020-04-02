package com.alfa.tests.day1_basicavigation;

import com.github.javafaker.Faker;

public class day1_webdriver {

    public static void main(String[] args) {

        System.out.println("Hello World ");


        Faker faker = new Faker();

        System.out.println(faker.name().fullName() );
        System.out.println(faker.address().country());
        

    }

}
