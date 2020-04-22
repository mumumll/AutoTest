package com.mumu.testng;

import org.testng.annotations.Test;

/**
 * 超时测试
 */
public class TimeOutTest {
    @Test(timeOut = 1000)
    public void testcase1(){
        try {
            Thread.sleep(999);
            System.out.println("testcase1");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Test(timeOut = 1000)
    public void testcase2(){
        try {
            Thread.sleep(2000);
            System.out.println("testcase2");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void testcase3(){
        System.out.println("testcase3");
    }
}
