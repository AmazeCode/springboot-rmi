package com.zyd.rmi.client;

import com.zyd.rmi.service.UserService;

import java.rmi.Naming;

/**
 *  客户端
 */
public class ClientMain {

    public static void main(String[] args) throws Exception{
        UserService userService = (UserService)Naming.lookup("rmi://localhost:8888/UserService");
        String s = userService.sayHello("客户端");
        System.out.println(s);
    }
}
