package me.yoosup.Java_Week4;

import me.yoosup.Java_Week3.refactorCalculator.AddOperation;
import me.yoosup.Java_Week3.refactorCalculator.DivideOperation;
import me.yoosup.Java_Week3.refactorCalculator.MultiplyOperation;
import me.yoosup.Java_Week3.refactorCalculator.SubtractOperation;

import java.util.regex.Pattern;

public class Parser {
    private static final String OPERATION_REG = "[+\\-*/]";
    private static final String NUMBER_REG = "^[0-9]*$";

    private final Calculator calculator = new Calculator();

    public Parser parseFirstNum(String firstInput) throws Exception {
        // 구현 1.
        if (!Pattern.matches(NUMBER_REG, firstInput)) {
            throw new BadInputException(firstInput);
        }
        calculator.setFirstNumber(Integer.parseInt(firstInput));
        return this;
    }

    public Parser parseSecondNum(String secondInput) throws Exception {
        // 구현 1.
        if (!Pattern.matches(NUMBER_REG, secondInput)) {
            throw new BadInputException(secondInput);
        }
        calculator.setSecondNumber(Integer.parseInt(secondInput));
        return this;
    }

    public Parser parseOperator(String operationInput) throws Exception {
        // 구현 1.
        if (!Pattern.matches(OPERATION_REG, operationInput)) {
            throw new BadInputException(operationInput);
        }

        switch (operationInput) {
            case "+" -> this.calculator.setOperation(new AddOperation());
            case "-" -> this.calculator.setOperation(new SubtractOperation());
            case "*" -> this.calculator.setOperation(new MultiplyOperation());
            case "/" -> this.calculator.setOperation(new DivideOperation());
        }
        return this;
    }

    public double executeCalculator() {
        return calculator.calculate();
    }
}