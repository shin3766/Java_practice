package me.yoosup.JavaJungSuk.thread.md0523;

/**
 * sleep() 예제
 */
public class thread_sec23 {
    public static void main(String[] args) {
        ThreadEx8_1 th1 = new ThreadEx8_1();
        ThreadEx8_2 th2 = new ThreadEx8_2();
        th1.start(); th2.start();

        try {
            th1.sleep(2000);  // th1을 2초동안 멈추려고 하지만 실제로는 main쓰레드가 영향을 받는다. 리펙토링 -> Thread.sleep(2000);
        } catch (InterruptedException e) {}

        System.out.println("<main 종료>");
    }
}

class ThreadEx8_1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 300; i++) System.out.printf("-");
        System.out.printf("<th1 종료>");
    }
}

class ThreadEx8_2 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 300; i++) System.out.printf("|");
        System.out.printf("<th2 종료>");
    }
}

