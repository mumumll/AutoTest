package com.mumu.testng.paramter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * xml参数化测试
 */
public class ParameterTest {
    @Test
    @Parameters({"name", "age"})
    public void parameterTest1(String name, int age) {
        System.out.println("name = " + name + "  age = " + age);
    }
}
