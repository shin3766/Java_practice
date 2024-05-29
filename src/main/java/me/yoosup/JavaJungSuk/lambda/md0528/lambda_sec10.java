package me.yoosup.JavaJungSuk.lambda.md0528;

import java.util.function.Predicate;

/**
 * Predicate의 결합 예제 하이라이트
 * 1. Predicate의 결합을 해본다.
 * 2. isEqual()을 사용해본다.
 */
public class lambda_sec10 {
    public static void main(String[] args) {
        Predicate<Integer> p = i -> i < 100;
        Predicate<Integer> q = i -> i < 200;
        Predicate<Integer> r = i -> i % 2 == 0;
        Predicate<Integer> notP = p.negate();

        Predicate<Integer> all = notP.and(q.or(r));
        System.out.println(all.test(150));

        // isEqual() 만들기
        String str1 = "abc";
        String str2 = "abc";

        Predicate<String> pp = Predicate.isEqual(str1);
        boolean result = pp.test(str2);

        // str1과 str2가 같은지 비교 -> isEqual()을 한줄로 바꾸기
        boolean result1 = Predicate.isEqual(str1).test(str2);

        System.out.println("result : " + result);
        System.out.println("result1 : " + result1);
    }
}
