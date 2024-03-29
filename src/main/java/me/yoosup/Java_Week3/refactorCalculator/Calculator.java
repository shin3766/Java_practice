package me.yoosup.Java_Week3.refactorCalculator;

public class Calculator {

    private final AddOperation addOperation;
    private final SubtractOperation subtractOperation;
    private final MultiplyOperation multiplyOperation;
    private final DivideOperation divideOperation;

    public Calculator(AddOperation addOperation, SubtractOperation subtractOperation,
                      MultiplyOperation multiplyOperation, DivideOperation divideOperation) {
        this.addOperation = addOperation;
        this.subtractOperation = subtractOperation;
        this.multiplyOperation = multiplyOperation;
        this.divideOperation = divideOperation;
    }

    public double calculate(String operator, int a, int b) {
        double answer = 0;

        if (operator.equals("+")) {
            return addOperation.operate(a, b);
        } else if (operator.equals("-")) {
            return subtractOperation.operate(a, b);
        } else if (operator.equals("*")) {
            return multiplyOperation.operate(a, b);
        } else if (operator.equals("/")) {
            return divideOperation.operate(a, b);
        } else {
            System.out.println("잘못된 값입니다.");
            return answer;
        }
    }

    public static void main(String[] args) {
        Calculator cc = new Calculator(new AddOperation(), new SubtractOperation(),
                new MultiplyOperation(), new DivideOperation());

        System.out.println(cc.calculate("+", 3, 7));
        System.out.println(cc.calculate("-", 3, 7));
        System.out.println(cc.calculate("*", 3, 7));
        System.out.println(cc.calculate("/", 3, 7));
    }
}

