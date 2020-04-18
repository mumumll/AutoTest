package com.mumu.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupsOnMethod {
    @Test(groups = "server")
    public void test1(){
        System.out.println("这是服务端的测试方法11111");
    }
    @Test(groups = "server")
    public void test2(){
        System.out.println("这是服务端的测试方法2222");
    }
    @Test(groups = "client")
    public void test3(){
        System.out.println("这是客户端的测试方法3333");
    }
    @Test(groups = "client")
    public void test4(){
        System.out.println("这是客户端的测试方法4444");
    }
    @BeforeGroups("server")
    public void beforeGroupsServer(){
        System.out.println("这是服务端分组运行前");
    }
    @AfterGroups("server")
    public void afterGroupsServer(){
        System.out.println("这是服务端分组运行后");
    }
    @BeforeGroups("client")
    public void beforeGroupsClient(){
        System.out.println("这是客户端分组运行前");
    }
    @AfterGroups("client")
    public void afterGroupsClient(){
        System.out.println("这是客户端分组运行后");
    }

}
