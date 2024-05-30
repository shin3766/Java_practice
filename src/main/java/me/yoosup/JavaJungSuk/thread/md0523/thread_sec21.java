package me.yoosup.JavaJungSuk.thread.md0523;

/**
 * 쓰레드의 실행제어 하이라이트
 * 1. 쓰레드의 실행제어가 중요한 이유
 * 2. 쓰레드의 스케줄링과 관련된 메서드
 */

/**
 * 쓰레드 프로그래밍은 동기화와 스케줄링 때문에 어렵다.
 * 우선순위를 통해 쓰레드간의 스케줄링을 배웠지만 이는 쓰레드 프로그래밍을 하기위해선 한참 부족하다.
 *
 * ****
 * 효율적인 멀티쓰레드 프로그램을 만들기 위해서는 보다 정교한 스케줄링을 통해 프로세스에게 주어진 자원과 시간을 여러 쓰레드가 낭비없이
 * 잘 사용하도록 프로그래밍 해야 한다.
 * ****
 *
 * sleep(), join(), interrupt(), yield(), {stop(), suspend(), resume()} 이 셋은 deprecated되었다.(데드락 문제를 자주 야기하기 때문)
 *
 */

public class thread_sec21 {
    /**
     * 1. 지정된 시간 동안 쓰레드를 일시정지시킨다.
     * 2. 지정한 시간이 지나고 나면, 자동적으로 다시 실행대기상태가 된다.
     */
    // static void sleep(long millis)
    // static void sleep(long millis, int nanos)

    /**
     * 지정된 시간동안 쓰레드가 실행하도록 한다.지정된 시간이 지나거나 작업이 종료되면 join()을 호출한 쓰레드로 다시 돌아와 실행을 계속한다.
     */
//    void join()
//    void join(long millis)
//    void join(long millis, int nanos)

    /**
     * sleep()이나 join()에 의해 일시 정지상태인 쓰레드를 실행대기상태(runnable)로 만든다.
     * 해당 쓰레드에서는 Interrupted Exception이 발생함으로써 일시정지 상태를 벗어난다.
     */
    // void interrupt()

    /**
     * 쓰레드 즉시 종료
     */
    // void stop()

    /**
     * 쓰레드 일시정지. resume()을 호출해 실행대기로 할수 있다.
     */
    // void suspend()

    /**
     * suspend에 의해 일시정지상태에 있는 쓰레드 실행 대기 상태
     */
    // void resume()

    /**
     * 실행 중에 자신에게 주어진 실행시간을 다음 차례의 쓰레드에게 양보하고 자신은 실행대기상태가 된다.
     */
    // static void yield()

}
