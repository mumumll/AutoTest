package com.mumu.testng;

import org.testng.annotations.Test;

/**
 * 忽略测试
 */
public class IgnoreTest {
    @Test
    public void ignore1() {
        System.out.print("igmore1 执行了");
    }

    @Test(enabled = false)
    public void ignore2() {
        System.out.println("igmore2 执行了");
    }

    @Test(enabled = true)
    public void ignore3() {
        System.out.println("igmore3 执行了");
    }
}
