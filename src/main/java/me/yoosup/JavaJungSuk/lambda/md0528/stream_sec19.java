package me.yoosup.JavaJungSuk.lambda.md0528;

/**
 * 스트림 만들기 - 임의의 수 하이라이트
 * 1. 난수들로 이루어진 스트림을 반환하는 방법
 *
 */

/**
 * 1.
 * Random 클래스에는 난수를 생성하는 stream을 제공한다.
 *
 * 무한스트림으로 만드는법 ::
 * IntStream ints()
 * LongStream longs()
 * DoubleStream doubles()
 * -> 크기가 정해지지 않은 무한 스트림으로 limit을 같이 사용해야한다.
 *
 * IntStream intStream = new Random().ints();
 * intStream.limit(5).forEach(System.out::println);
 *
 * 유한스트림으로 만드는 법 ::
 * IntStream ints(long streamSize)
 * LongStream longs(long streamSize)
 * DoubleStream doubles(long streamSize)
 *
 * IntStream intStream = new Random().ints(5);
 *
 * 위 메서드들로 생성하는 스트림의 난수는 아래와 같은 범위를 가진다.
 * Integer.MIN_VALUE <= ints() <= Integer.MAX_VALUE
 * Long.MIN_VALUE <= longs() <= Long.MAX_VALUE
 * 0.0 <= doubles() < 1.0
 */
public class stream_sec19 {
}
