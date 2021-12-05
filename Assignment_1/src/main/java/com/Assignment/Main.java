package com.Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args){
        System.out.println("Hello World");

        WebDriver driver = initiateChromeDriver();
        test_1(driver);


 //       driver.quit();
    }
    protected static WebDriver initiateChromeDriver(){
        String path = System.getProperty("user.dir");
        System.out.println(path);
        System.setProperty("webdriver.chrome.driver",path+"\\src\\main\\resources\\chromedriver.exe");
//        System.setProperty("webdriver.chrome.driver",path+"\\classes\\chromedriver.exe");

        return new ChromeDriver();
    }
    protected static void test_1(WebDriver d){
        //initiate the first test
        Problem_1 p1 = new Problem_1(d);
        //Test if we can connect to Zwift website
        if(p1.testConnection()){
            System.out.println("Connection test passed");
        }else {
            System.out.println("Connection test failed");
            //if we cannot connect to Zwift website, no further test can progress, so exit the program
            System.exit(3);
        }
        //Test if we can find the "Accept All" button for cookies.
        if(p1.testElementPresented()){
            System.out.println("Element truste-consent-button is presented");
        }else{
            System.out.println("Element truste-consent-button is not found");
        }

    }
}
