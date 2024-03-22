package me.yoosup.Java_Week3.class_and_object;

// 차에는 색, 가격, 모델 이름이 있다.
// 차에는 불을 키거나, 엑셀을 밟거나, 브레이크를 밟을 수 있다.
// 차에는 또다른 객체인 문, 의자를 가지고 있다.

public class Car {
    String color;
    int price;
    String model;
    boolean light;
    boolean brake;
    int accel;

    Door door = new Door();
    Chair chair = new Chair();

    public Car() {};

    public void onofflight() {
        light = !light;
    }
    public void getBrake() {
        System.out.println(brake);
    }
    public int getAccel(int kmh) {
        accel = kmh;
        return accel;
    }

    public static void main(String[] args) {
        Car car1 = new Car();

        car1.getAccel(10);

        System.out.println(car1.accel);
        car1.getBrake();

        System.out.println(car1.chair);
        System.out.println(car1.door);

    }
}
