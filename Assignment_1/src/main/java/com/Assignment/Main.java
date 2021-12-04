package com.Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args){
        System.out.println("Hello World");
        System.setProperty("webdriver.chrome.driver", "\"C:\\Users\\snogi\\Desktop\\Zwift Assignment 1\\Zwift-Assignment\\chromedriver.exe\"");
        WebDriver driver = new ChromeDriver();
    }
}
