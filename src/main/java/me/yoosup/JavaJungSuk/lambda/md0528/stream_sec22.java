package me.yoosup.JavaJungSuk.lambda.md0528;

import java.nio.file.Path;
import java.util.stream.Stream;

/**
 * 스트림 만들기 - 파일과 빈 스트림
 * 1. list() :: 지정된 디렉토리의 파일 목록을 소스로 스트림 생성
 * 2. empty() :: 빈스트림 생성 -> 스트림 연산 수행결과가 없을때, null보다 빈스트림을 반환하는게 낫다.
 */
public class stream_sec22 {
    public static void main(String[] args) {
        // 파일 (path는 하나의 파일 또는 경로)
//        Stream<Path> Files.list(Path dir)

        // 파일의 한 행을 요소로 하는 스트림 생성 메서드
        // Stream<String> Files.lines(Path path)
        // Stream<String> Files.lines(Path path, Charset cs)
        // Stream<String> lines()    <- bufferedReader클래스의 메서드

        // 빈 스트림 생성
        Stream<?> emptyStream = Stream.empty();   // empty() 빈 스트림 생성
        long count = emptyStream.count();      // 요소의 갯수는 0
    }
}
