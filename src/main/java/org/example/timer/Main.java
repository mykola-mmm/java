package org.example.timer;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            private int counter = 10;
            @Override
            public void run() {
                if(counter>0) {
                    System.out.println("counter - " + counter);
                    counter--;
                }
                else {
                    System.out.println("Task is complete");
                    timer.cancel();
                }
            }
        };

//        timer.schedule(task, 0 );


        Calendar date = Calendar.getInstance();
        date.set(Calendar.YEAR,2024);
        date.set(Calendar.MONTH,Calendar.JUNE);
        date.set(Calendar.DAY_OF_MONTH,11);
        date.set(Calendar.HOUR_OF_DAY,13);
        date.set(Calendar.MINUTE, 58);

//        timer.schedule(task, date.getTime());
        timer.scheduleAtFixedRate(task, 0, 1000 );
    }
}
