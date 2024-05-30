package me.yoosup.JavaJungSuk.thread.md0526;


class thread13_1 extends Thread{
    @Override
    public void run() {
        for(int i =0; i < 300; i++) {
            System.out.print('-');
        }
    }
}

class thread13_1_1 implements Runnable {
    @Override
    public void run() {
        for(int i = 0; i< 300; i++) {
            System.out.print('|');
        }
    }
}
public class thread_hw01 {
    public static void main(String[] args) {
        Runnable r = new thread13_1_1();
        Thread th1 = new thread13_1();
        Thread th2 = new Thread(r);

        th1.start();
        th2.start();

    }
}
