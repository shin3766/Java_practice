package me.yoosup.JavaJungSuk.lambda.md0528;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * 스트림 만들기 - 컬렉션
 * 1. 컬렉션들의 최고 조상 클래서 Collection에 stream()이 정의되어 있다.
 * 2. forEach()를 두번 호출할 수 없다.
 */

public class stream_sec17 {
    public static void main(String[] args) {
        // Collection 인터페이스의 메서드
        //Stream<E> stream()

        // 스트림 생성 예제
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        Stream<Integer> listStream = list.stream();

        // forEach 사용
        listStream.forEach(System.out::println);
//        listStream.forEach(System.out::println);  <- 스트림은 재사용이 안되기 때문에 중복해서 사용할 수 없다.
    }
}
