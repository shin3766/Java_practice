package me.yoosup.JavaJungSuk.lambda.md0528;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * 컬렉션 프레임웍과 함수형 인터페이스 예제 하이라이트
 * 1. 컬렉션 프레임웍에 있는 디폴트 메서드들을 사용해본다.
 *
 */
public class lambda_sec12 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i =0; i< 10 ; i++) {
            list.add(i);
        }

        // list의 모든 요소 출력
        list.forEach(i -> System.out.print(i + ", "));
        System.out.println();

        // list에서 2 또는 3의 배수를 제거한다.
        list.removeIf(i -> i%2 ==0 || i%3 == 0);
        System.out.println(list);

        list.replaceAll(i -> i*10);
        System.out.println(list);

        Map<String, String> map = new HashMap<>();
        map.put("1", "1");
        map.put("2", "2");
        map.put("3", "3");
        map.put("4", "4");

        map.forEach((k, v) -> System.out.println("{ k = " + k + ", v : " + v + "}"));
        System.out.println();
    }
}
