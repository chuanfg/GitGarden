package com.fgc.file;

import java.io.File;
import java.io.IOException;

public class FileDemo {

    public static void main(String[] args) throws IOException {
        File file5=new File("hhh.txt");
        file5.createNewFile();
        System.out.println(file5.getAbsolutePath());


        //File file=new File("F:/test1.txt");
                File file=new File("F:/test");
                file.mkdir();
                //file.delete();
                file.createNewFile();
                System.out.println("文件的绝对路径是 "+file.getAbsolutePath());
                System.out.println("文件的名称 "+file.getName());
                System.out.println("文件父目录"+file.getParent());
                System.out.println("是否目录"+file.isDirectory());
                System.out.println("是否文件"+file.isFile());
                System.out.println("文件大小"+file.length());
                System.out.println("是否目录"+file.exists());
                System.out.println("是否目录"+file.isDirectory());

                File dir =new File("F:\\dir\\dir1\\dir2");
                if(!dir.exists()){
                    boolean b=dir.mkdirs();
                    System.out.println("创建文件夹"+dir.getName()+b);
                }else{
                    System.out.println("文件夹已存在");
                }

                String [] list=dir.list();
                for (String  str: list){
                    System.out.println(str);
                }

                File [] files=dir.listFiles();
                for (File file1:files){
                    System.out.println(file1);
                }

                File file3 =new File("F:\\dir");
                printDir(file3);
            }

            public static  void printDir(File dir){

                if(dir.isFile()){
                    System.out.println(dir.getName());
                }else{
                    File [] files=dir.listFiles();
                    for (File file:files){
                        printDir(file);
            }
        }


    }


}
