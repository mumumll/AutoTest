package com.mumu.testng.groups;

import org.testng.annotations.Test;

/**
 * 类分组测试
 */
@Test(groups = "teacher")
public class GroupsOnClass3 {
    public void teacher1() {
        System.out.println("GroupsOnClass3中的teacher11111111运行");
    }

    public void teacher2() {
        System.out.println("GroupsOnClass3中的teacher2222222运行");
    }
}
