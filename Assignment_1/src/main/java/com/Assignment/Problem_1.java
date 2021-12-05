package com.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Problem_1 {
    WebDriver driver;
    Problem_1(WebDriver d){
        driver = d;

    }
    //Test to see if we can connect to Zwift website
    protected boolean testConnection(){
        //try catch block to make sure if we cannot access Zwift website, program won't crash but properly return test result.
        try{
            driver.get("https://zwift.com");
            System.out.println(driver.getTitle());
                return true;
        }catch (Exception e){
            System.out.print(e.getMessage());
        }


        return false;
    }
    //Test to fine the "Accept all" button when prompted for cookies.
    protected boolean testElementPresented(){
        WebElement testElement_2 = driver.findElement(By.id("truste-consent-button"));
        return testElement_2.isDisplayed();
    }
}
