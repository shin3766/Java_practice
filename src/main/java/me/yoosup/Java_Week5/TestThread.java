package me.yoosup.Java_Week5;

public class TestThread extends Thread {
    @Override
    public void run() {
        //쓰레드 수행작업
        for (int i = 0; i < 100; i++) {
            System.out.print("*");
        }
    }

    public static void main(String[] args) {
        TestThread testThread = new TestThread();
        testThread.start();
    }
}
