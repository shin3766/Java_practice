package me.yoosup.Java_Week5;

public class TestDaemonThread {
    public static void main(String[] args) {
        Runnable demon = () -> {
            for(int i = 0; i < 1000000; i++) {
                System.out.println("demon");
            }
        };

        Thread thread = new Thread(demon);
        thread.setDaemon(true);

        thread.start();

        for(int i = 0; i < 10; i++) {
            System.out.println("main");
        }
    }
}
