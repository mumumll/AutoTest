package com.mumu.testng.groups;

import org.testng.annotations.Test;

@Test(groups = "stu")
public class GroupsOnClass1 {
    public void stu1(){
        System.out.println("GroupsOnClass1中的stu1111111运行");
    }
    public void stu2(){
        System.out.println("GroupsOnClass1中的stu2222222运行");
    }
}
