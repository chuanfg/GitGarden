package com.fgc.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;

public class FileInputStreamDemo {

    public static void main(String[] args)  {
        FileInputStream fis=null;
        try {
           fis=new FileInputStream("hhh.txt");

           /*int b=fis.read();
           System.out.println((char)b);*/

           byte [] bytes=new byte[2];
           int lenght=0;
           while ((lenght=fis.read(bytes))!=-1){

               System.out.println(new String(bytes,0,lenght));
           }


          /* int a=fis.read(bytes);
            System.out.println(a);
            System.out.println(bytes);
            for (byte by:bytes){
                System.out.println((char) by);
            }*/


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
