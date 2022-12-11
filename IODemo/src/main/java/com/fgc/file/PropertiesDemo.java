package com.fgc.file;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.Set;

public class PropertiesDemo {
    public static void main(String[] args) throws Exception {

        Properties properties=new Properties();
        /*properties.setProperty("filename","test.properties");
        properties.setProperty("adsfds","aaaa");*/
        properties.load(new FileInputStream("test.properties"));
        System.out.println(properties);

        Set<String> keySet=properties.stringPropertyNames();
        for (String key:keySet){
            System.out.println(key);
            System.out.println(properties.get(key));
        }

    }
}
