package test;


public class AddOperation implements Operation {
    // 단일 책임
    @Override
    public double operate(int num1, int num2) {
        return num1 + num2;
    }
}
