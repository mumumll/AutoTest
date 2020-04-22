package com.mumu.testng.multiThread;

import org.testng.annotations.Test;

/**
 * 基于注解的多线程测试，没有关联的用例可以使用多线程，减少执行时间
 * 以下演示3个线程同时运行，共执行10次
 */
public class MultiThreadOnAnnotation {
    @Test(invocationCount = 10,threadPoolSize = 3)
    public void test() {
        System.out.println("*************hello world**************");
        System.out.printf("Thread Id : %s%n",Thread.currentThread().getId());
    }
}
