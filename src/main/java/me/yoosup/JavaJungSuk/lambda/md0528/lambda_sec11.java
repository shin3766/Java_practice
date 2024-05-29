package me.yoosup.JavaJungSuk.lambda.md0528;

/**
 * 컬렉션 프레임웍과 함수형 인터페이스 하이라이트
 * 1. 컬렉션 프레임웍의 인서페이스에 다수의 디폴트 메서드가 추가되었는데, 그중의 일부는 함수형 인터페이스를 사용한다.
 */

/**
 * Collection :: boolean removeIf(Predicate<E> filter)        -> 조건에 맞는 요소 삭제
 * List       :: void replaceAll(UnaryOperator<E> operator)   -> 모든 요소를 변환하여 대체
 * Iterable   :: void forEach(Consumer<T> action)             -> 모든 요소에 작업 action을 수행
 * Map        :: V compute(K key, BiFunction<K, V, V> f)      -> 지정된 키의 값에 작업 f를 수행
 *            : V computeIfAbsent(K key, Function<K, V> f)    -> 지정된 키가 없을경우 작업 f를 수행
 *            : V computeIfPresent(K key, BiFunction<K, V> f) -> 지정된 키가 있을 때, 작업 f 수행
 *            : V merge(K key, V value, BiFunction<V, V, V> f) -> 모든 요소에 병합작업 f를 수행
 *            : void forEach(BiConsumer<K, V> action)          -> 모든 요소에 작업 action을 수행
 *            : void replaceAll(BiFunction<K, V, V> f)         -> 모든 요소에 치환작업 f를 수행
 */
public class lambda_sec11 {
}
