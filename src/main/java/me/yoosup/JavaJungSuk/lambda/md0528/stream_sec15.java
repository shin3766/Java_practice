package me.yoosup.JavaJungSuk.lambda.md0528;

/**
 * 스트림 하이라이트
 * 1. 스트림이 나오기전의 상황
 * 2. 스트림의 장점
 * 3. 스트림 사용 예시
 */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * 1. 스트림이 나오기 전의 상황
 * 데이터를 다룰 때 for문, iterator 사용 -> 재사용성 어려움, 너무길고 알아보기 어려움
 * 데이터 소스마다 다른 방식으로 다뤄야함 -> Arrays.sort(), Collections.sort() 같이 같은 의미의 메서드도 다르게 작성해야함
 * <p>
 * 2. 스트림의 장점
 * 데이터 소스를 추상화해서 데이터를 다루는데 자주 사용되는 메서드들을 정의해 놓았다. -> 데이터 소스가 무엇이던 간에 같은 방식으로 다룰 수 있음
 */

public class stream_sec15 {
    public static void main(String[] args) {

        // 3. 스트림 사용 예시
        String[] strArr = {"aaa", "ddd", "ccc"};
        List<String> strList = Arrays.asList(strArr);

        Stream<String> strStream1 = strList.stream();        // 스트림 생성
        Stream<String> strStream2 = Arrays.stream(strArr);   // 스트림 생성

        strStream1.sorted().forEach(System.out::println);
        strStream2.sorted().forEach(System.out::println);  // 데이터 소스가 정렬되지 않는다.
    }
}
