package com.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Problem_2 {
    WebDriver driver;
    WebDriverWait waiter;
    Problem_2(){
        driver = new ChromeDriver();
        waiter = new WebDriverWait(driver, Duration.ofSeconds(6));
    }
    private boolean pretest(){
        try{
            driver.get("https://zwift.com");

        }catch (Exception e){
            System.out.print(e.getMessage());
            return false;
        }
        waiter.until(ExpectedConditions.elementToBeClickable(By.id("truste-consent-button"))).click();
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
           System.out.println("Moving On");
           List<WebElement> beforeFilterEventsList = driver.findElements(By.className("tab-listing"));
           System.out.println("Before filters are applied, there are " + beforeFilterEventsList.size() + " events on the list.");
           if (testApplyFilters()){
               System.out.println("Test to apply filters passed");
           }else{
               System.out.println("Test to apply filters failed");
           }
           List<WebElement> afterFilterEventsList = driver.findElements(By.className("tab-listing"));
            System.out.println("After filters are applied, there are " + afterFilterEventsList.size() + " events on the list.");
        }

        System.out.println("We're done here!");

    }

    protected boolean testNavigateToEventsPage(){
        try{
            WebElement menuElement = driver.findElement(By.className("PrimaryNav-module__hamburger--1y_LN"));
            menuElement.click();

            waiter.until(ExpectedConditions.elementToBeClickable(
                            By.xpath("//*[@id=\"__next\"]/div/div/div[1]/div[2]/div/aside/div/div[2]/div[2]/div/div[1]/ul[2]/li[1]/a")))
                    .click();
            return true;
        }catch(NoSuchElementException noElementException){
            System.out.println(noElementException.getMessage());
            return false;
        }
    }

    protected boolean testApplyFilters(){
        try{
            waiter.until(ExpectedConditions.elementToBeClickable(By.className("filter-toggle"))).click();

            List<WebElement> buttonsList = driver.findElements(By.className("buttons"));
            for(WebElement a: buttonsList){
                System.out.println(a.getText());
                if(a.getText().equalsIgnoreCase("Cycling")){
                    a.click();
                }else
                if(a.getText().equalsIgnoreCase("B")){
                    a.click();
                }else
                if(a.getText().equalsIgnoreCase("Morning")){
                    a.click();
                }
            }
            System.out.println("Filters applied: Sports - Cycling, Intensity - B, Start Time - Morning");
            driver.findElement(By.className("apply-button")).click();
            return true;
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }
}
