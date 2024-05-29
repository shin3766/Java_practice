package me.yoosup.JavaJungSuk.lambda;

/**
 * 함수형 인터페이스 하이라이트
 * 1. 인터페이스와 그것으로 구현된 익명 클래스의 객체를 람다식으로 바꾸는 작업
 *  -> 람다식을 인터페이스로 구현하는 이유?
 * 2. 항수형 인터페이스란 람다식을 다루기 위한 인터페이스 :: @FunctionalInterface
 *
 */
public class lambda_sec05 {
    // 추상메서드 max가 선언된 인터페이스
    interface Myfunction {
        public abstract int max(int a, int b);
    }

    // 인터페이스를 구현한 익명 클래스의 객체
    /**
     * Myfunction f = new Myfunction() {
     *         @Override
     *         public int max(int a, int b) {
     *             return a > b ? a : b;
     *         }
     *     };
     *     int big = f.max(5, 3);
     */

    //익명 객체를 람다식으로 교체
    Myfunction f = (int a, int b) -> a > b ? a: b;

    // 익명 객체의 메서드를 호출
    int big = f.max(5, 3);

    // MyFunction인터페이스를 구현한 익명 객체를 람다식으로 대체가 가능한 이유는, 람다식도 익명객체이고, 위의 인터페이스를 구현한
    // 익명객체의 메서드 max()와 람다식의 매개변수의 타입과 개수 그리고 반환값이 일치하기 때문이다.
    // 하나의 메서드가 선언된 인터페이스를 정의해서 람다식을 다루는 것은 기존의 자바 규칙들을 어기지 않으면서도 자연스럽다.
    // -> 그래서! 인터페이스를 이용해 람다식을 다루기로 결정되었고, 람다식을 다루기 위한 인터페이스를 함수형 인터페이스라 한다.
    // 단!!! 함수형 인터페이스에는 오직 하나의 추상 메서드만 정의되어야하는 제약이 있다. 그래야만 람다식과 1대1로 연결될 수 있기 때문
}
