package com.fgc.file;

import sun.security.util.PendingException;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ObjectInput {

    public static void main(String[] args) throws Exception {

        ObjectInputStream objectInputStream=new ObjectInputStream(new FileInputStream("user.txt"));
        User user=(User) objectInputStream.readObject();
        System.out.println(user);
    }
}
