package com.mumu.testng;

import org.testng.annotations.Test;

/**
 * 依赖测试
 */
public class DependTest {
    @Test(expectedExceptions = RuntimeException.class)
    public void test1() {
        System.out.println("test1 run");
        throw new RuntimeException();
    }

    @Test(dependsOnMethods = {"test1"})
    public void test2() {
        System.out.println("test2 run");
    }
}
