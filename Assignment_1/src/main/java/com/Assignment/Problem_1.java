package com.Assignment;

import org.openqa.selenium.WebDriver;

public class Problem_1 {
    WebDriver driver;
    Problem_1(WebDriver d){
        driver = d;

    }
    protected void testConnection(){
        driver.get("https://zwift.com");
        System.out.println(driver.getTitle());
    }
}
