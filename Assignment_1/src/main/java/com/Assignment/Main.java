package com.Assignment;

public class Main {
    public static void main(String[] args){
        setChromeDriverProperty();
        Problem_1 p1 = new Problem_1();
        p1.run();
        p1.finish();
        Problem_2 p2 = new Problem_2();
        p2.run();
        p2.finish();


    }
    protected static void setChromeDriverProperty(){
        String path = System.getProperty("user.dir");
        System.out.println(path);
        //This path is to be used when running from IDE.
//        System.setProperty("webdriver.chrome.driver",path+"\\src\\main\\resources\\chromedriver.exe");
        //This path is to be run when packaging to executable jar file (main reason is because user.dir change when creating jar file).
        System.setProperty("webdriver.chrome.driver",path+"\\classes\\chromedriver.exe");

    }

}
