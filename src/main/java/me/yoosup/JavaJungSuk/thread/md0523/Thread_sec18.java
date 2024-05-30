package me.yoosup.JavaJungSuk.thread.md0523;

/**
 * Chapter13 sec 18의 하이라이트
 *  1. 데몬 쓰레드의 정의
 *  2. 데몬 쓰레드 작성방법
 *  3. 데몬 쓰레드 특징
 *  4. 데몬 쓰레드 관련 메서드; isDaemon(), setDaemon(boolean on)
 */

/**
 * 1. 데몬 쓰레드의 정의
 * 데몬 쓰레드는 일반적인 쓰레드를 도와주는 보조적인 쓰레드이다.
 * 일반 쓰레드가 종료되면 강제적으로 자동 종료된다.
 * 예) 가비지 컬렉터, 워드프로세서 자동저장, 화면자동갱신
 *
 * 2, 3. 데몬 쓰레드 작성 방법, 특징
 * 데몬쓰레드는 무한루프와 조건문을 이용해서 실행후 대기하고 있다가 특정 조건이 만족되면 작업을 수행하고 다시 대기하도록 작성합니다.
 * 일반 쓰레드의 작성방법과 실행방법이 같으며 쓰레드를 생성한 다음 실행하기전에 setDaemon(true)를 호출하기만하면 된다.
 *
 * 4. isDaemon() -> 데몬쓰레드인지 여부판단. 데몬쓰레드이면 true
 *    void setDaemon(boolean on) -> 쓰레드를 데몬 쓰레드로 또는 사용자 쓰레드로 변경한다.
 */

public class Thread_sec18 {
    /*
    * 데몬쓰레드
    * public void run()  {
    *   while(true) {
    *       try {
    *           Thread.sleep(3*1000); // 3초마다
    *       } catch (InterruptedException e) {}
    *     if(autoSave) autoSave();
    *   }
    *
    * }
    *
    * */
}
