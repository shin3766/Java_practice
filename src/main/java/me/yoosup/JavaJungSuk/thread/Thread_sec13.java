package me.yoosup.JavaJungSuk.thread;

import javax.swing.*;

import static java.lang.Thread.sleep;

public class Thread_sec13 {
    /**
     * 멀티쓰레드 예제::
     * 사용자가 입력을 마치지 않아도 다른 작업 쓰레드를 실행한다
     *
     *
     */
    public static void main(String[] args) {
        Runnable r = new ThreadEx5_1();
        Thread th1 = new Thread(r);

        th1.start();

        String input = JOptionPane.showInputDialog("아무값입력");
        System.out.println(input + "입니다.");

    }
}
class ThreadEx5_1 implements Runnable {
    @Override
    public void run() {
        for(int i = 10; i > 0 ; i--) {
            System.out.println(i);
            try {
                sleep(1000);
            } catch (Exception e){}
        }
    }
}