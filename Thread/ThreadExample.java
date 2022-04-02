package com.pondit.Thread;

public class ThreadExample {

    public static void main(String[] args){


        System.out.println("Creating a new Thread from: "+ Thread.currentThread());
        ThreadExample threadExample= new ThreadExample();

        //threadExample.threadExecutor();
        //System.out.println("Hello World");

        var myThread= new MyThread();


        System.out.println("Leaving From: "+Thread.currentThread());

    }


    public void threadExecutor(){
        Runnable runnable = () -> {
            var t = Thread.currentThread();
            System.out.println("Creating a new Thread from: "+ t);
            System.out.println(t.getName());
            System.out.println(t.getId());
        };

        var thread = new Thread(runnable);
        thread.start();
    }
}
