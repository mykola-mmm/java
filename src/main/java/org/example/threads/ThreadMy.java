package org.example.threads;

public class ThreadMy extends Thread{

    @Override
    public void run() {
        for (int i = 10; i > 0; i--) {
            System.out.println("counter - " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("thread a is finished");
    }
}
