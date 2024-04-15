package me.yoosup.Java_Week4.jungsuk_exception;

import java.util.Scanner;

public class ex8_7 {
    public static void main(String[] args) {
        int answer = (int) (Math.random() * 100) + 1;
        int input;
        int count = 0;
        boolean check = true;

        do {
            count++;
            System.out.println("1과 100사이 수 입력");

            try {
                input = new Scanner(System.in).nextInt();
            } catch (Exception e) {
                System.out.println("유효한 수 plz");
                continue;
            }


            if (answer > input) {
                System.out.println("up");
            } else if (answer < input) {
                System.out.println("down");
            } else {
                System.out.println("correct");
                System.out.println("count :" + count);
                break;
            }
        } while (true);
    }
}
