package com.zyd.rmi.service;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *  RMI(远程接口调用)步骤：
 * 1、创建远程接口，并且集成java.rmi.Remote接口
 * 2、实现远程接口，并继承：UnicastRemoteObject
 * 3、创建服务多程序：createRegistry方法注册远程对象
 * 4、创建客户端程序（获取注册信息，调用接口方法）
 *
 * 注意：该接口所在的包层级，必须要和服务端的包层级一样
 */
public interface UserService extends Remote {

    public String sayHello(String name) throws RemoteException;
}
