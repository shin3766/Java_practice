package me.yoosup.JavaJungSuk.thread.md0523;

/**
 * sec20 :: 쓰레드의 상태 하이라이트
 * 쓰레드는 생성된 후부터 종료될 때까지 여러 상태를 가질 수 있다.
 * New :: 쓰레드가 생성 & start() 호출 전 상태
 * Runnable :: 실행중 또는 실행 가능 상태
 * Blocked :: 동기화 블럭에 의해서 일시정지된 상태 (lock이 풀릴때까지 대기)
 * Waiting :: 쓰레드의 작업이 종료되지는 않았지만 실행할 수 없는 일시정지 상태
 * Timed_Waiting :: 작업이 종료되지는 않았지만 일시정지시간이 지정된 경우 일시정지 상태
 * Terminated :: 쓰레드가 종료된 상태
 */

/** 복습문제 1 ::
 * 쓰레드의 상태를 그림으로 그려보아라
 *
 */

public class thread_sec20 {
    /** 쓰레드 실행과 상태 순서
     * 1. new 키워드로 쓰레드를 생성하고 start()를 호출하면 queue와 같은 구조의 실행 대기열에서 자신의 차례를 기다린다.
     * 2. 실행대기상태(runnable)에 있다가 자신의 차례에 실행된다.
     * 3. 주어진 실행 시간이 다되거나 yield()를 만나면 실행대기상태(runnable)가 되고 다음 차례의 쓰레드가 실행된다.
     * 4. 실행중에 suspend(), sleep(), wait(), join(), I/O block에 의해 일시정지상태가 될 수 있다.
     * 5. 지정된 일시정지시간이 다되거나(time-out), notify(), resume(), interrupt()가 호출되면 일시정지상태를 벗어나 다시 실행대기열에 저장되어 자신의 차례를 기다리게 된다.
     * 6. 실행을 모두 마치거나 stop()이 호출되면 쓰레드는 소멸(terminated)된다.
     *
     */

}
