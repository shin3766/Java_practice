package me.yoosup.JavaJungSuk.thread.md0523;

/**
 * sleep() 하이라이트
 * 1. sleep()의 활용
 * 2. sleep()의 응용
 */

/**
 * sleep()은 지정된 시간동안 쓰레드를 멈추게한다.
 * 밀리세컨드, 나노세컨의 시간단위로 세밀하게 값을 지정할 수 있지만 어느정도 오차가 발생할 수 있다.
 * 예를 들어, 0.0015초만 쓰레드를 멈추려면 다음과 같이 작성한다.
 * -> try {
 *     Thread.sleep(1, 500000)
 * } catch(InterruptedException) {}
 *
 * sleep() 상태에서 벗어나는 방법은
 * 1. interrupt() 메서드 호출
 * 2. 지정된 시간 경과
 *
 * 꿀팁!
 * sleep()을 사용할 때는 항상 try-catch문을 사용해야 함으로, 이를 메서드화 해서 사용하면 try-catch를 반복하지 않아도 된다.
 * -> void delay() {
 *     Thread.sleep(1000);
 * } catch(InterruptedException e) {}
 * }
 *
 */

public class thread_sec22 {
    // static void sleep(long millis)
    // static void sleep(long millis, int nanos)
}
