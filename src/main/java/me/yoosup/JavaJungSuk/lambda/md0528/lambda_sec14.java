package me.yoosup.JavaJungSuk.lambda.md0528;

import java.util.function.Function;
import java.util.function.Supplier;

/**
 * 생성자의 메서드 참조 하이라이트
 * 1. 생성자를 호출하는 람다식도 메서드 참조로 변환가능하다
 * 2. 매개변수가 있는 생성자라면, 매개변수의 개수에 따라 알맞은 함수형 인터페이스를 사용하면 된다.
 */

public class lambda_sec14 {

    public static void main(String[] args) {
        // 메서드 참조를 사용한 생성자
//        Supplier<MyClass> s = () -> new MyClass();
//        Supplier<MyClass> ss = MyClass::new;

        // 매개변수가 있는 생성자
//        Function<Integer, MyClass> f = (i) -> new MyClass();
//        Function<Integer, MyClass> ff = MyClass::new;

//        BiFunction<Integer, String, MyClass> bf = (i, s) -> new MyClass(i, s);
//        BiFunction<Integer, String, MyClass> bff = MyClass::new;

        // 배열을 생성할 때
//        Function<Integer, int[]> f1 = x -> new int[x];
//        Function<Integer, int[]> f2 = int[]::new;
    }
}
