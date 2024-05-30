package me.yoosup.JavaJungSuk.thread.md0523;

/**
 * Chapter13 sec 19의 하이라이트
 * 1. isDaemon(), setDaemon(boolean on) 메서드 실행확인
 * 2. 데몬쓰레드가 동작하는 순서
 * 3. 데몬쓰레드가 아니라 일반 쓰레드였을 경우 예상
 */

/**
 * 1. t.setDaemon(true)를 통해 쓰레드에 데몬쓰레드를 사용할 것임을 명시했다.
 * 2. t.setDaemon(true)는 t.start()보다 빨리 호출해야한다. -> 그렇지 않으면 IllegalThreadStateException발생
 * 3. 예상 ::
 *    아래의 데몬쓰레드는 3초마다 autoSave의 값을 확인해서 true이면 자동저장한다.
 *    하지만 t.setDaemon(treu)가 없다면 프로그램을 강제종료하지 않으면 영원히 종료되지 않을 것이다.
 * 
 * 
 */

public class Thread_sec19 implements Runnable {
    static boolean autoSave = false;

    public static void main(String[] args) {
        Thread t = new Thread(new Thread_sec19());
        t.setDaemon(true);
        t.start();

        for (int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            System.out.println(i);

            if (i == 5) autoSave = true;
        }
    }

    public void run() {
        while (true) {
            try {
                Thread.sleep(3 * 1000); // 3초마다
            } catch (InterruptedException e) {
            }
            if (autoSave) autoSave();
        }
    }

    public void autoSave() {
        System.out.println("작업파일이 자동저장되었습니다.");
    }
}
