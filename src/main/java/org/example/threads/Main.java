package org.example.threads;

public class Main {
    public static void main(String[] args) throws InterruptedException {
//        Thread.currentThread().setName("MAAAAAIN");
////        System.out.println(Thread.activeCount());
////        System.out.println(Thread.currentThread().getName());
////        System.out.println(Thread.currentThread().getPriority());
////        Thread.currentThread().setPriority(10);
////        System.out.println(Thread.currentThread().getPriority());
////        System.out.println(Thread.currentThread().isAlive());
//
////        for(int i = 3; i > 0; i--){
////            System.out.println(i);
////            Thread.sleep(100);
////        }
////        System.out.println("finish line");
//
//        MyThread thread2 = new MyThread();
//        thread2.setDaemon(true);
//        thread2.setDaemon(false);
//        thread2.start();
////        thread2.run();
//        System.out.println(thread2.getName());
//        System.out.println(thread2.getPriority());
//        System.out.println(thread2.isDaemon());

        ThreadMy th1 = new ThreadMy();
        MyRunnable runnable1 = new MyRunnable();
        Thread th2 = new Thread(runnable1);
        th1.setDaemon(true);
        th2.setDaemon(true);
        th1.start();
        th1.join(3500);
        th2.start();
    }
}
