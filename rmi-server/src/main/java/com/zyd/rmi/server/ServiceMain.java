package com.zyd.rmi.server;

import com.zyd.rmi.service.UserService;
import com.zyd.rmi.service.impl.UserServiceImpl;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

/**
 * 服务端启动类
 */
public class ServiceMain {

    public static void main(String[] args) throws Exception {

        //1、启动RMI注册服务，指定端口号
        LocateRegistry.createRegistry(8888);

        //2、创建要被访问的远程对象的实例(多态)
        UserService userService = new UserServiceImpl();

        //3、把远程对象实例注册到RMI注册服务器上(格式不能修改：rmi://localhost:8888/UserService)
        Naming.bind("rmi://localhost:8888/UserService",userService);

        System.out.println("服务端启动中.........");
    }
}
