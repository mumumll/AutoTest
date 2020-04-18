package com.mumu.testng.suite;

import org.testng.annotations.*;

public class SuiteConfig {

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("before suite 运行了");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("after suite 运行了");
    }
    @BeforeTest
    public void beforeMethod(){
        System.out.println("BeforeTest");
    }
    @AfterTest
    public void afterMethod(){
        System.out.println("afterTest");
    }

}
