package com.fgc.file;

import java.io.*;

public class BufferDemo implements Serializable {


    public static void main(String[] args) throws  Exception{

        BufferedInputStream bis=new BufferedInputStream(new FileInputStream("hhh.txt"));

        BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("hhh_copy.txt"));

        int lenght=0;
        byte [] bytes=new byte[1024];
        while ((lenght=bis.read(bytes))!=-1){
            bos.write(bytes,0,lenght);
        }

        bos.close();
        bis.close();

        int i=Runtime.getRuntime().availableProcessors();
        System.out.println(i);
    }
}
