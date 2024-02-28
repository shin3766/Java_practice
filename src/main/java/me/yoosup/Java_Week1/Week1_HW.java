package me.yoosup.Java_Week1;

import java.util.Scanner;

public class Week1_HW {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String title = sc.nextLine();
        double star = Double.parseDouble(sc.nextLine());

        String[] processes = new String[10];

        for (int i = 0; i < 10; i++) {
            processes[i] = i + 1 + ". " + sc.nextLine();
        }

        System.out.println(title);
        System.out.println(star);

        for (int i = 0; i < 10; i++) {
            System.out.println(processes[i]);
        }
    }
}

