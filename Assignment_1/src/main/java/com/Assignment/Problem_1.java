package com.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Problem_1 {
    WebDriver driver;
    Problem_1(){
        driver = new ChromeDriver();
    }
    //Test to see if we can connect to Zwift website
    protected void run(){
        System.out.println("Starting Test One \n");
        if(testConnection()){
            System.out.println("Connection test passed");
        }else {
            System.out.println("Connection test failed");
            //if we cannot connect to Zwift website, no further test can progress, so exit the program
            System.exit(3);
        }

        //Test if we can find the "Accept All" button for cookies.
        if(testElementPresented()){
            System.out.println("Element truste-consent-button is presented");
        }else{
            System.out.println("Element truste-consent-button is not found");
        }
        System.out.println("\nFinishing Test One");
    }
    protected void finish(){
        driver.quit();
    }
    private boolean testConnection(){
        //try catch block to make sure if we cannot access Zwift website, program won't crash but properly return test result.
        try{
            driver.get("https://zwift.com");
                return true;
        }catch (Exception e){
            System.out.print(e.getMessage());
        }


        return false;
    }
    //Test to fine the "Accept all" button when prompted for cookies.
    protected boolean testElementPresented(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        WebElement testElement_2 = driver.findElement(By.id("truste-consent-button"));
        return testElement_2.isDisplayed();
    }
}
