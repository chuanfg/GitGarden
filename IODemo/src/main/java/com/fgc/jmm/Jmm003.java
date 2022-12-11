package com.fgc.jmm;
public class Jmm003 {
    private volatile static boolean initFlag=false;
    private  Integer i;
    public static void main(String[] args) {

        Thread threadA=new Thread(()->{
            while(initFlag) {

            }
            System.out.println();
        },"threadA");


    }
}
