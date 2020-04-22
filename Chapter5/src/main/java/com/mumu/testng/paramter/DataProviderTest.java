package com.mumu.testng.paramter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

/**
 * DataProvider参数化测试
 */
public class DataProviderTest {
    @Test(dataProvider = "data")
    public void testDataProvider(String name , int age){
        System.out.println("name = " + name + "  age = " + age);
    }
    @DataProvider(name = "data")
    public Object[][] providerData(){
        Object[][] obj = new Object[][]{
                {"张三",20},
                {"李四",30},
                {"王五",40},
        };
        return obj;
    }

    @Test(dataProvider = "methodData")
    public void test1(String name , int age){
        System.out.println("test1方法运行   name = " + name + "  age = " + age);
    }
    @Test(dataProvider = "methodData")
    public void test2(String name , int age){
        System.out.println("test2方法运行   name = " + name + "  age = " + age);
    }
    @DataProvider(name = "methodData")
    public Object[][] mehtodDataTest(Method method){
        Object[][] obj = null;
        if(method.getName().equals("test1")){
            obj = new Object[][]{
                    {"张三",21},
                    {"李四",31},
                    {"王五",41},
            };
        }else if (method.getName().equals("test2")){
            obj = new Object[][]{
                    {"张三",22},
                    {"李四",32},
                    {"王五",42},
            };
        }
        return obj;

    }

}
