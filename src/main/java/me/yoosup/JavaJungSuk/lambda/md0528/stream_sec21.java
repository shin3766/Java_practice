package me.yoosup.JavaJungSuk.lambda.md0528;

/**
 * 스트림 만들기 - 람다식 iterate(), generate()
 * 1. iterate()와 generate() 사용법 :: 람다식을 매개변수로 받아서, 이 식에 의해 계산되는 값들을 요소로 하는 무한 스트릠을 생성한다.
 * 2. 두 메서드의 주의점
 */

import java.util.stream.Collector;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * 1.
 * static <T> Stream<T> iteerate( T seed, UnaryOperator<T> f)
 * static <T> Stream<T> generate(Supplier<T> s)
 *
 * iterater는 seed 값을 시작으로 람다식 f에 계산된 결과를 다시 seed로 계산을 반복한다.
 * generate는 iterate와 달리 이전 결과를 이용해서 다음 요소를 계산하지 않는다. -> 매개변수가 없는 람다식만 허용
 *
 * 2. 주의점
 * iterate와 generate에 의해 생성된 스트림은 기본형 스트림타입 (IntStream, LongStream)의 참조변수로 다룰 수 없다
 * -> 굳이 필요하다면 mapToInt()와 같은 메서드로 변환해야한다.
 *
 */

public class stream_sec21 {
    public static void main(String[] args) {

        // iterator()
        Stream<Integer> evenStream = Stream.iterate(0, i -> i + 2).limit(5);

        // generator()
        Stream<Integer> oneStream = Stream.generate(() -> 1).limit(5);

        evenStream.forEach(System.out::println);
        oneStream.forEach(System.out::println);

        // 기본형 스트림은 에러가 난다
//        IntStream evenStream1 = Stream.iterate(0, i -> i+ 2); <- 에러
//        DoubleStream randomStream = Stream.generate(Math::random); <- 에러

        // mapToInt() 사용
        IntStream evenStream2 = Stream.iterate(0, i -> i+2).mapToInt(Integer::valueOf);
        Stream<Integer> stream = evenStream2.boxed(); // IntStream을 Stream<Integer>로 변환
    }
}
