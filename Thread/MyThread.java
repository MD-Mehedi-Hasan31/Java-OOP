package com.pondit.Thread;

public class MyThread extends Thread{

    @Override
    public void run(){
        System.out.println("Execution Code is: "+ Thread.currentThread());
        System.out.println("Hello World");
    }

}
