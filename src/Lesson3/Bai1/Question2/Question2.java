package Lesson3.Bai1.Question2;

import java.io.*;
import java.util.Random;

public class Question2 {
        private  String vietNamDay;
        private  boolean hasDay = false;
        private  final String[] vietNamDays = {"Thu Hai","Thu Ba","Thu Tu","Thu Nam","Thu Sau","Thu Bay","Chu Nhat"};
        private  final String[] englishDays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday","Sunday"};

        public synchronized void  randomVietDay(){
            try {
                Thread.sleep(1000);
                Random random = new Random();
                int dayIndex = random.nextInt(7);
                vietNamDay = vietNamDays[dayIndex];
                System.out.println("Viet Nam Day: " + vietNamDay);

                notify();
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }

        public  synchronized void englishDay(){
            try {
                while (!hasDay) {
                    wait();
                }

                for (int i = 0; i < vietNamDays.length; i++) {
                    if (vietNamDay.equals(vietNamDays[i])) {
                        System.out.println("English day: " + englishDays[i]);
                        break;
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    public static void main(String[] args) {
            Question2 newTask  = new Question2();
        Thread thread1 = new Thread(new Runnable(){
                public void run(){
                    newTask.randomVietDay();
        }
        });

        Thread thread2 = new Thread(new Runnable(){
            public void run(){
                newTask.englishDay();
            }
        });

        thread1.start();
        thread2.start();
    }
}


