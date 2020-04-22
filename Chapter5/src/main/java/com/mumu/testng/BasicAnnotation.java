package com.mumu.testng;

import org.testng.annotations.*;

public class BasicAnnotation {
    @BeforeMethod
    public void testBefore() {
        System.out.println("这是测试方法执行之前");
    }

    @Test
    public void testCase01() {
        System.out.println("这是测试方法");

    }

    @AfterMethod
    public void testAfter() {
        System.out.println("这是测试方法执行之后");
    }


}
