package me.yoosup.Java_Week3.absractCalculator;

import me.yoosup.Java_Week3.refactorCalculator.AbstractOperation;
import me.yoosup.Java_Week3.refactorCalculator.AddOperation;
import me.yoosup.Java_Week3.refactorCalculator.MultiplyOperation;

public class Calculator {

    private AbstractOperation abstractOperation;

    public Calculator(AbstractOperation abstractOperation) {
        this.abstractOperation = abstractOperation;
    }

    public void setAbstractOperation(AbstractOperation abstractOperation) {
        this.abstractOperation = abstractOperation;
    }

    public double calculate(int a, int b) {
        double answer;
        answer = abstractOperation.operate(a, b);
        return answer;
    }

    public static void main(String[] args) {
        Calculator cc = new Calculator(new AddOperation());
        System.out.println(cc.calculate(10, 20));

        cc.setAbstractOperation(new MultiplyOperation());
        System.out.println(cc.calculate(10, 20));
    }
}

