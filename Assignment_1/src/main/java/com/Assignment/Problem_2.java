package com.Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Problem_2 {
    WebDriver driver;
    Problem_2(){
        driver = new ChromeDriver();
    }
    private boolean pretest(){
        return false;
    }
    protected void finish(){
        driver.quit();
    }
    protected void run(){
        System.out.println("Hello World!");
    }
}
