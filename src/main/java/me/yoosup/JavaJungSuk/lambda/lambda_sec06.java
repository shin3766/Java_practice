package me.yoosup.JavaJungSuk.lambda;

/**
 * 함수형 인터페이스 타입의 매개변수, 반환타입
 *
 * 람다식을 참조변수로 다룰 수 있다는 것은 메서드를 통해 람다식을 주고 받을수 있다는 것을 의미함. 즉, 람다식을 변수처럼 메서드를 주고받는것이 가능함
 * -> 람다식을 사용하면 예전보다 코드가 더 간결하고 이해하기 쉬워짐
 */
public class lambda_sec06 {

    // 함수형 인터페이스가 정의되어있을때,
    @FunctionalInterface
    interface MyFunction {
        void myMethod();
    }

    // 메서드의 매개 변수가 MyFunction 타입이면, 이 메서드를 호출할 때 람다식을 참조하는 참조변수를 매개 변수로 지정해야한다.
//    void aMethod(Myfunction f) {
//        f.myMethod();
//    }

//    Myfunction f = () -> System.out.println("myMethodo()");
    //aMethod(f);

    // 또는, 아래와 값이 람다식을 매개변수로 넣어줄수 있다.
    /**
     * aMethod(() -> System.out.println("myMethodo()");
     */

    // 메서드의 반환 타입이 함수형 인터페이스타입이라면,
    // 이 함수형 인터페이스의 추상메서드와 동등한 람다식을 가리키는 참조변수를 반환하거나 람다식을 직접 반환할 수 있음
    // MyFunction myMethod() {
    //      Myfunction f = () -> {};
    //      return f;                   // 이줄과 윗울을 한줄로 줄이면, return () -> {};
    // }


}
