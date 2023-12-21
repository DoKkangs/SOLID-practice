package test;

public class DivideOperation implements Operation {
    @Override
    public double operate(int num1, int num2) {
        return (double) num1 / num2;
    }
}
