package me.yoosup.Java_Week5;

public class TestRunnable implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i <100; i++) {
            System.out.print("$");
        }
    }

    public static void main(String[] args) {
        Runnable run = new TestRunnable();
        Thread thread = new Thread(run);

        thread.start();
    }
}
