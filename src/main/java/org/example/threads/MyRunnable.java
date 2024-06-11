package org.example.threads;

public class MyRunnable implements Runnable{
    @Override
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("counter - " + i);
            if (i ==5) {
                int a = 10/0;
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("thread b is finished");
    }

}
