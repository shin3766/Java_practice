package me.yoosup.Java_Week5;

public class YesSynchronized {
    public static void main(String[] args) {
        AppleStore1 appleStore = new AppleStore1();

        Runnable task = () -> {
            while (appleStore.getStoredApple() > 0) {
                appleStore.eatApple();
                System.out.println("남은 사과의 수 = " + appleStore.getStoredApple());
            }

        };

        for (int i = 0; i < 3; i++) {
            new Thread(task).start();
        }
    }
}

class AppleStore1 {
    private int storedApple = 10;

    public int getStoredApple() {
        return storedApple;
    }

    public void eatApple() {
        synchronized (this) {
            if(storedApple > 0) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                storedApple -= 1;
            }
        }
    }
}