package me.yoosup.Java_Week3.calculator;

public class Calculator {
    /*
    - Calulator 클래스는 연산을 수행하는 반환타입이 double 인 calculate 메서드를 가지고 있습니다.
            - calculate 메서드는 String 타입의 operator 매개변수를 통해 연산자 매개값을 받습니다.
            - int 타입의 firstNumber, secondNumber 매개변수를 통해 피연산자 값을 받습니다.
            - calculate 메서드는 전달받은 피연산자, 연산자를 사용하여 연산을 수행합니다.
            */
    public double calculate(String operator, int firstNumber, int secondNumber) {
        switch (operator) {
            case "+" -> {
                return firstNumber + secondNumber;
            }
            case "-" -> {
                return firstNumber - secondNumber;
            }
            case "*" -> {
                return firstNumber * secondNumber;
            }
            case "/" -> {
                return (double) firstNumber / secondNumber;
            }
            case "%" -> {
                return firstNumber % secondNumber;
            }
            default -> {
                System.out.println("잘못된 접근입니다.");
                return 0;
            }
        }
    }

    public static void main(String[] args) {
        Calculator cc = new Calculator();

        System.out.println(cc.calculate("+", 3 , 7));
        System.out.println(cc.calculate("-", 3 , 7));
        System.out.println(cc.calculate("*", 3 , 7));
        System.out.println(cc.calculate("/", 3 , 7));
        System.out.println(cc.calculate("%", 3 , 7));
    }

}
