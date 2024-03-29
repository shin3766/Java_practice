package me.yoosup.Java_Week3.refactorCalculator;

public class DivideOperation extends AbstractOperation{

    @Override
    public double operate(int a, int b) {
        return (double)a / b;
    }
}
