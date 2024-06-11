package org.example.threads;

public class MyThread extends Thread{

    @Override
    public void run(){
        System.out.println("this thread is running");
        System.out.println("number of active threads - " + Thread.activeCount());
        System.out.println("active thread name - " + Thread.currentThread().getName());
        System.out.println("is active - " + Thread.currentThread().isAlive());
        if(Thread.currentThread().isDaemon()) {
            System.out.println("this thread  is daemon");
        } else {
            System.out.println("this is user thread");
        }
    }
}
