package com.mumu.testng;

import org.testng.annotations.Test;

public class ExpectedException {
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionFailed(){
        System.out.println("这是一个运行失败的异常");
    }
    @Test(expectedExceptions =  RuntimeException.class)
    public void runTimeExceptionSuccess(){
        System.out.println("这是一个成功的运行异常测试");
        throw new RuntimeException();

    }
}
