package com.zyd.rmi.service.impl;

import com.zyd.rmi.service.UserService;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *  实现
 */
public class UserServiceImpl extends UnicastRemoteObject implements UserService {


    public UserServiceImpl() throws RemoteException {
    }

    public String sayHello(String name) throws RemoteException{


        //name为客户端传递过来的值
        return name+"成功调用了服务端的服务";
    }
}
