package com.fgc.file;

import java.io.*;

public class InputStreamReaderDemo {
    public static void main(String[] args)throws Exception {
        User user=new User();
        user.setName("张三");
        user.setAge("18");

        ObjectOutputStream outputStreamWriter=new ObjectOutputStream(new FileOutputStream("user.txt"));
        outputStreamWriter.writeObject(user);

        outputStreamWriter.close();


    }

}
