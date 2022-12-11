package com.fgc.file;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {
    public static void main(String[] args) {
        FileOutputStream fileOutputStream=null;
        try {
            fileOutputStream=new FileOutputStream("F:/test/test1.txt",true);
            fileOutputStream.write(97);
            fileOutputStream.write(98);
            fileOutputStream.write(99);

            String str="hello world";
            byte [] bytes=str.getBytes();

            fileOutputStream.write(bytes);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
