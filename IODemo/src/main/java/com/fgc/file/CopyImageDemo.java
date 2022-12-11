package com.fgc.file;

import java.io.*;

public class CopyImageDemo {
    public static void main(String[] args) {

        FileInputStream fis=null;
        FileOutputStream fos = null;
        try {
            fis=new FileInputStream("car.jpg");
            fos=new FileOutputStream("car_copy.jpg",true);

            byte []bytes=new byte[1024];

            int lenght;
            while((lenght=fis.read(bytes))!=-1){
                fos.write(bytes,0,lenght);
            }
            System.out.println("复制完毕");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fos.close();
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
