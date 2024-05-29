package me.yoosup.JavaJungSuk.lambda.md0528;

import java.util.function.Predicate;

/**
 * Predicate의 결합 하이라이트
 * 1. and, or, nagate 연산자 사용법
 * 2. static 메서드 isEqual()의 사용법 :: 두 대상을 비교하는 Predicate를 만들때 사용
 */

/**
 *
 */
public class lambda_sec09 {

    public static void main(String[] args) {


        Predicate<Integer> p = i -> i < 100;
        Predicate<Integer> q = i -> i < 200;
        Predicate<Integer> r = i -> i % 2 == 0;
        Predicate<Integer> notP = p.negate();

        Predicate<Integer> all = notP.and(q.or(r));
        System.out.println(all.test(150));

        // 다른 예시
        Predicate<Integer> alls = notP.and(i -> i <200).or(i -> i%2 == 0);
        System.out.println(alls.test(120));

        // isEqual() 만들기
        String str1 = "hi";
        String str2 = "bye";

        Predicate<String> pp = Predicate.isEqual(str1);
        boolean result = pp.test(str2);

        // str1과 str2가 같은지 비교 -> isEqual()을 한줄로 바꾸기
        boolean result1 = Predicate.isEqual(str1).test(str2);
    }
}
