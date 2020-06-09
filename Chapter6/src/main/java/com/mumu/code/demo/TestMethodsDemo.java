package com.mumu.code.demo;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestMethodsDemo {
    @Test
    public void test1(){
        Assert.assertEquals(1,2);
    }
    @Test
    public void test2(){
        Assert.assertEquals(2,2);
    }
    @Test
    public void test3(){
        Assert.assertEquals("qqqqq","qqqqq");
    }
    @Test
    public void logDemo(){
        Reporter.log("这是我记录的日志");
        throw new RuntimeException("这是我自己的运行是异常");
    }
}
