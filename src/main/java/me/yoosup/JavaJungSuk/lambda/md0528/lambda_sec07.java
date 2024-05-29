package me.yoosup.JavaJungSuk.lambda.md0528;

/**
 * java.util.function 패키지 하이라이트
 * 1. 자주 쓰이는 함수형 인터페이스 :: Runnable, Supplier<T>, Consumer<T>, Function<T, R>, Predicate<T>
 * 2. 매개변수가 두개인 함수형 인터페이스 :: BiConsumer<T, U>, BiPredicate<T, U>, BiFunction<T, U, R>
 * 3. 두 개 초과의 매개변수를 갖는 함수형 인터페이스는 직접 구현 필요
 * 4. UnaryOperator과 BinaryOperator
 */

/**
 * Runnable :: 매개변수 X 반환값 X 함수형 인터페이스 -> 메서드 : run()
 * Supplier<T> :: 매개변수 X, 반환값 O 함수형 인터페이스 -> 메서드 : get()
 * Consumer<R> :: 매개변수 O, 반환값 X 함수형 인터페이스 -> 메서드 : accept(T t)
 * Function<T, R> :: 매개변수 O, 반환값 O 함수형 인터페이스 -> 메서드 : apply(T t)
 * Predicate<T> :: 매개변수 O, 반환값이 boolean인 함수형 인터페이스 -> 메서드 : test(T t)
 * BiConsumer<T, U> :: 매개변수가 2개, 반환값 X -> accept(T t, U u)
 * BiPredicate<T, U> :: 매개변수 2개, 반환값 boolean -> test(T t, U u)
 * BiFunction<T, U, R> :: 매개변수 2개, 반환값 1개 -> apply(T t U u)
 * UnaryOperator<T> :: Function의 자손, 매개변수의 타입과 반환타입이 같음
 * BinaryOperator<T t, U u> :: BiFunction의 자손, 매개변수 2개의 타입과 반환타입이 같음
 */

public class lambda_sec07 {

}
