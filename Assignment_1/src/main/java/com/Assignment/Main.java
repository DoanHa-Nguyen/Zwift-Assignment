package com.Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args){
        System.out.println("Hello World");

        WebDriver driver = initiateChromeDriver();
        Problem_1 p1 = new Problem_1(driver);
        p1.testConnection();

        driver.quit();
    }
    protected static WebDriver initiateChromeDriver(){
        String path = System.getProperty("user.dir");
        System.out.println(path);
        System.setProperty("webdriver.chrome.driver",path+"\\src\\main\\resources\\chromedriver.exe");
//        System.setProperty("webdriver.chrome.driver",path+"\\classes\\chromedriver.exe");

        return new ChromeDriver();
    }
}
