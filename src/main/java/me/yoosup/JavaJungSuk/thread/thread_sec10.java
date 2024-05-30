package me.yoosup.JavaJungSuk.thread;

public class thread_sec10 {
    public static long startTime = 0;

    public static void main(String[] args) {
        Runnable r = new ThreadEx3_1();
        Thread th1 = new Thread(r);
        th1.start();
        startTime = System.currentTimeMillis();

        for (int i = 0; i < 300; i++) {
            System.out.printf("%s", "-");
        }
        System.out.println("소요시간1: " + (System.currentTimeMillis() - thread_sec10.startTime));

    }
}

class ThreadEx3_1 implements Runnable {
    @Override
    public void run() {
        for(int i = 0; i < 300; i++) {
            System.out.printf("%s", "|");
        }
        System.out.println("소요시간2: " + (System.currentTimeMillis() - thread_sec10.startTime));

    }
}