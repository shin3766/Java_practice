package me.yoosup.Java_Week5.LambdaStream;

import java.util.ArrayList;
import java.util.List;

public class ExampleSource {
    public static void main(String[] args) {
        ArrayList<Car> carsWantToPark = new ArrayList<>();
        ArrayList<Car> parkingLot = new ArrayList<>();

        Car car1 = new Car("Benz", "Class E", true, 0);
        Car car2 = new Car("BMW", "Series 7", false, 100);
        Car car3 = new Car("BMW", "X9", false, 0);
        Car car4 = new Car("Audi", "A7", true, 0);
        Car car5 = new Car("Hyundai", "Ionic 6", false, 10000);

        carsWantToPark.add(car1);
        carsWantToPark.add(car2);
        carsWantToPark.add(car3);
        carsWantToPark.add(car4);
        carsWantToPark.add(car5);

        parkingLot.addAll(parkingCarWithTicket(carsWantToPark));
        parkingLot.addAll(parkingCarWithMoney(carsWantToPark));


        for (Car car : parkingLot) {
            System.out.println("Parked Car : " + car.getCompany() + "-" + car.getModel());
        }


    }

    public static List<Car> parkingCarWithTicket(List<Car> carsWantToPark) {
        ArrayList<Car> cars = new ArrayList<>();

        for (Car car : carsWantToPark) {
            if (car.hasParkingTicket()) {
                cars.add(car);
            }
        }

        return cars;
    }

    public static List<Car> parkingCarWithMoney(List<Car> carsWantToPark) {
        ArrayList<Car> cars = new ArrayList<>();

        for (Car car : carsWantToPark) {
            if (!car.hasParkingTicket() && car.getParkingMoney() > 1000) {
                cars.add(car);
            }
        }

        return cars;
    }
}

class Car {
    private final String company; // 자동차 회사
    private final String model; // 자동차 모델

    private final boolean hasParkingTicket;
    private final int parkingMoney;

    public Car(String company, String model, boolean hasParkingTicket, int parkingMoney) {
        this.company = company;
        this.model = model;
        this.hasParkingTicket = hasParkingTicket;
        this.parkingMoney = parkingMoney;
    }

    public String getCompany() {
        return company;
    }

    public String getModel() {
        return model;
    }

    public boolean hasParkingTicket() {
        return hasParkingTicket;
    }

    public int getParkingMoney() {
        return parkingMoney;
    }
}