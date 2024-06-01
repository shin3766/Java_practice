package me.yoosup.JavaJungSuk.lambda.md0528;

/**
 * 스트림 만들기 - 특정 범위의 정수
 * 1. range()와 rangeClosed() :: IntStream과 LongStream은 지정된 범위의 연속된 정수를 스트림으로 생성
 * 2. 지정된 범위의 난수를 발생시키는 스트림
 */

public class stream_sec20 {
    public static void main(String[] args) {
        // range()와 rangeClosed() :: 지정된 범위의 연속된 정수
        // IntStream IntStream.range(int begin, int end)
        // IntStream IntStream.rangeClosed(int begin, int end)

        // 예
        // IntStream intStream = IntStream.range(1, 5);
        // IntStream intStream = IntStream.rangeClosed(1, 5);

        // 지정된 범위의 난수 (end는 범위에 포함되지 않는다.)
        // IntStream ints(int begin, int end)
        // LongStream longs(int begin, int end)
        // DoubleStream doubles(int begin, int end)

        // IntStream ints(long streamSize, int begin, int end)
        // LongStream longs(long streamSize, int begin, int end)
        // DoubleStream doubles(long streamSize, int begin, int end)

    }
}
