package me.yoosup.Java_Week3.classmember;

/*
* 공부한 내용 :: 메서드 간의 호출과 참조
*
* 클래스 메서드, a와 인스턴스 메서드, b를 각각 생성한 후,
* 다른 인스턴스 메서드와 클래스 메서드에서 사용을 확인한다.
*
*
* 배운 것 :: 인스턴스 멤버는 항상 클래스 멤버와 인스턴스 멤버를 호출할 수 있지만,
*           클래스 멤버는 클래스 멤버만 호출 가능하다. (인스턴스 멤버 x)
*
* */

public class testClassAndInstance {
    void a() {}
    static void b() {}

    void instanceMethod() {
        a();
        b();
    }

    static void staticMethod() {
//        a();
        b();
    }
}


