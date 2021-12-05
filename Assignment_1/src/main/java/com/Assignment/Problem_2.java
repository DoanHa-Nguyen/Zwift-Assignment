package com.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Problem_2 {
    WebDriver driver;
    Problem_2(){
        driver = new ChromeDriver();
    }
    private boolean pretest(){
        try{
            driver.get("https://zwift.com");

        }catch (Exception e){
            System.out.print(e.getMessage());
            return false;
        }
        new WebDriverWait(driver, Duration.ofSeconds(6)).until(ExpectedConditions.elementToBeClickable(By.id("truste-consent-button"))).click();
        return true;
    }
    protected void finish(){
        driver.quit();
    }
    protected void run() {
        System.out.println("Hello World!");
        if(pretest()){
           if(testNavigateToEventsPage()){
               System.out.println("Test to navigate to Events Page passed");
           }else{
               System.out.println("Test to navigate to Events Page failed");
           }
        }
        System.out.println("We're done here!");

    }

    protected boolean testNavigateToEventsPage(){
        try{
            WebElement menuElement = driver.findElement(By.className("PrimaryNav-module__hamburger--1y_LN"));
            menuElement.click();

            new WebDriverWait(driver, Duration.ofSeconds(5))
                    .until(ExpectedConditions.elementToBeClickable(
                            By.xpath("//*[@id=\"__next\"]/div/div/div[1]/div[2]/div/aside/div/div[2]/div[2]/div/div[1]/ul[2]/li[1]/a")))
                    .click();
            return true;
        }catch(NoSuchElementException noElementException){
            System.out.println(noElementException.getMessage());
            return false;
        }

    }
}
