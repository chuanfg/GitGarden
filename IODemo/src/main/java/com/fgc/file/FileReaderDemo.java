package com.fgc.file;

import java.io.*;

public class FileReaderDemo {

    public static void main(String[] args) throws IOException {


        FileReader fr=new FileReader("hhh.txt");
        int a=fr.read();

        char [] chars=new char[2];
        fr.read(chars);
        System.out.println((char)a);

        FileWriter fw=new FileWriter("hhh.txt",true);
        fw.write("你好啊");
        fr.close();
        fw.close();

    }
}
