package me.yoosup.Java_Week3.javajungsuk;

public class ex6_21 {

    static int abs(int value) {
        return (int) Math.sqrt(value * value);
    }

    public static void main(String[] args) {
        int value = 5;
        System.out.println(value + "의 절대값:" + abs(value));
        value = -10;
        System.out.println(value + "의 절대값:" + abs(value));
    }
}
