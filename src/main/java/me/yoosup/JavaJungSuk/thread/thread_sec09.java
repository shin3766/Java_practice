package me.yoosup.JavaJungSuk.thread;

public class thread_sec09 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        for(int i = 0; i < 300; i++) {
            System.out.printf("%s", "-");
        }
        System.out.println("소요시간1: " + (System.currentTimeMillis() - startTime));

        for(int i = 0; i < 300; i++) {
            System.out.printf("%s", "a");
        }
        System.out.println("소요시간1: " + (System.currentTimeMillis() - startTime));

    }
}
