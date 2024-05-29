package me.yoosup.JavaJungSuk.lambda.md0528;

import java.util.function.Function;

/**
 * 메서드 참조 하이라이트
 * 1. 람다식이 하나의 메서드만 호출하는 경우 메서드 참조라는 방법으로 간략화 할 수 있다.
 * 2. 하나의 메서드만 호출하는 람다식은 '클래스 이름::메서드 이름' 또는 '참조변수::메서드이름' 으로 바꿀 수 있다.
 */

/**
 * static 메서드 참조       :: (x) -> ClassName.method(x) -> ClassName::method
 * 인스턴스 메서드 참조       :: (obj, x) -> obj.method(x) -> ClassName::method
 * 특정객체 인스턴스메서드참조 :: (x) -> obj.method(x) -> obj::method (존재하는 객체의 메서드)
 */
public class lambda_sec13 {
    // 기존의 람다식
    Function<String, Integer> f = (String s) -> Integer.parseInt(s);

    // 메서드 참조를 사용한 람다식
    Function<String, Integer> f1 = Integer::parseInt; //메서드참조
}
