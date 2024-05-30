package me.yoosup.JavaJungSuk.thread;

import javax.swing.*;

public class Thread_sec12 {
    /**
     * 하나의 쓰레드로 작업하기 때문에
     * 입력을 대기하는 시간에도 다른 쓰레드의 작업은 실행되지 않는다.
     * */
    public static void main(String[] args) {
        String  input = JOptionPane.showInputDialog("아무값입력");
        System.out.println(input+"입니다.");

        for(int i = 10; i> 0 ; i--) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {}
        }
    }
}
