package me.yoosup.JavaJungSuk.lambda;

/**
 * 람다식은 익명함수? 익명객체!
 * 1. 람다식의 뿌리
 *
 */

/**
 * 1. 람다식의 뿌리
 * 자바의 모든 메서드는 클래스내에 포함되어야하는데, 람다식은 어떤 클래스에 포함되는 것일까?
 * -> 람다식이 메서드와 동일한 것처럼 설명됐지만, 사실 람다식은 익명 클래스의 객체와 동등하다.
 *
 */

public class lambda_sec04 {

    /**
     * (int a, int b) -> a > b ? a: b
     * ==
     * new Object() {
        int max(int a, int b) {
            return a > b ? a : b;
        }
     }
     */

    /**
     * 람다식으로 정의된 익명 객체의 메서드를 어떻게 호출할 수 있을까?
     * 1. 참조변수가 있어야 객체의 메서드를 호출할 수 있으므로 객체의 주소를 f라는 참조변수에 저장해보자
     *  -> 타입 f = (int a, int b) -> a > b ? a: b;
     *
     *  2. 위의 식에서 참조 변수 f의 타입은 어떤 것이어야할까?
     *  - 참조형이니까 class OR interface.
     *  - 람다식과 동등한 메서드가 정의되어 있는 것.
     */
}