package me.yoosup.Java_Week3.overloading;

/*
* 공부한 내용 :: 오버로딩
*
* 한 클래스 내에서 같은 이름의 메서드를 여러개 정의하는 것
*
* 오버로딩을 하려면 다음과 같은 조건을 만족해야한다.
* 1. 메서드 이름이 같아야한다.
* 2. 매개변수의 타입이나 개수가 달라야한다.
* 3. 반환 값은 관계없다.
*
* */

public class OverloadingPractice {

    // 입력받은 숫자의 타입에 따라 다른 결과가 나오게하는 메서드
    void say(int num) {
        System.out.println("int");
    }

    void say(long num) {
        System.out.println("long");
    }

    void say(char num) {
        System.out.println("char");
    }

    void say(String num) {
        System.out.println("String");
    }
}

class Overloading {
    public static void main(String[] args) {
        OverloadingPractice overloadingPractice = new OverloadingPractice();

        overloadingPractice.say(1);     // int
        overloadingPractice.say(1L);    // long
        overloadingPractice.say('1');   // char
        overloadingPractice.say("1");   // String
    }

}