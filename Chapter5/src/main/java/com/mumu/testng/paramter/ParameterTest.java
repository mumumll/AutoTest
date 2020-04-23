package com.mumu.testng.paramter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParamterTest {
    @Test(parameters ={"name","age"} )
//    @Parameters({"name","age"})
    public void paramterTest1(String name , int age){
        System.out.println("name = " + name + "  age = " + age);
    }
}
